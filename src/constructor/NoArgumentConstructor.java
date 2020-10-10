package constructor;

public class NoArgumentConstructor {
    String nacname;
    int nacid;

   // No Arguments will be there
   // It will allow us to write logic when object is created
    //This is not a Default constructor

    NoArgumentConstructor(){
        nacname="AAri";
        nacid=1;
        System.out.println("NAC is created");

    }
    public static void main(String[] args) {
        NoArgumentConstructor nac=new NoArgumentConstructor();
        System.out.println(nac.nacname);
        System.out.println(nac.nacid);

    }
}
