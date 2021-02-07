import java.util.Arrays;

class Args {
  public static void main(String... args) {
    Arrays.asList(args).forEach(arg -> {
      System.out.printf("arg = %s\n", arg);
    });
  }
}
