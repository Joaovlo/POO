import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
		// Digite os pre�os da gasolina e do etanol e direi qual � melhor para abastecer
		Scanner sc = new Scanner(System.in);
		
		float calculo_1; // receber� os valores da gasolina e do etanol
		System.out.println("Digite o pre�o da gasolina: ");
			float gasolina = sc.nextFloat();
		
		System.out.println("Digite o pre�o do etanol: ");
			float etanol = sc.nextFloat();
		
		calculo_1 = etanol / gasolina;
		
		if(calculo_1 <= 0.7) {
			System.out.println("Melhor abastecer com Etanol");
		}else{
			System.out.println("Melhor abastecer com Gasolina");
		}
		
		
	}

}
