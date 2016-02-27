package com.mkyong.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPost {

	public String postWebService(String[] args) {
		
		String output=null;

		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:8081/RESTfulExample/rest/json/metallica/post");

			String input = "{\"orderno\":\"21\",\"products\":[{\"product_name\":\"Mobile lumia 720\",\"product_price\":\"14000\",\"product_rating\":\"4\",\"product_ID\":\"1\"},{\"product_name\":\"Xperia U\",\"product_price\":\"17000\",\"product_rating\":\"3\",\"product_ID\":\"2\"},{\"product_name\":\"One plus one\",\"product_price\":\"20000\",\"product_rating\":\"4.5\",\"product_ID\":\"3\"}],\"gross\":\"Net + TAX\"}";

			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, input);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			output = response.getEntity(String.class);
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}
		return output;

	}

}
