import java.util.List;

public class FP_Functional_01{
	public static void main(String[] args){
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		System.out.println("Using to --> [System.out::print] by default");
		printAllNumbersInListFunctional_Two(numbers);
		System.out.println("\nprintAllNumbersInListFunctional: ");
		printAllNumbersInListFunctional(numbers);
		System.out.println("\nprintEvenNumbersInListFunctional: ");
		printEvenNumbersInListFunctional(numbers);
		System.out.println("\nprintSquareOfEvenNumbersInListFunctional: ");
		printSquareOfEvenNumbersInListFunctional(numbers);
		System.out.println("");
	}
	private static void print(int number){
		System.out.print(number + ",");
	}
	private static boolean isEven(int number){
		return (number%2==0);
	}
	private static void printAllNumbersInListFunctional_Two(List<Integer> numbers){
		numbers.stream()
		.forEach(System.out::print);
		System.out.println("");
	}
	private static void printAllNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
		.forEach(FP_Functional_01::print);
		System.out.println("");
	}
	private static void printEvenNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
		.filter(FP_Functional_01::isEven)
		.forEach(FP_Functional_01::print);
		System.out.println("");
	}
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()
		.filter(number->number%2==0)
		.map(number->number*number)
		.forEach(FP_Functional_01::print);
		System.out.println("");
	}
}