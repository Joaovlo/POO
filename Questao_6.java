import java.util.Scanner;

public class Questao_6 {

	public static void main(String[] args) {
		// Fatorial de um numero
		Scanner sc = new Scanner(System.in);
		
		int fat = 1;
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		for( int i = 2; i <= valor; i++ )
		{ 
		     fat *= i;
		}
		System.out.println( "O fatorial de " + valor + " é igual a = " + fat );
		}

	}


