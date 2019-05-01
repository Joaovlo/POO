import java.util.Scanner;

public class Questao_12 {

	public static void main(String[] args) {
		// Media dos valores em um vetor
		
		Scanner sc = new Scanner(System.in);
		
		float vetor[] = new float[10];
		//float media = 0; sem uso
		float soma = 0; 
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			//soma += vetor[i]; // tentativa [1]
			soma = soma + vetor[i]; // tentativa [3] [ok]
			//media = vetor[i] + vetor[i] / 10; // tentaviva [2]
			// está somando corretamente??
			
		}
		System.out.println("A media dos valores é: " + soma / 10);
	}

}
