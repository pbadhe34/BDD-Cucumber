$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SoapService-Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Soap Web Service",
  "description": "",
  "id": "test-the-soap-web-service",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the service wsdl URL",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-wsdl-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "send request with default http get method",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify the http response code",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 8,
  "name": "Verify the service port",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-port",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "get the service interface",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify the service port Interface",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "verify the service operation getData",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-operation-getdata",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "get the service interface",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "invoke the getData operation and verify the output",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "verify the service operation readData",
  "description": "",
  "id": "test-the-soap-web-service;verify-the-service-operation-readdata",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "connect to service wsdl URL",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "get the service interface",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "invoke the readData operation and verify the output",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});