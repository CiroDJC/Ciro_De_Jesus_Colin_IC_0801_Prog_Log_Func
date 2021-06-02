import java.util.List;

public class FP_Functional_Exercises{
	public static void main(String[] args){
		List<Integer> numbers = List.of(12,	9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API","Microservices", "AWS", "PCF", "Azure", 
		"Docker", "Kubernetes");
		System.out.println("\nEjercicio 1");
		numerosImpares(numbers);
		System.out.println("\nEjercicio 2");
		imprimir(courses);
		System.out.println("\nEjercicio 3");
		Spring(courses);
		System.out.println("\nEjercicio 4");
		Letras(courses);
		System.out.println("\nEjercicio 5");
		cubo(numbers);
		System.out.println("\nEjercicio 6");
		Longitud(courses);
	}
	private static void printInt(int number){
		System.out.print(number + ",");
	}
	private static void printString(String txt){
		System.out.print(txt + ",");
	}
	private static void numerosImpares(List<Integer> numbers){
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.forEach(FP_Functional_Exercises::printInt);
		System.out.println("");
	}
	private static void imprimir(List<String> courses){
		courses.stream()
		.forEach(cadena -> System.out.println(cadena));
	}
	private static void Spring(List<String> courses){
		courses.stream()
		.filter(cadena -> cadena.contains("Spring"))
		.forEach(FP_Functional_Exercises::printString);
		System.out.println("");
	}
	private static void Letras(List<String> courses){
		courses.stream()
		.filter(cadena -> cadena.length()>4)
		.forEach(FP_Functional_Exercises::printString);
		System.out.println("");
	}
	private static void cubo(List<Integer> numbers){
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number->number * number * number)
		.forEach(FP_Functional_Exercises::printInt);
		System.out.println("");
	}
	private static void Longitud(List<String> courses){
		courses.stream()
		.forEach(cadena->System.out.print(cadena + ":" + cadena.length()+", "));
		System.out.println("");
	}


}