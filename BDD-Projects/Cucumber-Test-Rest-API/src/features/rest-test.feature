@TestRest
Feature: Test the REDST API
 
  Scenario: Verify the output with get     
     Given connect to REST GET URL
     When send get request	 
	 Then verify the output
	 
 Scenario: verify with  post new data
     Given connect to REST POST URL
	 When send post request	 
	 Then verify the post output
    
