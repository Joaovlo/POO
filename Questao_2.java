import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
		// Digite os preços da gasolina e do etanol e direi qual é melhor para abastecer
		Scanner sc = new Scanner(System.in);
		
		float calculo_1; // receberá os valores da gasolina e do etanol
		System.out.println("Digite o preço da gasolina: ");
			float gasolina = sc.nextFloat();
		
		System.out.println("Digite o preço do etanol: ");
			float etanol = sc.nextFloat();
		
		calculo_1 = etanol / gasolina;
		
		if(calculo_1 <= 0.7) {
			System.out.println("Melhor abastecer com Etanol");
		}else{
			System.out.println("Melhor abastecer com Gasolina");
		}
		
		
	}

}
