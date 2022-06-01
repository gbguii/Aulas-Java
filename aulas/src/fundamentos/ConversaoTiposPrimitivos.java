package fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.141234235346; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 432534;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
