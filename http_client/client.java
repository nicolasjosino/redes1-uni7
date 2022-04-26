package http_client;

import java.net.http.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse.*;

public class client {

	public static String getResponse(HttpClient client, HttpResponse<String> response, HttpRequest request) {
		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response.toString();
	}

	public static void main(String[] args) {
		String postURL = "https://portaltotvs.7setembro.com.br/Corpore.NET//Source/EDU-EDUCACIONAL/Public/EduPortalAlunoLogin.aspx?AutoLoginType=ExternalLogin&undefined";
		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = null;
		HttpRequest request = HttpRequest.newBuilder(URI.create("https://www.uni7.edu.br/"))
				.GET()
				.build();
		System.out.println(getResponse(client, response, request));

		request = HttpRequest.newBuilder(URI.create(postURL))
				.POST(HttpRequest.BodyPublishers.ofString("User=2110008&Pass=dasdasda&Alias=CorporeRM"))
				.build();
		System.out.println(getResponse(client, response, request));

	}

}
