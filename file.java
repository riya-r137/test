public class file {
    static void greet(String name) {
        System.out.println("Hi, " + name);
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            greet("User " + i);
        }
    }
}