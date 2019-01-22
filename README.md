# Project Title

Starter Kit for BDD tests using Cucumber-Spring, JVM parallel plugin, Trivago, Spring depedency injection

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
 1) Download and open in any java IDE (project is built on java 11)
 2) Should work on java 8 as well with one small change (refer to the POM file)
 3) There will not be Cucumber runner class as JVM parallel Plugin glues the features and stepdefinition at run time
 

       

### KeyFeatures

1) No cucumber runner class is used so the url selected for the tests as well the scenarios/features can be selected run time
2) @value tags are used to select which properties file to load at the run time
3) In large projects this control is needed for switching between test environments
4) Unfriendly reports are generated using trivago plugin
5) The tests can run from POM using below command. refer the example

 ```
  clean test -Durlid=url2 -DcucumberTags=@feature1,@feature2
  
  java lang argument Durlid controls which properities file to load run time
  java lang argument DcucumberTags controls which tags to run 
  
 ```


```
Give examples
```

### Common erros

1. Unable to run with right click on scenario and run on IDE ---> THis happens because Cucumber Spring dependency added package "cucumber.api.spring" to glue section in IDE incorrectly removing it will help.
2. Running tests in sequence vs running in parallel --> Can be controlled with JVM parallel plugin and fork count (refer POM) 


`
## Still to come

* More tests will be added
