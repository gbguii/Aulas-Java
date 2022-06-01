package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	void testeAcessos() {
		//segredo private
		//facoDentroDeCasa pacote/ default
		//formaDeFalar   protected
		//todosSabes   public
		
		//System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabes);
	}
}
