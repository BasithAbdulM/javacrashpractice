package conditionalstmnts;

public class Who_If_Else_If {

    String MyHero="Vijay";

    public void guess() {
        if (MyHero.equals("Ajith")) {
            System.out.println("Thala");
        } else if (MyHero.equals("Mohanlal")) {
            System.out.println("Laalettan");
        } else if (MyHero.equals("Dulqar")) {
            System.out.println("Star");
        } else {
            System.out.println("Sorry i cant guess");
        }
    }

        public static void main(String[] args) {
        Who_If_Else_If whoIfElseIf=new Who_If_Else_If();
        whoIfElseIf.guess();

    }
}
