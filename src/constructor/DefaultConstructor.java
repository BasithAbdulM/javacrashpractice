package constructor;

public class DefaultConstructor {

    String Student_name;
    int stu_id;
    //Eg for Default Constructor
   // Do u see any constructor here?? Nope
    //Defult value: string is Null
    //Defult value: int is 0
    //Compile will create one constructer


    public static void main(String[] args) {
        DefaultConstructor defaultConstructor=new DefaultConstructor();
        System.out.println(defaultConstructor.Student_name);
        System.out.println(defaultConstructor.stu_id);


    }
}
