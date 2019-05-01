import java.util.Scanner;

public class Questao_16 {

	public static void main(String[] args) {
		// Ler valores
		
		Scanner sc = new Scanner(System.in);
		
		int valor_n = 0;
		
		System.out.println("Digite um numero: ");
		valor_n = sc.nextInt();
		
		for(int i = valor_n; i >= 0; i--) { // decremento
			System.out.print(i + " ");
			
		}
		
		


	}

}
