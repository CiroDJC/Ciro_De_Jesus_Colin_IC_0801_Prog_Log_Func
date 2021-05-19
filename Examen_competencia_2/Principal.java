public class Principal {//Paso 1
	public static void main(String[] args){//Paso 2
	PruebaExamen pe  = (int num1, int num2, int num3) -> System.out.println("1.-La suma es: " + (num1 + num2 + num3));//Paso 3 y 4
	pe.operacionPrueba(1,2,3);
	System.out.println("2.-La suma es: " + PruebaExamen.operacionPrueba(2,1));//Paso 5
	pe.mensajeHola();//Paso 6
	pe.mensajeHola("EXAMEN COMPETENCIA 2");//Paso 7
	pe = (int num1, int num2, int num3) -> System.out.println("5._La suma es: " + (num1 + (num2 * num3)));//Paso 8
	pe.operacionPrueba(1,PruebaExamen.operacionPrueba(1,2),PruebaExamen.operacionPrueba(1,2));//Paso 9
	miMetodo(pe);//Paso 12
	miMetodo((int num1,int num2, int num3) -> System.out.println("7.-La suma es: " + (num1 + (num2 / num3))));//Paso 13
	pe = (int num1,int num2, int num3) -> System.out.println("8.-La suma es: " + (num1 + ((num2 * 1.0) / (num3*1.0))));//Paso 16
	miMetodo(pe, 21 ,3,5);//Paso 17
	}
	private static void miMetodo(PruebaExamen objeto){//Paso 10
		objeto.operacionPrueba(1,PruebaExamen.operacionPrueba(3,2),PruebaExamen.operacionPrueba(1,2));//Paso 11	
	} 
	private static void miMetodo(PruebaExamen objeto, int num1, int num2, int num3){//Paso 14
		objeto.operacionPrueba(num1, PruebaExamen.operacionPrueba(num2, num2), PruebaExamen.operacionPrueba(num3,num3));//Paso 15	
	} 
}