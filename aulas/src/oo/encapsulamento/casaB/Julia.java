package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	void testeAcessos() {
		//segredo private
		//facoDentroDeCasa pacote/ default
		//formaDeFalar   protected
		//todosSabes   public
		
		//System.out.println(sogra.segredo);
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabes);
	}
}
