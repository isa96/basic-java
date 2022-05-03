public class Scope {
    public static void main(String[] args) {
        sayHi("Aaa");
        sayHi("");
    }
    static void sayHi(String name){
        String hi = "Hi " + name;

        if(!name.isBlank()){
            String hai = "Hai " + name;
            System.out.println(hai);
        }

        // ini masih bisa diakses karena masih dalam 1 blok di method
        System.out.println(hi);
        // System.out.println(hai); ini error karena scope dari hai berada dalam blok if
    }
}
