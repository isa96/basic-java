public class MethodOverloading {
    public static void main(String[] args) {
        sayHi();
        sayHi("Aaa");
        sayHi("Aaa", "Bbb");
    }

    static void sayHi(){
        System.out.println("Hi");
    }

    static void sayHi(String name){
        System.out.println("Hi " + name);
    }

    static void sayHi(String firstName, String lastName){
        System.out.println("Hi " + firstName + " " + lastName);
    }
}
