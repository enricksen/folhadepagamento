package main.folder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import user.folder.Commissioned;
import user.folder.Employee;
import user.folder.Hourly;
import user.folder.Salaried;
import utilities.folder.ExtraSyndicateTax;
import utilities.folder.PointCard;
import utilities.folder.Sales;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		List<Employee> recentRemoved = new ArrayList<Employee>();
		List<Employee> recentAdded = new ArrayList<Employee>();
		List<PointCard> points = new ArrayList<PointCard>();
		List<Sales> sales = new ArrayList<Sales>();
		List<ExtraSyndicateTax> extraTax = new ArrayList<ExtraSyndicateTax>();
		
		int allEmployees = 0;
		int pos;
		int questions;

		boolean loop = true;
		boolean end = true;
		Scanner input = new Scanner(System.in);

		while(end) {

			loop = true;
			System.out.println("======== Folha de Pagamento ========");
			System.out.println("*** Menu Principal ***");
			System.out.println("1 - Adicionar Empregado");
			System.out.println("2 - Remover Empregado");
			System.out.println("3 - Lançar Cartão de Ponto");
			System.out.println("4 - Adicionar uma venda");
			System.out.println("5 - Adicionar uma taxa de serviço");
			System.out.println("6 - Alterar detalhes de um empregado");
			questions = input.nextInt();

			if(questions == 1) {

				while(loop) {

					System.out.println("*** Adicionar Empregado ***");
					System.out.println("1 - Horista");
					System.out.println("2 - Assalariado");
					System.out.println("3 - Comissionado");
					questions = input.nextInt();

					if(questions == 1) {
						employees.add(new Hourly(allEmployees));
						allEmployees++;
						loop = false;

					} else if(questions == 2) {
						employees.add(new Salaried(allEmployees));
						allEmployees++;
						loop = false;

					} else if(questions == 3) {
						employees.add(new Commissioned(allEmployees));
						allEmployees++;
						loop = false;

					} else {

						System.out.println("Digite uma opção válida;\n\n");

					}
				}

			} else if(questions == 2) {
				pos = -1;
				System.out.println("*** Remover Empregado ***");
				System.out.println("Digite o ID do empregado que deseja remover:");
				questions = input.nextInt();
				for(int cont = 0; cont < employees.size(); cont++) {
					if(employees.get(cont).getEmployeeNumber() == questions)
					{
						pos = cont;
						break;
					}
				}
				if(pos == -1) {
					System.out.println("usuário não existe.");
				}
				else {
					System.out.println(employees.get(pos));
					System.out.println("Tem certeza que deseja remover esse empregado? (S = 1 / N = 0)");
					questions = input.nextInt();
					if(questions == 1) {
						recentRemoved.add(employees.get(pos));
						employees.remove(pos);
						System.out.println("Empregado removido com sucesso.");
					} else if(questions == 2) {
						System.out.println("Operação cancelada.");
					}
				}
			} else if(questions == 3) {
				
				pos = -1;
				System.out.println("*** Lançar Cartão de Ponto ***");
				System.out.println("Digite o ID do empregado que deseja adicionar o ponto:");
				questions = input.nextInt();
				for(int cont = 0; cont < employees.size(); cont++) {
					if(employees.get(cont).getEmployeeNumber() == questions && employees.get(cont) instanceof Hourly)
					{
						pos = cont;
						break;
					}
				}
				if(pos == -1) {
					System.out.println("usuário não existe.");
				} else {
					System.out.println(employees.get(pos));
					System.out.println("Tem certeza que deseja adicionar o cartão de ponto a esse empregado? (S = 1 / N = 0)");
					questions = input.nextInt();
					if(questions == 1) {
						int day;
						int month;
						int hours;
						System.out.println("Digite o dia do cadastro:");
						day = input.nextInt();
						System.out.println("Digite o mês do cadastro:");
						month = input.nextInt();
						System.out.println("Digite quantas horas foram trabalhadas:");
						hours = input.nextInt();
						points.add(new PointCard(day,month,hours,employees.get(pos).getEmployeeNumber()));
						System.out.println("Ponto cadastrado com sucesso.");
					} else if(questions == 2) {
						System.out.println("Operação cancelada.");
					}
				}
				
			} else if(questions == 4) {
				
				pos = -1;
				System.out.println("*** Lançar Venda ***");
				System.out.println("Digite o ID do empregado que deseja adicionar uma venda:");
				questions = input.nextInt();
				for(int cont = 0; cont < employees.size(); cont++) {
					if(employees.get(cont).getEmployeeNumber() == questions && employees.get(cont) instanceof Commissioned)
					{
						pos = cont;
						break;
					}
				}
				if(pos == -1) {
					System.out.println("usuário não existe.");
				} else {
					System.out.println(employees.get(pos));
					System.out.println("Tem certeza que deseja adicionar uma venda a esse empregado? (S = 1 / N = 0)");
					questions = input.nextInt();
					if(questions == 1) {
						int day;
						int month;
						float value;
						
						System.out.println("Digite o dia da venda:");
						day = input.nextInt();
						System.out.println("Digite o mês da venda:");
						month = input.nextInt();
						System.out.println("Digite o valor da venda:");
						value = input.nextFloat();
						sales.add(new Sales(day,month,value,employees.get(pos).getEmployeeNumber()));
						System.out.println("Venda cadastrada com sucesso.");
					} else if(questions == 2) {
						System.out.println("Operação cancelada.");
					}
				}
				
			} else if(questions == 5) {
				
				pos = -1;
				System.out.println("*** Lançar Taxa ***");
				System.out.println("Digite o ID do empregado que deseja adicionar uma taxa:");
				questions = input.nextInt();
				for(int cont = 0; cont < employees.size(); cont++) {
					if(employees.get(cont).getEmployeeNumber() == questions && employees.get(cont).isSyndicated())
					{
						pos = cont;
						break;
					}
				}
				if(pos == -1) {
					System.out.println("usuário não existe.");
				} else {
					System.out.println(employees.get(pos));
					System.out.println("Tem certeza que deseja adicionar uma taxa a esse empregado? (S = 1 / N = 0)");
					questions = input.nextInt();
					if(questions == 1) {
						int day;
						int month;
						float value;
						
						System.out.println("Digite o dia da taxa:");
						day = input.nextInt();
						System.out.println("Digite o mês da taxa:");
						month = input.nextInt();
						System.out.println("Digite o valor da taxa:");
						value = input.nextFloat();
						extraTax.add(new ExtraSyndicateTax(day,month,value,employees.get(pos).getEmployeeNumber()));
						System.out.println("Taxa cadastrada com sucesso.");
					} else if(questions == 2) {
						System.out.println("Operação cancelada.");
					}
				}
				
			} else if(questions == 6) {
				pos = -1;
				System.out.println("*** Alterar detalhes de um empregado ***");
				System.out.println("Digite o ID do empregado que deseja alterar detalhes:");
				questions = input.nextInt();
				for(int cont = 0; cont < employees.size(); cont++) {
					if(employees.get(cont).getEmployeeNumber() == questions)
					{
						pos = cont;
						break;
					}
				}
				if(pos == -1) {
					System.out.println("usuário não existe.");
				}
				else {
					System.out.println(employees.get(pos));
					System.out.println("Tem certeza que deseja alterar detalhes desse empregado? (S = 1 / N = 0)");
					questions = input.nextInt();
					if(questions == 1) {
						
						System.out.println("Qual dado você deseja alterar?");
						System.out.println("1 - Nome");
						System.out.println("2 - Endereço");
						System.out.println("3 - Tipo");
						System.out.println("4 - Método de pagamento");
						System.out.println("5 - Participação no sindicato");
						System.out.println("6 - Taxa sindical");
						questions = input.nextInt();
						if(questions == 1) {
							
							System.out.println("Digite o novo nome:");
							String nome = input.nextLine();
							employees.get(pos).setName(nome);
							
						} else if(questions == 2) {
							
							System.out.println("Digite o novo endereço:");
							String endereço = input.nextLine();
							employees.get(pos).setAddress(endereço);
							
						} else if(questions == 3) {
							
						} else if(questions == 4) {
							
						} else if(questions == 5) {
							if(employees.get(pos).isSyndicated()) {
						} else if(questions == 6) {
							
						}
						System.out.println("Dados alterados com sucesso");
					} else if(questions == 2) {
						System.out.println("Operação cancelada.");
					}
				}
			}
		}
		
		input.close();
	}

}
