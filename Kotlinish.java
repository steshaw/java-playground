public class Kotlinish {
    static enum Color { BLUE, ORANGE, RED };
    static record Pair<A, B>(A a, B b) {}
    static <A, B> Pair<A, B> pair(A a, B b) {
        return new Pair<A, B>(a, b);
    }
    public static void updateWeather(int degrees) {
        var p = (degrees < 10) ?
            pair("cold", Color.BLUE)
        :  (degrees < 25) ?
            pair("mild", Color.ORANGE)
        : pair("hot", Color.RED);
        switch (p) {
          case Pair(var description, var color) ->
                    System.out.printf("%3d %s %s\n", degrees, description, color);
        };
    }
    public static void main(String args[]) {
        updateWeather(0);
        updateWeather(5);
        updateWeather(10);
        updateWeather(15);
        updateWeather(20);
        updateWeather(25);
        updateWeather(30);
    }
}
