package constructor;

public class ParametrisedConstructor {
    String pm_name;
    String cm_name;

    ParametrisedConstructor(String p,String c){
        pm_name=p;
        cm_name=c;

    }
    public void sayabout(){
        System.out.println("CM is"+cm_name+"and PM is "+pm_name);
    }
    public static void main(String[] args) {
        ParametrisedConstructor parametrisedConstructor1=new ParametrisedConstructor("Modi","Edappdi");
        parametrisedConstructor1.sayabout();
        ParametrisedConstructor parametrisedConstructor2=new ParametrisedConstructor("Aravind","Prem");
        parametrisedConstructor2.sayabout();

    }
}
