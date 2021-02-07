import static java.lang.System.err;
import static java.lang.System.exit;
import static java.lang.System.out;

public class Palindrome {
  static Boolean isPalindrome(String word) {
    return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
  }

  public static void main(String... args) {
    if (args == null || args.length != 1) {
      err.println("usage: palindrom-checker <string>");
      exit(2);
    }
    var word = args[0];
    var isPal = isPalindrome(word);
    out.printf("\"%s\" %s a palindrome%n", word, isPal ? "is" : "is not");
  }
}
