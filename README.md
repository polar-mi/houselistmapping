# Selecting and loading houselist CSV file

Houselist in most of the institutes is in CSV format. This format provides the 
flexibility for importing and exporting data between servers. Inorder to make this flexible data accessible for mapping 
to correct attributes in resources we first upload the data to a frontend to view the content  

### This application is used to select and load a house list file 

#### Pre-requisite
1. opencsv
2. spring-boot-starter-web
3. spring-boot-starter-thymeleaf 
4. gradle

#### To start 

1. clone the repository using git clone
2. then navigate to parse-med directory 
    1. from parse-med directory execute the following command
    ```
      gradlew bootRun
    ```
    2. wait untill the application is started and then open the application using the URL http://localhost:8080 in a web browser to view the upload page  
    ![Houselist loader](C:\Users\rm14\Pictures\POLAR houselist mapping.png)
    
    3. navigate to the sample.csv (sample_of_four_1.csv from this repository) file and click "Import Houselist" button to kickoff the houselist upload 
    4. if there is no error then houselist should be displayed 
    5. if the file is invalid then an error message will occur
     