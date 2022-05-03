public class Array {
    public static void main(String[] args) {
        // Cara buat array pertama
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Aaa";
        stringArray[1] = "Bbb";
        stringArray[2] = "Ccc";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Mengganti isi data index ke 0
        stringArray[0] = "Ddd";

        System.out.println(stringArray[0]);

        // Cara buat array ke 2
        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Aaa", "Bbb", "Ccc"
        };

        /* Menghapus data array itu tidak ada adanya merubah isi data
           Atau jika terlanjur membuat panjang array maka isi data sesuai tujuan
           lalu index lainnya di kosongkan */

        // Mengkosongkan data index ke 0
        namaNama[0] = null;

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Aaa", "Bbb"},
                {"Ccc", "Ddd"},
                {"Eee"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
