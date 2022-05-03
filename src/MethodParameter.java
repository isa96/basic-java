public class MethodParameter {
    public static void main(String[] args) {
        sayHi("Aaa", "Bbb");
        sayHi("Ccc", "Ddd");
        sayHi("Eee", "Fff");

    }
    static void sayHi(String firstName, String lastName){
        System.out.println("Hi, " + firstName + " " + lastName);
    }
}
