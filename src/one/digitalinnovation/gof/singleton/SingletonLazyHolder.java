package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author emersonpessoa01
 */

public class SingletonLazyHolder {
	private static SingletonLazyHolder instancia = new SingletonLazyHolder();

	private SingletonLazyHolder() {
		super();

	}

	public static SingletonLazyHolder getInstancia() {
		return instancia;

	}

}
