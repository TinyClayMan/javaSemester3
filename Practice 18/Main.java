public class Main {

    public static void factors(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            factors(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            factors(n, ++k);
        }
    }

    public static boolean isPalindrome(String s) {
        char firstChar;
        char lastChar;
        int size = s.length();
        String subString;
        // Базовый случай
        if (size <= 1) {
            return true;
        } else {
            firstChar = s.toCharArray()[0];
            lastChar = s.toCharArray()[size - 1];
            subString = s.substring(1, size - 1);
            // Шаг рекурсии / рекурсивное условие
            return firstChar == lastChar && isPalindrome(subString);
        }
    }

    public static int getMax() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, getMax());
        }
    }

    public static void main(String[] args) {
        factors(150, 2); // вызов поиска простых множителей
        System.out.println(isPalindrome("tattarrattat") ? "YES" : "NO");
        System.out.println(getMax());
    }
}
