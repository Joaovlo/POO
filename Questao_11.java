import java.util.Scanner;

public class Questao_11 {

	public static void main(String[] args) {
		// Maior e menor em vetor / mesma logica da questao 3?
		// Irei usar a mesma logica da questao 3 por conta do mesmo uso de vetores na mesma
		
		Scanner sc = new Scanner(System.in);
		
		int valorMenor = 0; // comparador menor / aux
		int valorMaior = 0; // comparador maior / aux
		
		int vetor_numeros[] = new int[10];
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < vetor_numeros.length; i++) {
			
			vetor_numeros[i] = sc.nextInt();
			
			if(valorMenor == 0 && valorMaior == 0) {
				valorMenor = vetor_numeros[i]; // atribuindo valores para as variaveis auxiliadoras
				valorMaior = vetor_numeros[i];
				
			}
			
			if(valorMenor > vetor_numeros[i]) {
				valorMenor = vetor_numeros[i];
				
			}
			
			if(valorMaior < vetor_numeros[i]) {
				valorMaior = vetor_numeros[i];
			}
			
		}
		System.out.println("Número menor: " + valorMenor); // exibindo numero maior ou menor
		System.out.println("Número maior: " + valorMaior);

	}

}
