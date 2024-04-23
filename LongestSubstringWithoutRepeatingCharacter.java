// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println(subString("bbbbb"));
    }
    
  public static String subString(String input){

        HashSet<Character> set = new HashSet<Character>();

        String longestOverAll = "";
        String longestTillNow = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (set.contains(c)) {
                longestTillNow = "";
                set.clear();
            }
            longestTillNow += c;
            set.add(c);
            if (longestTillNow.length() > longestOverAll.length()) {
                longestOverAll = longestTillNow;
            }
        }

        return longestOverAll;
    }
}
