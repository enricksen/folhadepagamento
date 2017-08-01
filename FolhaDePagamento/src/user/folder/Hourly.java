package user.folder;

import java.util.Scanner;

public class Hourly extends Employee {
	
	private float perHour;
	
	public Hourly(int allEmployees) {
		super(allEmployees);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor da hora do empregado");
		this.setPerHour(input.nextFloat());
		System.out.println("Empregado cadastrado com sucesso");
	}

	@Override
	public String toString() {
		System.out.println("Nome: "+this.getName());
		System.out.println("Tipo: Horista");
		System.out.println("Endereço: "+this.getAddress());
		System.out.println("Valor por hora: "+this.getPerHour());
		System.out.println("Número de Empregado: "+this.getEmployeeNumber());
		System.out.println("Sindicalizado? "+this.isSyndicated());
		System.out.println("Número de Sindicato: "+this.getSyndicateNumber());
		System.out.println("Taxa de Sindicato: "+this.getSyndicateTax());
		return "\n";
	}

	public float getPerHour() {
		return perHour;
	}

	public void setPerHour(float perHour) {
		this.perHour = perHour;
	}
}
