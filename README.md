# Demo project for testing Pet Store using Serenity and Cucumber

[![CI](https://gitlab.com/valentin-apostu/serenity-cucumber-petstore/badges/master/pipeline.svg)](https://gitlab.com/valentin-apostu/serenity-cucumber-petstore/-/commits/master)

## Useful links
GitHub repo - https://github.com/valentin-apostu/serenity-cucumber-petstore

GitLab CI - https://gitlab.com/valentin-apostu/serenity-cucumber-petstore/-/pipelines

## Description
This is a skeleton framework to show how the PetStore API (https://petstore.swagger.io) can be tested using Serenity and Cucumber.
The 
## Setup
### Run Locally
The project is hosted on GitHub. It can be either downloaded as a zip file or cloned.

####To download locally as zip file follow these steps
> * open in a browser the link https://github.com/valentin-apostu/serenity-cucumber-petstore</br>
> * select master branch
> * click the __Code__ dropdown and select __Download__ zip
>
####To download locally by cloning the repository
> * open Terminal (on MacOS or Linux) or CommnandLine (on Windows) and run 
> ```git --version```
 to check if git is already installed on the machine. If the version of git is not displayed then do the next step.
> * (OPTIONAL) Download and install Git following the instructions from https://git-scm.com/download/ 
> * Run ```git clone https://github.com/valentin-apostu/serenity-cucumber-petstore.git```

#### Configuration
The framework can be run against multiple environments. The environments are defined in:
> * ```/src/test/resources/configurations/configurations.json``` file

####To run the tests locally run
> * ```cd serenity-cucumber-petstore```
> * ```mvn clean verify``` - will default to QA environment
> * (OPTIONAL) ```mvn -Denv=dev clean verify``` - will test against the DEV environment

#### Check report
After the tests are run a report is generated. The report link is displayed at the end of the log. It should be something like:
file://projects_folder/target/site/serenity/index.html. The link can be opened in a browser. 

The report will contain information about:
> * Features that were tested
> * Scenarios for every Feature
> * Test Result for each Scenario
> * the logged request and response, with all details

## Run in CI
The CI pipeline was created in GitLab. On each commit the pipeline is run. The pipeline has 2 phases
> * Build - that build the code
> * Test - that runs the tests and saves the Test Report as an artifact 

The overview of all the runs is available here https://gitlab.com/valentin-apostu/serenity-cucumber-petstore/-/pipelines
For each run the Test Report is saved and stored for 30 days. The report can be downloaded locally or browsed directly in GitLab.

## Framework structure
> * Configurations folder

Contains the configurations.json file that allows the framework to be configured for different environments. At the moment, it allows the definition of API Base Url per environment.
> * Runner class (CucumberTestSuite)

The Test Runner helps running the feature files and it connects feature files with the Step Definition classes
> * Models & Builders

Contain classes that that help with creating and parsing data.
> * Steplibs

Contains code that is used by multiple step definition methods, to prevent duplication and to keep files manageable in size.  
> * Step Definition files

Classes that hold the code that automates the steps from the Feature files.
> * Features files

Plain language files, that use Gherkin syntax, to define the expected behaviour of the application.
> * Utilities

A location that holds classes that define constants or read the configuration the file
> * EndPoints class

Helper class to hold the API endpoints that we want to test.

## How to add new tests
> * Add a new Feature file/or add new Scenarios to existing feature file depending on the functionality that needs to be tested.
> * Keep Feature and StepDefinition files manageable in size.
> * Extract common functionality in Step Libraries.
> * Write new test Scenarios in Gherkin format (see https://cucumber.io/docs/gherkin/reference/ for extra information)
> * Automate the scenario steps using Java (see https://cucumber.io/docs/gherkin/step-organization/ for extra information)
> * Test first locally to check that everything is fine and then commit.
> * Add new endpoints to ```PetStoreEndpoints class```

## Best practices 
> * follow industry best practices for Source Control Management (see https://www.atlassian.com/git/tutorials/source-code-management)
> * use DRY, SOLID principle and Design Patterns

## Future Improvements
> * add logging to file
> * increase coverage


