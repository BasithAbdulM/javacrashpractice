package constructor;

public class ConstructorOvrloading {
    String kittten;

    ConstructorOvrloading() {
        System.out.println("object is created");

    }
    ConstructorOvrloading(String cat ){
        kittten=cat;
        System.out.println("Bujji"+cat);
    }




    public static void main(String[] args) {
        ConstructorOvrloading constructorOvrloading=new ConstructorOvrloading();
        ConstructorOvrloading conso=new ConstructorOvrloading("kenny");

    }
}
