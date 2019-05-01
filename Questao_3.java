import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		// número maior entre 7 números
		Scanner sc = new Scanner(System.in);
		
		int valor_menor = 0; // comparador menor
		int valor_maior = 0; // comparador maior
		// com testes feito fiz o vetor de 8 posicoes
		// e .length-1 para dar no total de 7 posicoes
		int vetorzin[] = new int[8]; // vetor dos *7* numeros
		System.out.println("Digite valores: ");
		for(int i = 0; i < vetorzin.length-1; i++) {
			vetorzin[i] = sc.nextInt();
			
			if(valor_menor == 0 && valor_maior == 0) {
				valor_menor = vetorzin[i]; // atribuindo valores para as variaveis auxiliadoras
				valor_maior = vetorzin[i];
				
			}
			
			if(valor_menor > vetorzin[i]) {
				valor_menor = vetorzin[i];
				
			}
			
			if(valor_maior < vetorzin[i]) {
				valor_maior = vetorzin[i];
			}
		}
		System.out.println("Menor: " + valor_menor);
		System.out.println("Maior: " + valor_maior);
		
		

		}
		
		

	}


