import java.util.HashMap;

public class Lab2 {
    public static boolean areAnagrams (String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            updateHashMap(sMap, s.charAt(i));
            updateHashMap(tMap, t.charAt(i));
        }
        return tMap.equals(sMap);
    }

    public static void updateHashMap (HashMap<Character, Integer> map, Character ch) {
        if (!map.containsKey(ch)) {
            map.put(ch, 1);
        } else {
            map.replace(ch, map.get(ch) + 1);
        }
    }

    public static void main(String[] args) {
        String a = "1234 5678 999 abc";
        String b = "999 54321 876 cab";

        System.out.println(areAnagrams(a, b));
    }
}
