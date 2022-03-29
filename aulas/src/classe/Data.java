package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    Data(int diaR, int mesR, int anoR){
        dia = diaR;
        mes = mesR;
        ano = anoR;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
