import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int num1 = 0;
		int num2 = 1;
		int resultado = 0;
		System.out.println(num1);
		System.out.println(num2);
		do {
			resultado = num1 + num2;
			System.out.println(resultado);
			num1 = num2;
			num2 = resultado;
			i++;
		}while(i < 10);
	}

}
