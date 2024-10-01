package learnmore;

public class ConstructorExample {

    static int a;
    static String b;
    public ConstructorExample(){
        a=5;
    }

    public ConstructorExample(String b){
        this.b=b;

    }

    public static void main(String[] args) {
        ConstructorExample c = new ConstructorExample("abc");
        System.out.println(a);
        System.out.println(b);
    }
}
