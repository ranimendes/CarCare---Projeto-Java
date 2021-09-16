package CarCare;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainCarCare {

	public static void main(String[] args) throws InterruptedException {

		int cont = 0, codVericadorMain = 0;
		String verificaDigitado, usuario;
		String teste = "-----------Obrigado por usar o CarCare!-------------";

		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formartar data > dia/mês/ano

		LocalDate data = LocalDate.now();
		Scanner ler = new Scanner(System.in);
		Login login = new Login();
		Carro carros = new Carro();

		login.preLogin();
		carros.preCarro();
		
		System.out.println("Teste commit ");

		data = data.plusMonths(0); // USADO PARA SOMAR MESES A DATA
		login.mostraLogo();
		System.out.println("\nBem vindo ao CarCare. O sistema que gerencia o seu carro!");
		System.out.println("Data: " + data.format(formatadorBarra) + "\n"); // IMPRIME A DATA ATUAL
		

		LocalDate localDateAntigo = LocalDate.of(2010, 4, 1);
		LocalDate localDateNovo = LocalDate.of(2015, 5, 1);

		Period periodo = Period.between(localDateAntigo, localDateNovo);
		 System.out.println("Apenas meses: " + periodo.toTotalMonths());

		for (int x = 0; x < 1;) { // O LAÇO "for" RODARA INFINITAMENTE ENQUANTO "x" FOR MENOR QUE "1"
			System.out.print(
					"\n__________________O que Deseja fazer?__________________\n|| 1 Login || 2 Novo Cadastro || 0 Sair do sistema | \n »»»");
			verificaDigitado = ler.nextLine();

			if (verificaDigitado.equals("1")) { // AQUI VAMOS FAZER OS METODOS APOS O LOGIN

				login.fazLogin();

				usuario = login.getUsuario();

				do {
					System.out.print(
							"\n__________________Digite a proxima opçao__________________\n|| 1 Listar Carros || 2 Novo Carro || 3 Selec Carro || 0 Sair do sistema \n »»»");

					verificaDigitado = ler.nextLine();
					codVericadorMain = login.getCodVerificador();
					switch (verificaDigitado) {
					case "1":
						carros.listaCarro(codVericadorMain);

						break;
					case "2":
						carros.criaCarro(codVericadorMain, usuario);

						break;
					case "3":
						carros.verificaManutencao(codVericadorMain);
						break;
					case "4":
						carros.listaTodos();
						break;
					case "0":
						cont = 1;
						break;
					default:
						System.err.println("\nO numero informado nao corresponde a uma opçao!  \nDigite novamente!");
						}
				} while (cont != 1);

				login.mostraLogo();
				break;

			} else if (verificaDigitado.equals("2")) { // AQUI VAMOS CRIAR UM NOVO LOGIN NA ARRAY, NAO PODE TER USUARIOS
														// REPETIDOS

				login.criaLogin();

			} else if (verificaDigitado.equals("3")) { // AQUI VAMOS LISTAR TODOS OS USUARIOS CADASTRADOS
				login.listaLogin();
				System.out.println();

			} else if (verificaDigitado.equals("0")) { // AQUI VAMOS SAIR DO SISTEMA
				login.mostraLogo();

				

				x = 1;
			} else {
				System.err.println("\nO numero informado nao corresponde a uma opçao!  "
						         + "\n            Digite novamente!");
			
			}
		}
		
		for(int k=0; k < 51; k++) {
			Thread.sleep(20);
			System.err.print(teste.charAt(k));
		}

		ler.close();
	}

}