public class Elevador {

	private int andarAtual, totalAndares, capacidade, qtdPessoas;

	public Elevador(int totalAndares, int capacidade) {
		if((totalAndares > 0) && (capacidade > 0)) {
			this.totalAndares = totalAndares;
			this.capacidade = capacidade;
			this.andarAtual = 0;
			this.qtdPessoas = 0;
		} else {
			return;
		}
	}

	public int getAndarAtual() {
		return this.andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		if((andarAtual >= 0) && (andarAtual <= this.totalAndares)) {
			this.andarAtual = andarAtual;
		}
	}

	public int getTotalAndares() {
		return this.totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		if(totalAndares > 0) {
			this.totalAndares = totalAndares;
		}
	}

	public int getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(int capacidade) {
		if(capacidade > 0) {
			this.capacidade = capacidade;
		}
	}

	public int getQtdPessoas() {
		return this.qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		if(qtdPessoas > 0) {
			this.qtdPessoas = qtdPessoas;
		}
	}

	public boolean entra(){
		if(this.qtdPessoas < this.capacidade){
			this.qtdPessoas++;
			return true;
		} else {
			return false;
		}
	}

	public boolean sai(){
		if(this.qtdPessoas > 0){
			this.qtdPessoas--;
			return true;
		} else {
			return false;
		}
	}

	public boolean sobe(){
		if(this.andarAtual < this.totalAndares){
			this.andarAtual ++;
			return true;
		} else {
			return false;
		}
	}

	public boolean desce(){
		if(this.andarAtual > 0){
			this.andarAtual--;
			return true;
		} else {
			return false;
		}
	}
}
