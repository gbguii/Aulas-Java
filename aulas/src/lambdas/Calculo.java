package lambdas;
@FunctionalInterface
public interface Calculo {
	// Classe funcional.
	// S� pode receber um unico m�todo abstrato.
	public double executar(double a, double b);
	
	default String heloWorld(){
		return "Ola Mundo!";
	}
	static String heloPeople(){
		return "Ola Pessoas!";
	}
}
