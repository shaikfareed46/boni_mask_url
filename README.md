# Boni Mask Url

You have an input of the URLs: “/users/Maria/info/location”, “/users/Marcelo/info/
birthday” <br />
Please propose a design for an algorithm that given a set URL paths(as in example
above), can identify dynamic parts and resolve the masked URL to the path like this “/
users/*user_name*/info/*info_query*”<br />
Algorithm should be as efficient as possible based on consideration about the CPU,
Memory and processing time. <br />
*user_name* will represent the username values in the path. In our example it is
Maria or Marcelo.<br />
*info_query* will represent the last part of the path. In our example location or
birthday.<br />
The URLs can be dynamic, and can have multiple dynamic parts. <br />

## Solution

The solution which i am proposing uses O(kN) processing time to find mask url.

Where k refers to number of parts,  
      N refers to number of urls,  
      
Here i am using **removeAll** method to find dynamic parts.

### Prerequisites

For this application to run below are the pre requisite

1. Java (Used for development)
2. Maven

### How to start app??

Below are the steps to do run the application....

##### Running the project

To start app from IDE 

**STS**
```
 Right click on project -> Run as -> Spring boot app
```
**Eclipse**
```
 Right click on MaskUrl.java -> Run as -> Java application
```

**CLI**
From project folder execute below command. Since this is a mavenised project we will use below command.
```
 mvn clean install
```
```
 mvn spring-boot:run
```


## Authors

**Shaik Fareed** : Full stack Java developer at GE
**Email id** : shaikfareed46@gmail.com


## Help

###### Please conatct me, if you have problems executing the app. 
