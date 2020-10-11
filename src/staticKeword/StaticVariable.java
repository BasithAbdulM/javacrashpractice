package staticKeword;

public class StaticVariable {
    static int acBalance=0;
    String Depositedby;
    public static void main(String[] args) {
        StaticVariable staticVariable1=new StaticVariable();
        acBalance=100000;
        staticVariable1.Depositedby="Abdul";

        StaticVariable staticVariable2=new StaticVariable();
        acBalance=200000;
        staticVariable2.Depositedby="Basith";

        StaticVariable staticVariable3=new StaticVariable();
        acBalance=300000;
        staticVariable3.Depositedby="M Abdul Basith";

        System.out.println("sv1 int:"+ staticVariable1.Depositedby);
        System.out.println("sv2 int:"+staticVariable1.acBalance);

        System.out.println("sv3 int:"+staticVariable2.Depositedby);
        System.out.println("sv1 int:"+staticVariable2. acBalance);

        System.out.println("sv2 int:"+staticVariable3.Depositedby);
        System.out.println("sv3 int:"+staticVariable3.acBalance);




    }
}
