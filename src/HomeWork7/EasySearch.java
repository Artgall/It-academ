package HomeWork7;

public class EasySearch implements ISearchEngine {

    @Override
    public int search(String wordList, String wordSearch) {
        int count = 0;
        while (wordList.contains(wordSearch)) {
            count++;
            wordList = wordList.substring(wordList.indexOf(wordSearch) + wordSearch.length());
        }
        return count;
    }
}
