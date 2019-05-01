import java.util.Scanner;

public class Questao_9 {

	public static void main(String[] args) {
		// Numeros
		Scanner sc = new Scanner(System.in);
		
		int calculo;
		System.out.println("Digite o primeiro numero: ");
		int numero_1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero_2 = sc.nextInt();
		calculo = (numero_1 + numero_2) * numero_1;
		
		System.out.println("Resultado: " + calculo);
	}

}
