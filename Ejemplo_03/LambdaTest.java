public class LambdaTest{
    public static void main(String [] args){
	//Expresión lambda ==> representa un objeto de una interfaz funcioal
	Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
	
	op.imprimeSuma(5, 10);
    } 	  	 
} 