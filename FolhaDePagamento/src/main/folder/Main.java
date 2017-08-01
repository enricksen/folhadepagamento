package main.folder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import user.folder.Commissioned;
import user.folder.Employee;
import user.folder.Hourly;
import user.folder.Salaried;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		List<Employee> recent_removed = new ArrayList<Employee>();
		List<Employee> recent_added = new ArrayList<Employee>();
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
					System.out.println("Usuário não existe.");
				}
				else {
					System.out.println(employees.get(pos));
					System.out.println("Tem certeza que deseja remover esse empregado? (S = 1 / N = 0)");
					questions = input.nextInt();
					if(questions == 1) {
						recent_removed.add(employees.get(pos));
						employees.remove(pos);
						System.out.println("Empregado removido com sucesso.");
					} else if(questions == 2) {
						System.out.println("Operação cancelada.");
					}
				}
			}
		}
	input.close();
	}

}
