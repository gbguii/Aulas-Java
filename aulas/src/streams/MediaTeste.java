package streams;

public class MediaTeste {

	public static void main(String[] args) {
		Media m1 = new Media();
		m1.adicionar(7.8);
		m1.adicionar(8.3);
		Media m2 = new Media();
		m2.adicionar(6.8);
		m2.adicionar(8.5);
		System.out.println(m1.getValue());
		System.out.println(m2.getValue());
		System.out.println(Media.combinar(m1, m2).getValue());
	}

}
