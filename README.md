# Demo project for testing Pet Store using Serenity and Cucumber

[![CI](https://gitlab.com/valentin-apostu/serenity-cucumber-petstore/badges/master/pipeline.svg)](https://gitlab.com/valentin-apostu/serenity-cucumber-petstore/-/commits/master)


## Description
This is a skeleton framework to show how the PetStore API (https://petstore.swagger.io) can be tested using Serenity and Cucumber.
## Setup
### Run Locally
The project is hosted on GitHub. It can be either downloaded as a zip file or cloned.

####To download locally as zip file follow these steps ####
> * open in a browser the link https://github.com/valentin-apostu/serenity-cucumber-petstore</br>
> * select master branch
> * click the __Code__ dropdown and select __Download__ zip
>
####To download locally by cloning the repository ####
> * open Terminal (on MacOS or Linux) or CommnandLine (on Windows) and run 
> ```git --version```
 to check if git is already installed on the machine. If the version of git is not displayed then do the next step.
> * (OPTIONAL) Download and install Git following the instructions from https://git-scm.com/download/ 
> * Run ```git clone https://github.com/valentin-apostu/serenity-cucumber-petstore.git```

####To run the tests locally do ####
> * ```cd serenity-cucumber-petstore```
> * ```mvn clean verify```

#### Check report ####
After the tests are run a report is generated. The report link is displayed at the end of the log. It should be something like:
file://projects_folder/target/site/serenity/index.html. The link can be opened in a browser. 

The report will contain information on:
> * Features that were tested
> * Scenarios for every Feature
> * Test Result for each Scenario
> * the logged request and response, with all details

## Run in CI
The CI pipeline was created in GitLab. On each commit the pipeline is run. The pipeline has 2 phases
> * Build - that build the  code
> * Test - that runs the tests and saves the Test Report as an artifact 

The overview of all the runs is available here https://gitlab.com/valentin-apostu/serenity-cucumber-petstore/-/pipelines
For each run the Test Report is saved and stored for 30 days. The report can be downloaded locally or browsed directly in GitLab.

# Framework structure
> * Runner
> * Models
> * Builders
> * Step Definitions
> * Feature files
> * Utilities

# How to add new tests
> * add new feature file. Write new test Scenarios in Gherkin format (see https://cucumber.io/docs/gherkin/reference/ for extra information)
> * automate the scenario steps using Java (see https://cucumber.io/docs/gherkin/step-organization/ for extra information)
> * test first locally to check that everithing is fine and then commit.

## Best practices 
> * follow industry best practices for Source Control Management (see https://www.atlassian.com/git/tutorials/source-code-management)
> * use DRY, SOLID principle and Design Patterns
> * keep your feature and step definitions files manageable in size.


## Future Improvements
> * add logging
> * make it run in multiple environments
> * increase coverage by adding test cases


