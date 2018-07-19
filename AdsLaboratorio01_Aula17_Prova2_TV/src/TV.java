
public class TV {
	private int canal; //2,4,5,7,10,12,20,36
	private int volume; //0 a 100 (+) (-)
	private int brilho; //0 a 10 (+) (-)
	private int contraste; //0 a 10 (+) (-)
	private boolean mudo;
	
	public TV() {
		this.setCanal(2);
		this.setVolume(20);
		this.setBrilho(5);
		this.setContraste(5);
		this.setMudo(false);
	}
	
	private boolean isMudo() {
		return mudo;
	}

	public void setMudo(boolean mudo) {
		this.mudo = mudo;
	}
	
	public String getMudo() {
		if(this.isMudo() == true)
			return "SIM";
		return "NAO";
			
	}//-------------------------

	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getBrilho() {
		return brilho;
	}
	public void setBrilho(int brilho) {
		this.brilho = brilho;
	}
	public int getContraste() {
		return contraste;
	}
	public void setContraste(int contraste) {
		this.contraste = contraste;
	}

	public void alteraCanal() {
		// TODO Auto-generated method stub
		
	}//-------------------------

	public void alteraVolume(char volume) {
		if(volume == '*')
			return;
		if(volumeMaximo()) {
			System.out.println("Volume MAXIMO");
			if(volume == '-')
				this.diminuiVolume();
			return;
		}
		if(volumeMinimo()) {
			System.out.println("Volume MINIMO");
			if(volume == '+')
				this.aumentaVolume();
			return;
		}
	    if(volume == '+')
			this.aumentaVolume();
		else this.diminuiVolume();
		return;
		
	}//-------------------------

	private boolean volumeMaximo() {
		if(this.getVolume() == 100)
			return true;
		return false;
	}
	
	private boolean volumeMinimo() {
		if(this.getVolume() == 0)
			return true;
		return false;
	}

	private void diminuiVolume() {
		this.setVolume(this.getVolume()-1);
		
	}

	private void aumentaVolume() {
		this.setVolume(this.getVolume()+1);
		
	}

	public void alteraBrilho(char brilho) {
		if(brilho == '*')
			return;
		if(brilhoMaximo()) {
			System.out.println("Brilho MAXIMO");
			if(brilho == '-')
				this.diminuiBrilho();
			return;
		}
		if(brilhoMinimo()) {
			System.out.println("Brilho MINIMO");
			if(brilho == '+')
				this.aumentaBrilho();
			return;
		}
	    if(brilho == '+')
			this.aumentaBrilho();
		else this.diminuiBrilho();
		return;
		
	}//-------------------------

	private boolean brilhoMaximo() {
		if(this.getBrilho() == 10)
			return true;
		return false;
	}
	
	private boolean brilhoMinimo() {
		if(this.getBrilho() == 0)
			return true;
		return false;
	}

	private void diminuiBrilho() {
		this.setBrilho(this.getBrilho()-1);
		
	}

	private void aumentaBrilho() {
		this.setBrilho(this.getBrilho()+1);
		
	}

	public void alteraContraste(char contraste) {
		if(contraste == '*')
			return;
		if(contrasteMaximo()) {
			System.out.println("Contraste MAXIMO");
			if(contraste == '-')
				this.diminuiContraste();
			return;
		}
		if(contrasteMinimo()) {
			System.out.println("Contraste MINIMO");
			if(contraste == '+')
				this.aumentaContraste();
			return;
		}
	    if(contraste == '+')
			this.aumentaContraste();
		else this.diminuiContraste();
		return;
		
	}//-------------------------

	private boolean contrasteMaximo() {
		if(this.getContraste() == 10)
			return true;
		return false;
	}
	
	private boolean contrasteMinimo() {
		if(this.getContraste() == 0)
			return true;
		return false;
	}

	private void diminuiContraste() {
		this.setContraste(this.getContraste()-1);
		
	}

	private void aumentaContraste() {
		this.setContraste(this.getContraste()+1);
		
	}

	public void alteraMudo() {
			this.setMudo(!this.isMudo());
			
		
	}//-------------------------

}
