public class Paises {

	private String nome, capital;
	private double dimensao;
	private String[] fronteira;

	public Paises(String nome, String capital, double dimensao, String[] fronteira) {

		for(int i = 0; i < fronteira.length; i++){
			if(nome == fronteira[i]){
				return;
			}
		}

		if(dimensao < 0){
			return;
		}

		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
		this.fronteira = fronteira;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return this.capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getDimensao() {
		return this.dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public String getVizinhoFronteira(int i){
		return this.fronteira[i];
	}

	public void setFronteira(String[] fronteira){
		for(int i = 0; i < fronteira.length; i++){
			if(this.nome == fronteira[i]){
				return;
			}
		}
		this.fronteira = fronteira;
	}

	public int quantidadeVizinhos(){
		return this.fronteira.length;
	}

	public String listaVizinhos(Paises vizinho){
		if(this.nome == vizinho.nome){
			return "Mesmo país";
		}
		String resposta = "";
		for(int i = 0; i < this.quantidadeVizinhos(); i++){
			for(int j = 0; j < vizinho.quantidadeVizinhos(); j++){
				if(this.fronteira[i] == vizinho.getVizinhoFronteira(j)){
					resposta += this.fronteira[i] + " | ";
					break;
				}
			}
		}
		return resposta;
	}

}