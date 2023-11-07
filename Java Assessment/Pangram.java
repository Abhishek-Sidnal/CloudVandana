public class Pangram {
    public static void main(String[] args) {
        String s = "Abcd efghi jklmno pqrst uvwxyz";
        boolean result = panagram(s.toLowerCase());
        if (result) {
            System.out.println(s + " is a panagram");
        } else {
            System.out.println(s + " is not a panagram");
        }
    }

    static boolean panagram(String s) {
        if (s.length() < 26) {
            return false;
        } else {

            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
