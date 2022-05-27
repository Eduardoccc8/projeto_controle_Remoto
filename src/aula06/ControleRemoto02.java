package aula06;

public class ControleRemoto02 implements Controlador {
	private int voulume;
	private boolean ligado;
	private boolean tocando;
	private boolean desligado;
	
	public boolean isDesligado() {
		return desligado;
	}

	public void setDesligado(boolean desligado) {
		this.desligado = desligado;
	}

	public ControleRemoto02() {
		
		this.voulume = 50;
		this.ligado = true;
		this.tocando = false;
		
	}

	private int getVoulume() {
		return voulume;
	}

	private void setVoulume(int voulume) {
		this.voulume = voulume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setDesligado(false);;
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("------Menu------");
		System.out.println("Esta ligado? " + this.getLigado());
		System.out.println("Esta tocando? " + this.getTocando());
		System.out.print("Volume " + this.getVoulume());
		for (int i = 0; i <=  this.getVoulume(); i+= 10) {
			System.out.print("|");
			
			
		}
		
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fenchando Menu.....");
		
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVoulume(this.getVoulume()+5);
		}else {
			System.out.println("Impossivel aumentar o volume");
		}
		
		
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVoulume(this.getVoulume()-5);
		}else {
			System.out.println("Impossivel diminuir volume");
		}
		
		
	}

	@Override
	public void desligarMundo() {
		if (this.getLigado()&& this.getVoulume() > 0);
		this.setVoulume(0);
	
		
		
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Nao consegui reproduzir");
		}
		
		
	}

	@Override
	public void pause() {
		if (this.getLigado()&& this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Nao consegui pausar");
		}
		
		
	}
	
		
   }
