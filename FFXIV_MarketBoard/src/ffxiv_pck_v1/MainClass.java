package ffxiv_pck_v1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainClass {

	public static void main(String[] args) {
	
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://universalis.app/api/history/Twintania/8"))
                .build();

        HttpResponse<String> response = null;
        
		try {
			response = client.send(request,
			        HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {

			e.printStackTrace();
		}

        System.out.println(response.body());

	}
	

	
}
