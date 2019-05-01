import java.util.Scanner;

public class Questao_10 {

	public static void main(String[] args) {
		// Vetores par e ímpar
		
		int vetor_par[] = new int[10]; // colocar numeros pares
		int vetor_impar[] = new int[10]; // colocar numeros impares
		int numeros[] = new int[10]; // armazena os numeros que o usuario insere
		
		int posicao_par = 0;
		int posicao_impar = 0;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < numeros.length; i++) {
				numeros[i] = sc.nextInt(); 
			
			if(numeros[i] % 2 == 0) {
				vetor_par[posicao_par] = numeros[i];
				posicao_par++;
			}else {
				vetor_impar[posicao_impar] = numeros[i];
				posicao_impar++;

			}	
			 	// System.out.println(numeros); teste [ok]
			}
		
			System.out.println("Vetor Par: ");
		for(int i = 0; i <= vetor_par.length; i++) {
			if(vetor_par[i] == 0) {
				break;
			}
			System.out.print(" " + vetor_par[i] +" ");
		}
		
			System.out.println("\n");
			System.out.println("Vetor ímpar: ");
		for(int i = 0; i <= vetor_impar.length; i++) {
			if(vetor_impar[i] == 0) {
				break;
			}
			System.out.print(" " + vetor_impar[i] + " ");
		}


	}

}
