package CarCare;

import java.util.ArrayList;
import java.util.Scanner;

public class Login extends Usuario {
	Scanner ler = new Scanner(System.in);

	int cont, x, codVerificador;
	String usuarioLogado;

	ArrayList<Login> ArrayLogin = new ArrayList<Login>(); // CRIA O ARRALIST DE "Login" QUE DEVE SER PASSADO

	public void criaLogin() { // CHAMADO PELO MAIN ELE IRÁ CRIAR NOVOS LOGINS UNICOS QUE NAO PODEM SER
								// REPETIDOS
		System.out.print("Digite o usuario: ");
		setUsuario(ler.nextLine());
		System.out.print("Digite a senha: ");
		setSenha(ler.nextLine());

		for (int y = 0; y < ArrayLogin.size(); y++) { // O "y" CAMINHARÁ ATÉ O TAMANHO TOTAL DO ARRAYLIST
			if (getUsuario().equalsIgnoreCase(ArrayLogin.get(y).getUsuario())) { // SE ENTRAR O VALOR QUE VOCE DIGITOU ELE DA A
																		// MENSAGEM DE USUARIO EM USO
				System.err.println("Usuario em uso!");
				break; // AQUI ELE FORÇA PARA SAIR DO LAÇO "for"
			} else if (y == ArrayLogin.size() - 1) { // SE ELE NAO ENCONTRAR NENHUM VALOR IGUAL NO ARRAY ENTAO ELE
														// AVANÇA
				System.out.println("Adicionado com sucesso!");
				ArrayLogin.add(new Login(getUsuario(), getSenha())); // AQUI ELE PASSA OS PARAMETROS PARA CRIAÇAO NA
																		// CLASSE "login" METODO "criaLogin"
				break; // AQUI ELE FORÇA PARA SAIR DO LAÇO "for"
			}
		}
	}

	public void fazLogin() { // FAZ O LOGIN COM USUARIO E SENHA
		do {
			System.out.print("Digite o usuario: ");
			setUsuario(ler.nextLine());
			System.out.print("Digite a senha: ");
			setSenha(ler.nextLine());

			for (int y = 0; y < ArrayLogin.size(); y++) { // O "y" CAMINHARÁ ATÉ O TAMANHO TOTAL DO ARRAYLIST
				if (getUsuario().equalsIgnoreCase(ArrayLogin.get(y).getUsuario())) { // SE O QUE EU DIGITEI FOR IGUAL A UMA
																			// POSICAO DO ARRAY ELE AVANÇA
					if (getSenha().equalsIgnoreCase(ArrayLogin.get(y).getSenha())) { // SE O QUE EU DIGITEI EM SENHA FOR IGUAL A
																			// MESMA POSÇAO DO "Y" ELE AVANÇA
						System.out.println("Bem vindo " + ArrayLogin.get(y).getUsuario().toUpperCase() + "!"); // MSG DE BEM VINDO
						cont = 1; // CONT SERVE PARA FICAR RODANDO INFINITAMENTE, ENTAO AQUE DEMOS UM VALOR PARA
									// ELE SAIR DO LAÇO WHILE
						codVerificador = y + 1; // O "CodVerificador" É MUITO IMPORTANTE PORQUE ELE IRÁ PASSAR A O
												// CODIGO DO MEU USUARIO PARA A CLASSE "Carro"
						break;
					} else {
						System.out.println("Senha incorreta!"); // SE ELE NAO ENTRAR NO "if" DA SENHA INCORRETA
						break;
					}
				} else if (y == ArrayLogin.size() - 1) { // SE O QUE EU DIGITE NAO EXISTE EM NENHUMA POSICAO DO ARRAY
															// ENTAO ELE DA A MSG DE USUARIO OU SENHA ERRADO
					System.out.println("Usuario ou senha incorreto!");
				}
			}
			System.out.println("");
		} while (cont != 1); // FIM DO LAÇO INFINITO SOMENTE QUANDO CONT FOR " == 1 "

	}

	public void preLogin() { // PRECADASTROS DE LOGINS E SENHA
		ArrayLogin.add(new Login("gustavo", "1234")); // POSICAO 0 (LOGIN, SENHA)
		ArrayLogin.add(new Login("george", "4321")); // POSICAO 1 (LOGIN, SENHA)
		ArrayLogin.add(new Login("victor", "333")); // POSICAO 2 (LOGIN, SENHA)
		ArrayLogin.add(new Login("leonardo", "1111")); // POSICAO 3 (LOGIN, SENHA)
		ArrayLogin.add(new Login("henrique", "3080")); // POSICAO 4 (LOGIN, SENHA)
		ArrayLogin.add(new Login("rani", "2021")); // POSICAO 5 (LOGIN, SENHA)
	}

	public void listaLogin() { // MOSTRA TODOS OS LOGINS E SENHAS EXISTENTES PARA FACILITAR NA CRIAÇAO DO
								// CODIGO
		System.out.println("\n----Lista de Logins----\n");
		for (int i = 0; i < ArrayLogin.size(); i++) {
			System.out.print("Usuario| " +ArrayLogin.get(i).getUsuario()+ "     Senha| " + ArrayLogin.get(i).getSenha());
		}

	}

	public Login(String usuario, String senha) { // CONSTRUTOR COM PARAMETROS USUARIO E SENHAS PARA SEREM INSERIDOS NO
													// ARRAYLIST
		setUsuario(usuario); // INSERE AS INFOMAÇOES DA SUPERCLASSE "Usuario" ATRAVÉS DO SETTER
		setSenha(senha); // INSERE AS INFOMAÇOES DA SUPERCLASSE "Usuario" ATRAVÉS DO SETTER
	}

	public Login() { // CLASSE CONSTRUTOR PADRAO DE LOGIN SEMPRE DEVE TER UMA QUANDO INICIA A CLASSE

	}

	/*
	 * public String getUsuario() { return this.getUsuario(); } /* public void
	 * setUsuario(String usuario) { this.usuario = usuario; }
	 * 
	 * public String getSenha() { return senha; }
	 * 
	 * public void setSenha(String senha) { this.senha = senha; }
	 */

	/*
	 * public void fazLoginFor() { // METODO PARA FAZER LOGIN USANDO LAÇO FOR
	 * 
	 * for (int x = 0; x < 1; ) { System.out.println("Digite o usuario: "); usuario
	 * = ler.next();
	 * 
	 * for (int y = 0; y < vetorUsuario.length; y++) { if
	 * (usuario.equals(vetorUsuario[y])) { System.out.println("Digite a senha: ");
	 * senha = ler.next();
	 * 
	 * if (senha.equals(vetorSenha[y])) { limpaConsole();
	 * System.out.println("\nBem vindo, " + vetorUsuario[y]+ "!"); cont = 1; x++;
	 * break;
	 * 
	 * } else { System.out.println("Senha errada!"); y--; } } }
	 * 
	 * if (cont == 0) { System.out.println("Usuario incorreto, tente novamente!"); }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * public void fazLoginDoWhile() { // METODO PARA FAZER LOGIN USANDO LAÇO DO
	 * WHILE do { System.out.print("\nInsira seu usuário:\n"); usuario = ler.next();
	 * 
	 * System.out.println("Insira sua senha:"); senha = ler.next();
	 * 
	 * for(x = 0; x < vetorUsuario.length; x++) {
	 * if(usuario.equals(vetorUsuario[x])) { cont = x; } }
	 * 
	 * if(!usuario.equals(vetorUsuario[cont]) || !senha.equals(vetorSenha[cont])) {
	 * System.out.println("Usuario ou senha incorreta!" + "\nTente novamente!"); }
	 * 
	 * }while (!usuario.equals(vetorUsuario[cont]) ||
	 * !senha.equals(vetorSenha[cont]));
	 * 
	 * limpaConsole(); System.out.println("\nBem vindo, " +vetorUsuario[cont]+ "!");
	 * }
	 * 
	 * 
	 * public void criaLogin() {
	 * 
	 * System.out.println("Digite o usuario novo: "); usuario = ler.next();
	 * 
	 * for(int x=0; x<vetorUsuario.length; x++) { if(vetorUsuario[x] == "") {
	 * vetorUsuario[x] = usuario; System.out.println("Digite a nova senha: "); senha
	 * = ler.next(); vetorSenha[x] = senha;
	 * 
	 * System.out.println("Cadastro efetuado com sucesso!\n"); break; } }
	 * 
	 * }
	 */

	// GETTERS E SETTERS
	public int getCodVerificador() {
		return codVerificador;
	}

	public void setCodVerificador(int codVerificador) {
		this.codVerificador = codVerificador;
	}
	// GETTERS E SETTERS

	public void mostraLogo() throws InterruptedException { // IMPRIME O LOGOTIPO "CarCare"
		for (int i = 0; i < 4; i++) {
			System.out.print("     @\n");
			System.out.print("      '@\n");
			System.out.print("@@@@@@@@@@         @@@@@@@@\n");
			System.out.print("       @       @@@@:     : @@@@\n");
			System.out.print("     @'      @@@@   :   :    @@@@\n");
			System.out.print("           @@@@      ':'       @@@@\n");
			System.out.print("          @@@'.       :        .'@@@\n");
			System.out.print("          @@   '.     ¤¤     .'   @@\n");
			System.out.print("          @@___.-----¤¤¤¤-----.___@@\n");
			System.out.print("          @@          ¤¤          @@\n");
			System.out.print("          @@@       .'  '.       @@@\n");
			System.out.print("           @@@@ ..-:      :-.. @@@@\n");
			System.out.print("             @@@@  :      :  @@@@       @\n");
			System.out.print("               @@@@:      :@@@@       @'\n");
			System.out.print("                   @@@@@@@@         @@@@@@@@@@\n");
			System.out.print("                                      @\n");
			System.out.print("                                       '@\n");
			Thread.sleep(100);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			System.out.print("       @\n");
			System.out.print("        '@\n");
			System.out.print("  @@@@@@@@@@       @@@@@@@@\n");
			System.out.print("         @     @@@@        @@@@\n");
			System.out.print("       @'    @@@@ :        : @@@@\n");
			System.out.print("           @@@@    :      :    @@@@\n");
			System.out.print("          @@@_ _ _.'.   .' '---' @@@\n");
			System.out.print("          @@         '¤¤          @@\n");
			System.out.print("          @@        .¤¤¤¤.        @@\n");
			System.out.print("          @@_ __ _.'  ¤¤  '. _ _ _@@\n");
			System.out.print("          @@@   .'    :     :    @@@\n");
			System.out.print("           @@@@'     .'.     '.@@@@\n");
			System.out.print("             @@@@   :   :    @@@@     @\n");
			System.out.print("               @@@@:     : @@@@     @'\n");
			System.out.print("                   @@@@@@@@       @@@@@@@@@@\n");
			System.out.print("                                    @\n");
			System.out.print("                                     '@\n");
			Thread.sleep(100);
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			System.out.print("         @\n");
			System.out.print("          '@\n");
			System.out.print("    @@@@@@@@@@     @@@@@@@@\n");
			System.out.print("           @   @@@@    :   @@@@\n");
			System.out.print("         @'  @@@@ '.   :     @@@@\n");
			System.out.print("           @@@@     ':'     .' @@@@\n");
			System.out.print("          @@@        :     :_ _ _@@@\n");
			System.out.print("          @@'.        ¤¤ .'       @@\n");
			System.out.print("          @@  '._ _ _¤¤¤¤.        @@\n");
			System.out.print("          @@ .'       ¤¤  '._ _ __@@\n");
			System.out.print("          @@@         :     :    @@@\n");
			System.out.print("           @@@@      .'.    :  @@@@\n");
			System.out.print("             @@@@   :   :    @@@@   @\n");
			System.out.print("               @@@@:    :  @@@@   @'\n");
			System.out.print("                   @@@@@@@@     @@@@@@@@@@\n");
			System.out.print("                                  @\n");
			System.out.print("                                   '@\n");
			Thread.sleep(100);

			if(i < 3) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}

		}

	}

	public void limpaConsole() { // METODO PARA LIMPAR O CONSOLE
		for (int i = 0; i < 100; ++i)
			System.out.println();
	}
}