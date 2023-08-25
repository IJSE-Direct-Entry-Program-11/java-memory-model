public class Parent {

    static {
        System.out.println("Parent: Static Initializer");
    }

    static int myParentInt = 10;

    static void myMethod(){
        System.out.println("Hello I am from the Parent!");
    }

//    public static void main(String[] args) {
//        System.out.println("Main Method: " + myParentInt);
//    }

    static {
        System.out.println("Parent: Static Initializer 2: " + myParentInt);
    }
}
