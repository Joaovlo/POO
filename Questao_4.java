import java.util.Scanner;

public class Questao_4 {

	public static void main(String[] args) {
		// Media
		Scanner sc = new Scanner(System.in);
		// maneira mais lenta
		// maneira mais rápida: com vetor
		int calculo;
		System.out.println("Digite um numero: ");
		int numero_1 = sc.nextInt();
		System.out.println("Digite um numero: ");
		int numero_2 = sc.nextInt();
		System.out.println("Digite um numero: ");
		int numero_3 = sc.nextInt();
		System.out.println("Digite um numero: ");
		int numero_4 = sc.nextInt();
		System.out.println("Digite um numero: ");
		int numero_5 = sc.nextInt();
		calculo = (numero_1 + numero_2 + numero_3 + numero_4 + numero_5) / 5;
		System.out.println("Resultado da média: " + calculo);


	}

}
