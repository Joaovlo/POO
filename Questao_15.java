import java.util.Scanner;

public class Questao_15 {

	public static void main(String[] args) {
		// Salario
		
		Scanner sc = new Scanner(System.in);
		
		double salario_fixo; // tipo variavel double
		double valor_vendas;
		double calculo;
		
		System.out.println("Digite seu salário fixo: ");
		salario_fixo = sc.nextInt();
		System.out.println("Digite o valor das suas vendas: ");
		valor_vendas = sc.nextInt();
		
		if(valor_vendas <= 1500) { // até 1500
			calculo = salario_fixo + (salario_fixo * 0.3); // 3% de comissao
		}else {
			calculo = salario_fixo + (salario_fixo * 0.5); // 5% se ultrapassar
		}
		
		System.out.println("Seu salário total é de: " + calculo);
	}

}
