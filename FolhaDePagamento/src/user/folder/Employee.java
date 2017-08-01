package user.folder;

import java.util.Random;
import java.util.Scanner;

public class Employee {

	private String name;
	private String address;
	private int employeeNumber;
	private boolean syndicated;
	private int syndicateNumber;
	private float syndicateTax;

	public Employee(int allEmployees) {
		super();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome do empregado");
		this.name = input.nextLine();
		System.out.println("Digite o endereço do empregado");
		this.address = input.nextLine();
		employeeNumber = ++allEmployees;
		System.out.println("O usuário faz parte do sindicato? (true or false)");
		this.syndicated = input.nextBoolean();
		if(this.syndicated) {
			System.out.println("Digite a taxa que o empregado paga ao sindicato:");
			this.syndicateTax = input.nextFloat();
			input.nextLine();
			Random id = new Random();
			this.syndicateNumber = id.nextInt();
		} else {
			this.syndicateTax = 0;
			this.syndicateNumber = 0;

		}
	}

	public boolean isSyndicated() {
		return syndicated;
	}

	public void setSyndicated(boolean syndicated) {
		this.syndicated = syndicated;
	}

	public int getSyndicateNumber() {
		return syndicateNumber;
	}

	public float getSyndicateTax() {
		return syndicateTax;
	}

	public void setSyndicateTax(String syndicateTax) {
		this.syndicateTax = Float.parseFloat(syndicateTax);
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@ Override
	public String toString() {
		System.out.println("Nome: "+this.getName());
		System.out.println("Endereço: "+this.getAddress());
		System.out.println("Número de Empregado: "+this.getEmployeeNumber());
		System.out.println("Sindicalizado? "+this.isSyndicated());
		System.out.println("Número de Sindicato: "+this.getSyndicateNumber());
		System.out.println("Taxa de Sindicato: "+this.getSyndicateTax());
		return "\n";
	}

}
