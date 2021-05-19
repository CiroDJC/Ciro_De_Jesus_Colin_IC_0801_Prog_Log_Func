public interface PruebaExamen{//Paso 1
	public default void mensajeHola(){//Paso 2
		System.out.println("3.-Hola mi nombre es: Ciro de Jesus Colin");//Paso 3 
	}
	public default void mensajeHola(String cadena){//Paso 4
		System.out.println("4.-La cadena es: " + cadena); 
	}
	public static int operacionPrueba(int num1, int num2){//Paso 5
		int suma = num1 + num2;
		return(suma);//Paso 6
	}
	public void operacionPrueba(int num1, int num2, int num3);//Paso 7
}