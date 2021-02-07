import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import static java.lang.System.out;
import java.io.IOException;

class Get {
  public static void main(String... args) throws InterruptedException, IOException {
    var client = HttpClient.newBuilder().build();
    var request = HttpRequest.newBuilder(
      URI.create("https://reqres.in/api/users/2")
    ).build();
    var response = client.send(request, BodyHandlers.ofString());
    if (response.statusCode() == 200) {
      out.println(response.body());
    }
  }
}
