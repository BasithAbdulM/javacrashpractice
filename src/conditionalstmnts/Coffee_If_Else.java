package conditionalstmnts;

public class Coffee_If_Else {
   // Data type:boolean- true,false
    boolean iscuempty = true;

    public static void main(String[] args) {
        Coffee_If_Else coffee_if_else = new Coffee_If_Else();
        if (coffee_if_else.iscuempty) {
            System.out.println("Fill The Cup");

        } else {
            System.out.println("Drink Coffee");
        }
    }
}