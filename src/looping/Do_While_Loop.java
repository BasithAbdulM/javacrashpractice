package looping;

public class Do_While_Loop {

    public void vowels(){
        int kk=1;
        do {
            System.out.println("English Vowels are"+   "A"+  "E"+  "I"+  "O"+  "U");
            kk++;
        }while (kk<=30);
    }
    public static void main(String[] args) {
        Do_While_Loop doWhileLoop=new Do_While_Loop();
        doWhileLoop.vowels();

    }
}
