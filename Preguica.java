package Heranca;

public class Preguica extends Animal{

	@Override
	public void emitirSom(){
		System.out.println("Som de pregui�a...");
	}
	
	private String movimento;

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
}
