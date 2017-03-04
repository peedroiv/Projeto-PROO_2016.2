package proo.sei.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import proo.sei.exceptions.ViewException;

public class ProfessorView {
	
	private Scanner input = new Scanner(System.in);
	
	public int interfaceMenu (String nome) {
		System.out.println("-------------------------------------");
		System.out.println("Ol�, " + nome + "! O que deseja fazer?");
		System.out.println("[1] Visualizar suas disciplinas");
		System.out.println("[2] Adicionar notas");
		System.out.println("[3] Visualizar dados pessoais");
		System.out.println("[4] Mudar a senha");
		System.out.println("[5] Logout");

		Boolean erro;
		int opcao = 0;
		
		do {
			erro = false;
			System.out.print("Digite sua op��o: ");			
			
			try {
				opcao = this.input.nextInt();
				
				if (opcao <= 0 || opcao > 5) {
					throw new ViewException("Op��o inv�lida! Tente novamente!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Op��o inv�lida! Tente novamente!");
				input.next();
				erro = true;
			} catch (ViewException e) {
				System.out.println(e.getMessage());
				erro = true;
			}
		} while (erro);
		
		System.out.println();
		
		return opcao;
	}
}
