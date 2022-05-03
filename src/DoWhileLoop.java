public class DoWhileLoop {
    public static void main(String[] args) {
        // Walaupun tidak valid minimal ada 1 hasil yang dikeluarkan di DoWhile
        var counter = 100;

        do{
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10);
    }
}
