public class Demo extends Parent{

    static int myInt = 5;

    static {
        System.out.println("Static Initializer 1");
        myInt = 10;
    }

//    public static void main(String[] args) {
//        System.out.println("Main Method: " + myInt);
//    }

    static {
        System.out.println("Static Initializer 2");
        myInt = 20;
    }
}
