import java.util.Scanner;

public class Questao_14 {

	public static void main(String[] args) {
		// Quantidade, maior, menor e media.
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		int quantidade = 0;
		int i;
		
		int valor_menor = 0;
		int valor_maior = 0;
		
		float media = 0;
		float soma = 0;
		
		System.out.println("Digite quantos numeros voce ira querer digitar: ");
		quantidade = sc.nextInt();
		System.out.println("Digite uma opcao [-1]");
		opcao = sc.nextInt();
		
		if(opcao == -1) {
			int vetor[] = new int[quantidade]; // o vetor ira receber a quantidade dos numeros que o 
			// usuario inserir
				System.out.println("__________________________________________");
				System.out.println("Você optou por " + quantidade + " numeros"); // quantidade
				System.out.println("Digite valores: ");
			for(i = 0; i < vetor.length; i++) { // maior ou menor
				vetor[i] = sc.nextInt();
				if(valor_menor == 0 && valor_maior == 0) {
					valor_menor = vetor[i]; // atribuindo valores para as variaveis auxiliadoras
					valor_maior = vetor[i]; // mesma logica questao 3!
					
				}
				
				if(valor_menor > vetor[i]) {
					valor_menor = vetor[i];
					
				}
				
				if(valor_maior < vetor[i]) {
					valor_maior = vetor[i];
				}
				
				soma = soma + vetor[i]; // inicio soma
				
			}
			System.out.println("O menor número é: " + valor_menor);
			System.out.println("O maior número é: " + valor_maior); // fim maior ou menor
			System.out.println("A media dos valores é: " + soma / quantidade );
				
				
			}
		}
		
		

	}


