public class JavaTesting {
    public static void main(String[] args) {
        String s = "yeahheay";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
