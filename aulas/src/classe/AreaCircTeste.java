package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(5.6);
        System.out.println(a1.area());

        double calculoArea = AreaCirc.area(a1.area());
        System.out.println("Area calculada através do static "+ calculoArea);


        AreaCirc a2 = new AreaCirc(5.6);
        System.out.println(a2.area());
    }

}
