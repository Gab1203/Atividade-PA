package activity;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Digite o nome do operário:");
		String OpNome = scanner.nextLine();
		System.out.println("Digite o id do operário:");
		int OpId = scanner.nextInt();
		System.out.println("Digite o salário base do operário:");
		double OpSalarioBase = scanner.nextDouble();
		System.out.println("Digite as horas trabalhadas do operário:");
		int opHorasTrabalhadas = scanner.nextInt();
		System.out.println("Digite o valor hora do operário:");
		double opValorHora = scanner.nextDouble();
		//System.out.print("\n");
		
		System.out.println("Digite o nome do gerente:");
		String GerNome = scanner.next();
		System.out.println("Digite o id do gerente:");
		int GerId = scanner.nextInt();
		System.out.println("Digite o salário base do operário:");
		double GerSalarioBase = scanner.nextDouble();
		System.out.println("Digite o valor do bônus do gerente:");
		double GerBonus = scanner.nextDouble();
		
		
		Operario operator = new Operario(OpNome, OpId, OpSalarioBase, opHorasTrabalhadas, opValorHora);
		System.out.printf("Salário total do operário: R$ %.2f", operator.CalcularSalario()) ;
		System.out.print("\n");
		
		Gerente gerente = new Gerente(GerNome, GerId, GerSalarioBase, GerBonus);
		System.out.printf("Salário total do operário: R$ %.2f", gerente.CalcularSalario()) ;
		
	}

}
