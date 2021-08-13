public class ControleRemoto {
	
	public void aumentaVolUnid(Televisao tv){
		tv.aumentaVolUnid();
	}

	public void diminuiVolUnid(Televisao tv){
		tv.diminuiVolUnid();
	}

	public void aumentaCanalUnid(Televisao tv){
		tv.aumentaCanalUnid();
	}

	public void diminuiCanalUnid(Televisao tv){
		tv.diminuiCanalUnid();
	}

	public void canalIndicado(Televisao tv, int i){
		tv.canalIndicado(i);
	}

	public int getVolume(Televisao tv){
		return tv.getVolume();
	}

	public int getCanal(Televisao tv){
		return tv.getCanal();
	}
}
