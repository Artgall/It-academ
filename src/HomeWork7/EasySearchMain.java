package HomeWork7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class EasySearchMain {
    public static void main(String[] args) throws IOException {

        String book = "D:\\repositorGitHub\\It-academ\\src\\HomeWork7/WarAndPeace.txt";

        //Преобразует весь текст в байтовый массив, а потом к нижнему регистру
        File file = new File(book);
        FileInputStream fis = new FileInputStream(file);
        byte[] bytesArray = new byte[(int) file.length()];
        fis.read(bytesArray);
        String wap = new String(bytesArray);
        wap = wap.toLowerCase();

        // Реализуем метод search
        EasySearch easySearch = new EasySearch();
        System.out.println("Слово \"война\" встречается " + easySearch.search(wap, " война") + " раз");
        System.out.println("Союз \"и\" встречается " + easySearch.search(wap, " и ") + " раз");
        System.out.println("Слово \"мир\" встречается " + easySearch.search(wap, "мир ") + " раз");

        wap = wap.toLowerCase().replaceAll("\\p{Punct}", " "); // Убрали знаки припинания из текста
        wap = wap.toLowerCase().replaceAll("\\w|\\d", ""); // Убрали цифры из текста

        String[] array = wap.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (String word : array) {
            if (!list.contains(word)) {
                list.add(word);
            }
        }
        System.out.println("Количество уникальных слов: " + list.size());

        //Топ слов
        HashMap<String, Integer> wordsCounts = new HashMap<>(); //Узнаём сколько раз каждое слово встречается
        for (String word : array) {
            if (!wordsCounts.containsKey(word)) {
                wordsCounts.put(word, 0);
            }
            wordsCounts.put(word, wordsCounts.get(word) + 1);
        }

        List<Map.Entry<String, Integer>> wordsTop = new ArrayList<>(wordsCounts.entrySet());
        wordsTop.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for (int i = 1; i < 11 ; i++) {
            Map.Entry<String, Integer> a = wordsTop.get(i);

            System.out.println("Это слово '" + a.getKey() + "' встречается " + a.getValue() + " раз");
        }
    }
}