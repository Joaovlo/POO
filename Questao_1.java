// importa��o para o scanner (entrada de dados)
import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		// N�mero �mpar ou par?
		Scanner sc = new Scanner(System.in); // iniciliaza��o do scanner
		
		System.out.println("Digite um valor, irei dizer se � par ou impar: ");
		
			int numero = sc.nextInt(); // pegando o valor que o usu�rio digita
		
		if(numero % 2 == 0) {
			System.out.println("N�mero digitado � par");
		}else{
			System.out.println("N�mero digitado � impar");
		}
	}

}
