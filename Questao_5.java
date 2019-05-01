import java.util.Scanner;

public class Questao_5 {

	public static void main(String[] args) {
		// Definir atletas em categorias
		// Infantil A - 5 A 7 ANOS
		// Infantil B - 8 A 11 ANOS
		// Juvenil A - 12 A 15 ANOS
		// Juvenil B - 15 a 17 ANOS
		// Adulto - Maiores de 18 anos
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Categoria: Infantil A");
		}
		if(idade >= 8 && idade <= 11) {
			System.out.println("Categoria: Infantil B");
		}
		if(idade >= 12 && idade <= 15) {
			System.out.println("Categoria: Juvenil A");
		}
		if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		}
		if(idade >= 18) {
			System.out.println("Categoria: Adulto");
		}

	}

}
