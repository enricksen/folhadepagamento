package user.folder;

import java.util.Scanner;

public class Commissioned extends Employee {
	private float atualSalary;
	private float comissionValue;
	private int allSales;

	public Commissioned(int allEmployees) {
		super(allEmployees);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o salário referente as primeiras duas semanas do empregado");
		this.atualSalary = input.nextFloat();
		System.out.println("Digite o valor de sua comissão por vendas (em porcentagem");
		this.comissionValue = input.nextFloat();
		System.out.println("Empregado cadastrado com sucesso");
	}

	public float getAtualSalary() {
		return atualSalary;
	}
	public void setAtualSalary(float atualSalary) {
		this.atualSalary = atualSalary;
	}
	public int getAllSales() {
		return allSales;
	}

	public void setAllSales(int allSales) {
		this.allSales = allSales;
	}

	public float getComissionValue() {
		return comissionValue;
	}
	public void setComissionValue(float comissionValue) {
		this.comissionValue = comissionValue;
	}

	@Override
	public String toString() {
		System.out.println("Nome: "+this.getName());
		System.out.println("Tipo: Comissionario");
		System.out.println("Endereço: "+this.getAddress());
		System.out.println("Número de Empregado: "+this.getEmployeeNumber());
		System.out.println("Salário: "+this.getAtualSalary());
		System.out.println("Comissão: "+this.getComissionValue());
		System.out.println("Sindicalizado? "+this.isSyndicated());
		System.out.println("Número de Sindicato: "+this.getSyndicateNumber());
		System.out.println("Taxa de Sindicato: "+this.getSyndicateTax());
		return "\n";
	}
}
