package Java;

public class CP {
    public static void main(String[] args) {
        int i=12,
    }

   
    private static void printCombinationsHelper(String prefix, String suffix) {
        if (suffix.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                printCombinationsHelper(prefix + suffix.charAt(i), suffix.substring(i + 1));
            }
        }
    }

    public static void printCombinations(String str) {
        int n = str.length();
        int count = 1 << n;
    
        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb.toString());
        }
    }
}