public class Televisao {

	private int volume, canal;

	public void aumentaVolUnid(){
		if(this.volume < 100){
			this.volume++;
		}
	}

	public void diminuiVolUnid(){
		if(this.volume > 0){
			this.volume--;
		}
	}

	public void aumentaCanalUnid(){
		this.canal++;
	}

	public void diminuiCanalUnid(){
		if(this.canal > 1){
			this.canal--;
		}
	}

	public void canalIndicado(int i){
		if(i > 0){
			this.canal = i;
		}
	}

	public int getVolume(){
		return this.volume;
	}

	public int getCanal(){
		return this.canal;
	}

}
