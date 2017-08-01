package user.folder;

import java.util.Scanner;

public class Salaried extends Employee {

	private float atualSalary;

	public Salaried(int allEmployees) {
		super(allEmployees);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o sal�rio mensal do empregado");
		this.atualSalary = input.nextFloat();
		System.out.println("Empregado cadastrado com sucesso");
	}

	public float getAtualSalary() {
		return atualSalary;
	}

	public void setAtualSalary(float atualSalary) {
		this.atualSalary = atualSalary;
	}

	@Override
	public String toString() {
		System.out.println("Nome: "+this.getName());
		System.out.println("Tipo: Assalariado");
		System.out.println("Endere�o: "+this.getAddress());
		System.out.println("N�mero de Empregado: "+this.getEmployeeNumber());
		System.out.println("Sal�rio: "+this.getAtualSalary());
		System.out.println("Sindicalizado? "+this.isSyndicated());
		System.out.println("N�mero de Sindicato: "+this.getSyndicateNumber());
		System.out.println("Taxa de Sindicato: "+this.getSyndicateTax());
		return "\n";
	}
}
