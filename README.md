helloworld
==========

###Jenkins Plugins We Need###

1. **Git Plugin**

   This plugin allows use of Git as a build SCM.

2. **Maven Project Plugin** (if Jenkins version is too old)

   Jenkins plugin for building Maven 2/3 jobs via a special project type.

3. **Parameterized Trigger Plugin**

   Trigger parameterized builds of other jobs.

4. **EnvInject Plugin**

   This plugin makes it possible to have an isolated environment for your jobs.
	
5. **Copy Artifact Plugin**

   Adds a build step to copy artifacts from another project.

6. **Github Plugin**

   Trigger a build when a change is pushed to GitHub. However, jenkins-job-builder may not be able to support this plugin.

###Script to generate Jenkins Jobs###

1. Build job  - yamls/TestAndPackage.yaml 
2. Deploy job - yamls/Deployment.yaml
3. Start job  - yamls/Run.yaml 




## Enviroment
* Java Version: 1.6
* Tool for Test: Junit 4.8.1
* Build tool: Maven

## Instruction for Running Application
* Command to run all the tests(all unit tests and function test): mvn clean test
* Command to validate the solution: mvn clean verify.
  Then you could check the result in file output.csv under target/classes/




