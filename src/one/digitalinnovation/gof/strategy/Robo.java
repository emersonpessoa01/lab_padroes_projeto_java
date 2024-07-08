package one.digitalinnovation.gof.strategy;

/**
 * 
 */
public class Robo {
	private static Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public static void mover() {
		comportamento.mover();
		
	}
	

}
