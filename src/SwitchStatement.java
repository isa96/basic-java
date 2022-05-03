public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }
        // Switch Lamda
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Muungkin Anda Salah Jurusan");
            }
        }
        // Switch Tanpa Yield Keyword
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Muungkin Anda Salah Jurusan";
            }
        }

        System.out.println(ucapan);

        // Switch With Yield Keyword
        ucapan = switch (nilai) {
            case "A":
                yield "Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Muungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
