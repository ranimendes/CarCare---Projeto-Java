package CarCare;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Carro extends Usuario {
	
		Scanner ler = new Scanner(System.in);
		Login login = new Login();
		LocalDate data = LocalDate.now();
		Manutencao manut = new Manutencao();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");	//formartar data > dia/mês/ano
		
		//private String fabricante;
		private String modeloCarro; 
		private int anoModelo; 
	 	private int km; // Esse atributo é quando sera adicionado o carro do usuario.
	 	private String cor;
	 	private String digitado;
	 	private int kmVetor;
	 	//private LocalDate dataADD;  // Essa variavel vai armazenar a data que adicionar o carro.
	 	
	 	ArrayList<Carro> ArrayCarro = new ArrayList<Carro>(); // DECLARAMOS O ARRAYLIST DO TIPO "Carro" QUE RECEBERÁ TODOS OS PARAMETROS DO METODO "criaCarro"
	 	
	 	public void criaCarro(int codVerificadorMain, String usuario) { // AQUI CRIA NOVOS CARROS, PASSAMOS COMO PARAMETRO CodVeri e Usuario
	 		setCod(codVerificadorMain);
	 		
	 		//System.out.println("Digite a fabricante: ");
	 		//fabricante = ler.next();
	 		System.out.println("Digite o modelo: ");
	 		modeloCarro = ler.next();
	 		//System.out.println("Digite o ano do modelo: ");
	 		//anoModelo = ler.nextInt();
	 		System.out.println("Com quantos km`s está: ");
	 		km = ler.nextInt();
	 		//System.out.println("Digite a cor: ");
	 		//cor = ler.next();
	 		System.out.println("Data de adicao do novo carro: " + data);

	 		ArrayCarro.add(new Carro(getCod(), usuario, modeloCarro, 0, km, "", data)); 	// APOS DIGITADO AS INFORMAÇOES VOCE USARÁ ".add" PARA ADICIONAR NO FIM DO ARRAYLIST	
	 		System.out.println("Carro adicionado com sucesso!!!");
	 	}
	 	
	 	public void listaCarro(int codVerificadorMain) {		// IRÁ MOSTRAR SOMENTE OS CARROS VINCULADOS AO USUARIO QUE ESTÁ LOGADO
	 		
	 		setCod(codVerificadorMain);				// O CODIGO VERIFICADOR ESTÁ VINDO DA CLASSE MAIN, ELE É DETERMINADO QUANDO FAZEMOS LOGIN
	 		
	 		
	 		System.out.println("\n\n         ----Lista de Carros----         ");
	 		
			for (int i = 0; i < ArrayCarro.size(); i++) {		
				if(ArrayCarro.get(i).getCod() == getCod())  {//ArrayCarro.get(i).getUsuario().equals(getUsuario())
					System.out.println(//"Fab|" + ArrayCarro.get(i).getFabricante() 	//	ARRAYLISTA NA POSICAO i - FABRICANTE
							          "Modelo|" + ArrayCarro.get(i).getModeloCarro() 	//	ARRAYLISTA NA POSICAO i - MODELO
							          + "  KM|" + ArrayCarro.get(i).getKm() 			//	ARRAYLISTA NA POSICAO i - KM
							         + "  Add|" + ArrayCarro.get(i).getData());
							        // + "  Ano|" + ArrayCarro.get(i).getAnoModelo() 	//	ARRAYLISTA NA POSICAO i - ANOMODELO
							        // + "  Cor|" + ArrayCarro.get(i).getCor());		//	ARRAYLISTA NA POSICAO i - COR
								
				}
			}
			System.out.println("\n\n");
			
	 	}
	 	
	 	public void preCarro() {
	 		ArrayCarro.add(new Carro(1, "gustavo", "gol", 2019, 20000, "Azul", data.plusMonths(-32)));				// CRIAMOS NO ARRAYLIST POSICAO 0 
	 		ArrayCarro.add(new Carro(1, "gustavo", "cruze", 2019, 60000, "Preto", data.plusMonths(-60)));
	 		ArrayCarro.add(new Carro(1, "gustavo", "panamera", 2019, 10000, "vermelho", data.plusMonths(-5)));
	 		ArrayCarro.add(new Carro(1, "gustavo", "onix", 2019, 50000, "prata", data.plusMonths(-20)));
			ArrayCarro.add(new Carro(1, "gustavo", "argo", 2019, 35000, "prata", data.plusMonths(-13)));
	 		
	 		ArrayCarro.add(new Carro(2, "george", "c200", 2018, 15000, "Preto", data.plusMonths(-27)));		// CRIAMOS NO ARRAYLIST POSICAO 1
	 		ArrayCarro.add(new Carro(2, "george", "velar", 2018, 35000, "Amarelo", data.plusMonths(-18)));
	 		ArrayCarro.add(new Carro(2, "george", "panamera", 2019, 10000, "vermelho", data.plusMonths(-5)));
	 		ArrayCarro.add(new Carro(2, "george", "onix", 2019, 50000, "prata", data.plusMonths(-20)));
			ArrayCarro.add(new Carro(2, "george", "argo", 2019, 35000, "prata", data.plusMonths(-13)));
	 		
	 		ArrayCarro.add(new Carro(3, "victor", "uno", 2021, 60000, "Branco", data.plusMonths(-41)));			// CRIAMOS NO ARRAYLIST POSICAO 2
	 		ArrayCarro.add(new Carro(3, "victor", "velar", 2018, 35000, "Amarelo", data.plusMonths(-18)));
	 		ArrayCarro.add(new Carro(3, "victor", "panamera", 2019, 10000, "vermelho", data.plusMonths(-5)));
	 		ArrayCarro.add(new Carro(3, "victor", "onix", 2019, 50000, "prata", data.plusMonths(-20)));
			ArrayCarro.add(new Carro(3, "victor", "argo", 2019, 35000, "prata", data.plusMonths(-13)));
	 		
	 		ArrayCarro.add(new Carro(4, "leonardo", "corsa", 2005, 75000, "Vermelho", data.plusMonths(-22)));// CRIAMOS NO ARRAYLIST POSICAO 3
			ArrayCarro.add(new Carro(4, "leonardo", "535i", 2005, 25000, "Vermelho", data.plusMonths(-12)));
			ArrayCarro.add(new Carro(4, "leonardo", "panamera", 2019, 10000, "vermelho", data.plusMonths(-5)));
			ArrayCarro.add(new Carro(4, "leonardo", "onix", 2019, 50000, "prata", data.plusMonths(-20)));
			ArrayCarro.add(new Carro(4, "leonardo", "argo", 2019, 35000, "prata", data.plusMonths(-13)));
			
			ArrayCarro.add(new Carro(5, "henrique", "palio", 2018, 50000, "Amarelo", data.plusMonths(-48)));		// CRIAMOS NO ARRAYLIST POSICAO 4
			ArrayCarro.add(new Carro(5, "henrique", "velar", 2018, 35000, "Amarelo", data.plusMonths(-18)));
			ArrayCarro.add(new Carro(5, "henrique", "panamera", 2019, 10000, "vermelho", data.plusMonths(-5)));
			ArrayCarro.add(new Carro(5, "henrique", "onix", 2019, 50000, "prata", data.plusMonths(-20)));
			ArrayCarro.add(new Carro(5, "henrique", "argo", 2019, 35000, "prata", data.plusMonths(-13)));
			
			ArrayCarro.add(new Carro(6, "rani", "fit", 2019, 110000, "Verde", data.plusMonths(-8)));			// CRIAMOS NO ARRAYLIST POSICAO 5
			ArrayCarro.add(new Carro(6, "rani", "velar", 2018, 35000, "Amarelo", data.plusMonths(-18)));
			ArrayCarro.add(new Carro(6, "rani", "panamera", 2019, 10000, "vermelho", data.plusMonths(-5)));
			ArrayCarro.add(new Carro(6, "rani", "onix", 2019, 50000, "prata", data.plusMonths(-20)));
			ArrayCarro.add(new Carro(6, "rani", "argo", 2019, 35000, "prata", data.plusMonths(-13)));
	 	}
	 	
	 	
	 	
	 	public void listaTodos() {  // MOSTRA TODOS OS CARROS CADASTRADOS
	 		for (int i = 0; i < ArrayCarro.size(); i++) {
					System.out.println("Usuario|" + ArrayCarro.get(i).getUsuario()	    //	ARRAYLISTA NA POSICAO i - USUARIO
							          + "Modelo|" + ArrayCarro.get(i).getModeloCarro() 	//	ARRAYLISTA NA POSICAO i - MODELO
							            + "  KM|" + ArrayCarro.get(i).getKm() 	        //	ARRAYLISTA NA POSICAO i - KM
							           + "  Add|" + ArrayCarro.get(i).getData());
							      //     + "  Ano|" + ArrayCarro.get(i).getAnoModelo() 	//	ARRAYLISTA NA POSICAO i - ANOMODELO
							      //+ "		Fab|" + ArrayCarro.get(i).getFabricante() 	//	ARRAYLISTA NA POSICAO i - FABRICANTE
							         //+ "  Cor|" + ArrayCarro.get(i).getCor());	//	ARRAYLISTA NA POSICAO i - COR
							        
			}
	 	}
	 	
	 	public void verificaManutencao(int codVerificadorMain) {
	 		setCod(codVerificadorMain);
	 		int i;
	 		System.out.print("Digite o modelo que deseja verificar: \n »»");
	 		digitado = ler.next();
	 		
	 		for(i = 0; i < ArrayCarro.size(); i++) {
	 			if(digitado.equalsIgnoreCase(ArrayCarro.get(i).getModeloCarro()) && getCod() == ArrayCarro.get(i).getCod()) {
	 				
	 				System.out.print("Digite o Km atual: \n»»");
	 				kmVetor = ler.nextInt();
	 				
	 				manut.setTrocaOleo(ArrayCarro.get(i).getKm(), kmVetor); // KM antigo e KM novo digitado
	 				manut.getTrocaOleo();
	 				
	 				manut.setPastilhaFreio(ArrayCarro.get(i).getKm(), kmVetor);
	 				manut.getPastilhaFreio();
	 				
	 				manut.setTrocaPneu(ArrayCarro.get(i).getKm(), kmVetor);
	 				manut.getTrocaPneu();
	 				
	 				//System.out.println(manut.getFluidoFreio());
	 				
	 				manut.setCorreiaDentada(ArrayCarro.get(i).getKm(), kmVetor);
	 				manut.getCorreiaDentada();
	 				
	 				
	 				break;
	 			}else if(i == ArrayCarro.size()-1 && !digitado.equals(ArrayCarro.get(i).getModeloCarro())){
	 				System.err.println("\n  »»» O modelo nao existe!");
	 				break;
	 			}
	 		}
	 	}
	 	
	 	public Carro() {
	 		
	 	}
	 	
	 			// ESSE É O METODO CONSTRUTOR PARA ARMAZENAR EM CADA POSICAO DO ARRAYLIST, CADA POSIÇAO TERÁ TODAS ESSAS INFORMAÇOES
	 	public Carro(int cod, String usuario, String modeloCarro, int anoModelo, int km, String cor, LocalDate localDate) {
	 		setCod(cod);
	 		this.setUsuario(usuario);
	 		//this.fabricante = fabricante;
	 		this.modeloCarro = modeloCarro;
	 		this.anoModelo = anoModelo;
	 		this.km = km;
	 		this.cor = cor;
	 		this.data = localDate;
	 	}
	 	
	 	
	 	
	 	// METODOS GETTERS E SETTERS DA CLASSE
		/*public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}*/
		public String getModeloCarro() {
			return modeloCarro;
		}
		public void setModeloCarro(String modeloCarro) {
			this.modeloCarro = modeloCarro;
		}
		public int getAnoModelo() {
			return anoModelo;
		}
		public void setAnoModelo(int anoModelo) {
			this.anoModelo = anoModelo;
		}
		public int getKm() {
			return km;
		}
		public void setKm(int km) {
			this.km = km;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public LocalDate getData() {
			return data;
		}

		public void setData(LocalDate data) {
			this.data = data;
		}

		public String getDigitado() {
			return digitado;
		}

		public void setDigitado(String digitado) {
			this.digitado = digitado;
		}
		
		// METODOS GETTERS E SETTERS DA CLASSE

		
}