package execao;


public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		geraErro1();
		geraErro2();

	}
	// Exceção não checada/verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	// Exceção checada/verificada
	static void geraErro2() {
		try {
			new Exception("Ocorreu um erro bem legal #02");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
