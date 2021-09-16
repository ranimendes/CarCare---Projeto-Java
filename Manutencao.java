package CarCare;

public class Manutencao {
	private int trocaOleo;// quando tiver 5.000km, troca o oleo. se for maior que 5000, trocar oleo. se
							// for maior que 10000 trocar filtro e oleo. caso passar de 6 meses, alertaro
							// usuario para fazer a troca.
	private int pastilhaFreio;// troca a cada 20.000 km.
	private int trocaPneu;// substituir os pneus entre 35 mil km e 45 mil km. ou em 5 anos.
	private int fluidoFreio; // trocar a cada 1 ano.
	private int correiaDentada;// trocar a cada 60.000km.
	private int kmAtual;

	public void getTrocaOleo() {
		if (trocaOleo < kmAtual && kmAtual - trocaOleo >= 5000) {

			System.out.println("\n____A diferença para a ultima vez é de: "+ (kmAtual - trocaOleo) + " km`s"
					+ "\n  »»» Voce deve trocar o oleo");
			if (kmAtual - trocaOleo >= 10000) {
				System.out.println("  »»» Voce deve trocar o filtro de oleo");
			}
		} else if(trocaOleo > kmAtual){
			System.err.println("            O valor é incorreto!\n" 
					 + "Deve ser um valor maior que o ultimo KM registrado!");
		} else if(kmAtual - trocaOleo < 5000) {
			System.out.println("____Voce não tem manutençoes a fazer!");
		}
	}

	public void setTrocaOleo(int kmAntigo, int kmNovo) {
		this.trocaOleo = kmAntigo;
		this.kmAtual = kmNovo;
	}

	public void getPastilhaFreio() {
		if (pastilhaFreio < kmAtual && kmAtual - pastilhaFreio >= 20000) {
			System.out.println("  »»» ____Voce precisa troca as pastilhas de freio!!");
		}
	}

	public void setPastilhaFreio(int kmAntigo, int kmNovo) {
		this.kmAtual = kmNovo;
		this.pastilhaFreio = kmAntigo;
	}

	public void getTrocaPneu() {
		if (trocaPneu < kmAtual && kmAtual - trocaPneu >= 35000) {
			System.out.println("  »»» ____Voce precisa trocar os pneus!!");
		}
	}

	public void setTrocaPneu(int kmAntigo, int kmNovo) {
		this.kmAtual = kmNovo;
		this.trocaPneu = kmAntigo;
	}

	public void getFluidoFreio() {
		if (fluidoFreio < kmAtual && kmAtual - fluidoFreio >= 20000) {
			System.out.println("  »»» ____Voce precisa trocar o fluido de freio");
		}
	}

	public void setFluidoFreio(int kmAntigo, int kmNovo) {
		this.kmAtual = kmNovo;
		this.fluidoFreio = kmAntigo;
	}

	public void getCorreiaDentada() {
		if (fluidoFreio < kmAtual && kmAtual - correiaDentada >= 60000) {
			System.out.println("  »»» ____Voce precisa trocar a correia dentada!!");
		}

	}

	public void setCorreiaDentada(int kmAntigo, int kmNovo) {
		this.kmAtual = kmNovo;
		this.correiaDentada = kmAntigo;
	}

}

//