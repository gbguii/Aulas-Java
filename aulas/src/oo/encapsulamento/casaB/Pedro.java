package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro  extends Ana{
	
	void testeAcessos() {
		//segredo private
		//facoDentroDeCasa pacote/ default
		//formaDeFalar   protected
		//todosSabes   public
		
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabes);
	}
}
