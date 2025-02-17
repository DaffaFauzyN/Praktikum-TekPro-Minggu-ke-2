import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Menggunakan try-with-resources
            
            // Membaca input string A dan B
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            
            // 1. Menjumlahkan panjang A dan B
            System.out.println(A.length() + B.length());
            
            // 2. Menentukan apakah A lebih besar secara leksikografis dibanding B
            System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
            
            // 3. Kapitalisasi huruf pertama pada A dan B
            String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
            
            // Mencetak hasil akhir dengan spasi
            System.out.println(capitalizedA + " " + capitalizedB);
        }
    }
}
