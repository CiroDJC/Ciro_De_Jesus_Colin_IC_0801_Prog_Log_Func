public class LambdaTest{
    public static void main(String [] args){
	//Expresión lambda ==> representa un objeto de una interfaz funcioal
	FunctionTest ft = () -> System.out.println("Hola mundo"); //Implementación del método abstracto "saludar()"
								 //de la Interfaz Funcional
	//ft.saludar();

	LambdaTest objeto = new LambdaTest();
	objeto.miMetodo(ft);
    }
    
    public void miMetodo(FunctionTest parametro){
    	parametro.saludar();
    } 	  	 
} 