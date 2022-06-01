package fundamentos;

public class Teste {

	public static void main(String[] args) {
		String nome = "camel-casE";
		
		if(nome.contains("-")) {
			int localChar = nome.indexOf("-");
			String camelo = nome.substring(localChar+1).toLowerCase();
			String semTraco = nome.substring(0, localChar);
			String subCamelo1 = camelo.substring(0, 1).toUpperCase();
			String subCamelo2 = camelo.substring(1);
			String cameloFinal = subCamelo1 + subCamelo2;
			System.out.println(semTraco+cameloFinal);
		}
		String nome2 = "U+03B1coxa";
		if(nome2.contains("[U+03B1-U+03D6]")) {
			String semGrego = nome2.replace("[U+03B1-U+03D6]", "");
			System.out.println(semGrego);
		}
		char c = '\u0398';
		System.out.println(c);
		

	}

}
