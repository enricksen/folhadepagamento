package user.folder;

public class Hourly extends Employee {

	private int lastPointCard;

	private int hoursPerWeek;

	public Hourly(int allEmployees) {
		super(allEmployees);
		System.out.println("Empregado cadastrado com sucesso");
	}

	public int getLastPointCard() {
		return lastPointCard;
	}

	public void setLastPointCard(int lastPointCard) {
		this.lastPointCard = lastPointCard;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		System.out.println("Nome: "+this.getName());
		System.out.println("Tipo: Horista");
		System.out.println("Endereço: "+this.getAddress());
		System.out.println("Número de Empregado: "+this.getEmployeeNumber());
		System.out.println("Sindicalizado? "+this.isSyndicated());
		System.out.println("Número de Sindicato: "+this.getSyndicateNumber());
		System.out.println("Taxa de Sindicato: "+this.getSyndicateTax());
		return "\n";
	}
}
