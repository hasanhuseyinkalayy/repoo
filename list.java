package practice_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class list {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Merhaba");
        liste.add("Dünya");
        liste.add("");
        liste.add("Java");
        liste.add("Programlama");
        liste.add("");

        // Boş olmayan stringleri al ve tekrar etmeyen büyük harflere dönüştür
        Set<String> uniqueBuyukHarfStringler = new HashSet<>();
        for (String s : liste) {
            if (!s.isEmpty()) {
                uniqueBuyukHarfStringler.add(s.toUpperCase());
            }
        }

        // 'A' karakteri içerenleri seç ve büyükten küçüğe sırala
        List<String> sonucListesi = new ArrayList<>(uniqueBuyukHarfStringler);
        sonucListesi.removeIf(s -> !s.contains("A"));
        Collections.sort(sonucListesi, Collections.reverseOrder());

        // Sonucu yazdır
        for (String s : sonucListesi) {
            System.out.println(s);
        }
    }
}