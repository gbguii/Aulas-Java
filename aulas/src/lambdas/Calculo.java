package lambdas;
@FunctionalInterface
public interface Calculo {
	// Classe funcional.
	// Só pode receber um unico método abstrato.
	public double executar(double a, double b);
	
	default String heloWorld(){
		return "Ola Mundo!";
	}
	static String heloPeople(){
		return "Ola Pessoas!";
	}
}
