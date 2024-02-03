package com.HttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class PostData {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2).connectTimeout(Duration.ofSeconds(55)).build();
		
	String url="https://jsonplaceholder.typicode.com/posts";
	String postData = "{\"title\":\"test post\",\"body\":\"This is not a test post asshole\",\"userId\":1}";

   HttpRequest request= HttpRequest.newBuilder()
		   .header("content-Type", "application/json")
		   .POST(HttpRequest.BodyPublishers.ofString(postData))
		   .uri(URI.create(url)).build();
   
   HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
   System.out.println(response.body());
	}

}
