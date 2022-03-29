package classe;


public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(13, 04, 2100);

        d1.ano = 2010;

        String dataInteira1 = d1.obterDataFormatada();
        String dataInteira2 = d2.obterDataFormatada();

        System.out.println(dataInteira1);
        System.out.println(dataInteira2);

    }
}
