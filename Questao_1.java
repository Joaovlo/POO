// importação para o scanner (entrada de dados)
import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		// Número ímpar ou par?
		Scanner sc = new Scanner(System.in); // iniciliazação do scanner
		
		System.out.println("Digite um valor, irei dizer se é par ou impar: ");
		
			int numero = sc.nextInt(); // pegando o valor que o usuário digita
		
		if(numero % 2 == 0) {
			System.out.println("Número digitado é par");
		}else{
			System.out.println("Número digitado é impar");
		}
	}

}
