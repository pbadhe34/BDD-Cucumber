package test.com.service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import cucumber.api.java8.En;


public class SoapService_LiveTest implements En{
	
	private HttpURLConnection connection;
	URL wsdlURL = null;
	
	public SoapService_LiveTest() {
	Given("^connect to service wsdl URL$", () -> {
		
		try {
			wsdlURL = new URL("http://localhost:8090/StudentApp/services/StudentPort?wsdl");
			connection = (HttpURLConnection) wsdlURL.openConnection();
					
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	      
	     
	});

	When("^send request with default http get method$", () -> {
		try {
			connection.setRequestMethod("GET");
			connection.connect();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	});

	Then("^verify the http response code$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	     
	});

	When("^get the service interface$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    
	});

	Then("^verify the service port Interface$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    
	});

	Then("^invoke the getData operation and verify the output$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    
	});

	Then("^invoke the readData operation and verify the output$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	     
	});

}

	 	
	/*private  void testGetRequest() throws MalformedURLException, IOException, ProtocolException {
		String parameters = "user=Ashok";
	    parameters += "&password=sdfsrsE";  
		URL loginURL = new URL("http://localhost:8090/WebLoginApp/login?"+parameters);
	      HttpURLConnection connection = (HttpURLConnection) loginURL.openConnection();
	      
	      connection.setRequestMethod("GET");
	      System.out.println("The get method URL is "+loginURL);      
	       
	      //connection.connect();	     
	     
	      BufferedReader reader = new BufferedReader(new
	              InputStreamReader(connection.getInputStream()));

	      System.out.println("The http Get request outout is  ");

	      String line = reader.readLine();
	      while (line != null)
	      {
	         System.out.println(line);
	         line = reader.readLine();
	      }
	      System.out.println("The http Get method  response code is  "+connection.getResponseCode());

	      connection.disconnect();
	}


	*//**
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws ProtocolException
	 *//*
	private static void testPostRequest() throws MalformedURLException, IOException, ProtocolException {
		URL loginURL = new URL("http://localhost:8090/WebLoginApp/login");
	      HttpURLConnection connection = (HttpURLConnection) loginURL.openConnection();
	      connection.setDoOutput(true);
	      connection.setRequestMethod("POST");
	      
	      String userParam = "user=viju";
	      userParam+= "&password=SeKreT100";
	      
	      OutputStreamWriter writer = new OutputStreamWriter(
	      connection.getOutputStream());
	      writer.write(userParam);	      
	      writer.flush();
	      
	      System.out.println("The http POst request response code is  "+connection.getResponseCode());

	     
	      BufferedReader reader = new BufferedReader(new
	              InputStreamReader(connection.getInputStream()));

	      System.out.println("The http post request outout is  ");

	      String line = reader.readLine();
	      while (line != null)
	      {
	         System.out.println(line);
	         line = reader.readLine();
	      }
	      connection.disconnect();
	}*/

}
