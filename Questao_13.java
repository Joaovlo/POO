import java.util.Scanner;

public class Questao_13 {

	public static void main(String[] args) {
		// Vetor original e vetor invertido
		
		Scanner sc = new Scanner(System.in);
		
			int vetor_original[] = new int[10];
			int tamanho = vetor_original.length; // representa o tamnho do original "referencia"
			int vetor_invertido[] = new int[tamanho];
		System.out.println("Digite 10 numeros: ");
			for(int i = 0; i < tamanho; i++) {
				vetor_original[i] = sc.nextInt();
			
			}
				System.out.println("Vetor original: ");
			for(int j = 0; j < tamanho; j++) {
				System.out.print(" " + vetor_original[j]); // exibe o vetor original
			}
		
				System.out.println("\n"); // pulando linhas
				System.out.println("\n");
			
				System.out.println("Vetor invertido: ");
			for(int i = 0; i < vetor_invertido.length; i++) {
				tamanho--; // importante
				vetor_invertido[i] = vetor_original[tamanho];
				System.out.print(" "+ vetor_invertido[i]); // exibe o vetor invertido
			}
		
	}		
}
