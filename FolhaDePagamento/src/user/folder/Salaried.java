package user.folder;

import java.util.Scanner;

public class Salaried extends Employee {

	private float atualSalary;

	public Salaried(int allEmployees) {
		super(allEmployees);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o salário mensal do empregado");
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
		System.out.println("Endereço: "+this.getAddress());
		System.out.println("Número de Empregado: "+this.getEmployeeNumber());
		System.out.println("Salário: "+this.getAtualSalary());
		System.out.println("Sindicalizado? "+this.isSyndicated());
		System.out.println("Número de Sindicato: "+this.getSyndicateNumber());
		System.out.println("Taxa de Sindicato: "+this.getSyndicateTax());
		return "\n";
	}
}
