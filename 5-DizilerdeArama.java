// Kütüphaneyi eklemeyi unutmayın.
import java.util.Arrays;

public class DizilerdeArama {
    public static void main(String[] args) {
        int[] dizi = {3, 5, 77, 22, 13};
        
        // Önce dizinin sıralanması gerekiyor.
        Arrays.sort(dizi);
        
        /** Dizide arama yapalım. Bu yöntem bulunan elemanın sırasını veriyor.
         * Sıralama yaptığımız için sıralandıktan sonraki sırasını verdiğini
         * unutmayın.
        */
        int deger = Arrays.binarySearch(dizi, 13);
        
        System.out.println("Aranan sayının indisi: " + deger);
    }
}
