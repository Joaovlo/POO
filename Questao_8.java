import java.util.Scanner;

public class Questao_8 {

	public static void main(String[] args) {
		// Sequencia de Fibonacci
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
		// n-ésimo da sequencia de fibonacci
		Scanner sc = new Scanner(System.in);
		int quantidade;
		
		System.out.println("Digite a quantidade de numeros que deseja: ");
		quantidade = sc.nextInt();
		for(int a = 0, b = 1, i = 0; i < quantidade; b += a, a = b-a, i++) {
			System.out.print(a + " ");
		}
	}

}
