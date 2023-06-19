import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

class Try {
    public static void main(final String[] args) throws IOException {
        System.out.println(readData("one\ntwo\nthree\n"));
    }

    static List<String> readData(final String message) throws IOException {
        final StringReader input = new StringReader(message);
        try (
            final BufferedReader br1 = new BufferedReader(input);
            final BufferedReader br2 = new BufferedReader(input);
            final BufferedReader br3 = new BufferedReader(input);
        ) {
            final String s1 = br1.readLine();
            System.out.println("s1 = " + s1);
            final String s2 = br2.readLine();
            System.out.println("s2 = " + s2);
            final String s3 = br3.readLine();
            System.out.println("s3 = " + s3);
            return List.of(s1, s2, s3); // NPE!
        }
    }
}
