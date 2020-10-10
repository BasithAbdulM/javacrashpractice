package conditionalstmnts;

public class Hero_Not_Switch_Cse {
    String Hero="Dhoni";

    public void heroornot(){
        switch (Hero){
            case "salman":
                System.out.println("Bollywood");
                break;
            case "saif":
                System.out.println("Bollywood");
                break;
            case "Dhoni":
                System.out.println("CoolCaptain");
                break;
            case "Yuvan":
                System.out.println("Music");
            default:
                System.out.println("Not Found");
        }
    }
    public static void main(String[] args) {
        Hero_Not_Switch_Cse heroNotSwitchCse=new Hero_Not_Switch_Cse();
        heroNotSwitchCse.heroornot();

    }
}
