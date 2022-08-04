package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador){
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner sc = new Scanner(System.in);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("O anivsersariante chegou? ");
			valor = sc.nextLine();
			EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
			if(valor.equalsIgnoreCase("sim")) {
				observadores.stream().forEach( o -> o.chegou(evento));
				valor = "sair";
			}else {
				System.out.println("Alarme Falso");
			}
		}
		sc.close();
	}
}
