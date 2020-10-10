package returntype;

public class CollectAmd {

    //Wrapper class
   public Integer ca=10000;

    public  Integer collectandreturn(){
        System.out.println("CollectAmound" +  ca);
        return ca;
    }

    public static void main(String[] args) {
        CollectAmd collectAmd=new CollectAmd();
        Integer amd=collectAmd.collectandreturn();
        System.out.println("GOT" +amd);

    }
}
