public class HelloWorld {
    public static String hello(){
//        System.out.println();
        return "Hello, World!";
    }

    public static String hello(String name) {
//        System.out.println("OneArgumentHere");
        if (name == null) {
            throw new IllegalArgumentException("People can't not have a name...");
        }
        return "Hello, " + name + "!";
    }
}