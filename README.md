SOAP_webservice_wsdl_contract_first
===================================

Simple Hello World Expample for a SOAP Webservice build via contract first approach.

## Approach

This project follows the WSDL first (e.g. contract first) approach. The WSDL is developed as contract between the Salesforce-Implementation-Team and the Blacklane-Backend-Team. Every change concerning the SOAP API is resolved via a changed request at WSDL level.

## Prerequisites

 * Maven 2
 * Java Runtime Environment

optional:

  * Eclipse

## Building the project

Enter the project folder and type,

```
mvn clean install
```
(Be patient then you run it the first time on your machine because all dependencies will be resolved and downloaded into your local maven repository folder.)

## Running the project

Then install completes successfully the project can be run locally with:

```
mvn jetty:run
```

This will start a Jetty server on port 8080. Web provided Webservice can now be
inspected at:

http://localhost:8080/

## Creating an Eclipse project

Maven can build an Eclipse project for you running:

```
mvn eclipse:eclipse
```

Therafter you can import the project with the Eclipse import wizzard.

### Troubleshooting

Sometimes Eclipse is complaining about library access, see
http://stackoverflow.com/questions/860187/access-restriction-on-class-due-to-restriction-on-required-library-rt-jar this can be resolved by:


 * Go to the Build Path settings in the project properties.
 * Remove the JRE System Library
 * Add it back; Select "Add Library" and select the JRE System Library. The default worked for me.

### Dependency changes

If dependencies are changed for the maven project it is best to recreate the eclipse project via maven:

```
mvn eclipse:clean
mvn eclipse:eclipse
```

## License
Hereby released under MIT license.

## Authors/Contributors

- [BlackLane GmbH](http://www.blacklane.com "Blacklane")
- [Carsten Wirth](http://github.com/jethroo)
