public class Variabel {
    public static void main(String[] args) {
        String name;
        name = "Aaa";

        System.out.println(name);

        int age = 20;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Bbb";
        System.out.println(name);

        var firstName = "Aaa";
        var middleName = "Bbb";
        var lastName = "Ccc";
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        // Jika menggunakan final data dalam variabel tidak bisa diubah.
        final String application = "Belajar Java Dasar";
        System.out.println(application);
    }
}
