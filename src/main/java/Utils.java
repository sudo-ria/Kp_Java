import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    public static Map<Character, Integer> getCharacntersCountInWord(String word){
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for (int i = 0; i < word.length(); ++i)
        {
            char charAt = word.charAt(i);

            if (!result.containsKey(charAt))
            {
                result.put(charAt, 1);
            }
            else
            {
                result.put(charAt, result.get(charAt) + 1);
            }
        }
        return result;
    }

    public static  List<String> getWords (String mainWord, String[] words){
        List result = new ArrayList();
        Map<Character, Integer> mainCount = Utils.getCharacntersCountInWord(mainWord);
        for (String word : words) {
            Map<Character, Integer> wordCount = Utils.getCharacntersCountInWord(word);
            boolean allOk = true;
            for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
                Integer countCharacterInMainWord = mainCount.get(entry.getKey());
                if (countCharacterInMainWord == null){
                    allOk = false;
                    break;
                }
                if (countCharacterInMainWord < entry.getValue()){
                    allOk = false;
                    break;
                }
            }
            if (allOk){
                result.add(word);
            }
        }
        return result;
    }
}
