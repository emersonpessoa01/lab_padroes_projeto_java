package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a> 
 * @author emersonpessoa01
 */

public class SingletonEager {
	private static class InstanceHolder{
		public static SingletonEager instancia = new SingletonEager();	
	}

	private SingletonEager() {
		super();

	}

	public static SingletonEager getInstancia() {
		return InstanceHolder.instancia;

	}

}
