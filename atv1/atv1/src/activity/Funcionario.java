/*Descrição:
Você foi contratado para desenvolver um sistema de gerenciamento de funcionários para uma
empresa. Cada funcionário possui um nome, um número de identificação (ID) e um salário
base. Além disso, existem diferentes tipos de funcionários, cada um com suas características
específicas.

Tarefas:
Defina uma classe abstrata chamada Funcionario com os seguintes atributos e métodos:

Atributos:
nome (String): para armazenar o nome do funcionário.
id (int): para armazenar o número de identificação do funcionário.
salarioBase (double): para armazenar o salário base do funcionário.
Métodos:
Construtor que inicializa os atributos.
Métodos getters e setters para os atributos.
Método abstrato calcularSalario(), que deve ser implementado nas subclasses.
Crie duas subclasses de Funcionario: Gerente e Operario com as seguintes características:

Gerente:
Possui um atributo adicional bonus (double) que representa o bônus anual recebido.
Implementa o método calcularSalario() para calcular o salário total, que é o salário base mais o
bônus.
Operario:
Possui um atributo adicional horasTrabalhadas (int) que representa o número de horas
trabalhadas no mês.
Possui um atributo adicional valorHora (double) que representa o valor pago por hora
trabalhada.
Implementa o método calcularSalario() para calcular o salário total, que é o salário base mais o
valor das horas trabalhadas multiplicado pelo valor da hora.
Crie uma classe Main com o método main() para testar o sistema. Na classe Main, crie
instâncias de Gerente e Operario, defina valores para seus atributos e exiba o salário total de
cada funcionário.

Requisitos:
Utilize o conceito de herança para reutilizar código comum entre as classes.
Utilize modificadores de acesso apropriados para garantir o encapsulamento.
Utilize a classe Scanner para obter entrada do usuário para definir valores dos atributos das
classes Gerente e Operario.*/
package activity;

public abstract class Funcionario {
	
	private String nome;
	private int id;
	private double salarioBase;
	
	
	public Funcionario(String nome, int id, double salarioBase) {
		
		this.nome = nome;
		this.id = id;
		this.salarioBase = salarioBase;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract double CalcularSalario(); 
	
	
	
	

}
