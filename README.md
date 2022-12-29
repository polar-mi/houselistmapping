# Selecting and loading houselist CSV file

Houselist in most of the institutes is in CSV format. This format provides the 
flexibility for importing and exporting data between servers. In-order to make this flexible data accessible for mapping 
to correct attributes in resources we first upload the data to a frontend to view the content  

### This application is used to select and load a house list file 

#### Pre-requisite
1. opencsv
2. spring-boot-starter-web
3. spring-boot-starter-thymeleaf 
4. gradle

#### To start 

1. clone the repository using git clone
    ```
      git clone https://github.com/polar-mi/houselistmapping.git
    ```
2. then navigate to 'houselistmapping' directory 
    1. from 'houselistmapping' directory execute the following command
    ```
      gradlew bootRun
    ```
    2. wait untill the application is started and then open the application using the URL http://localhost:8080 in a web browser to view the upload page  
    ![POLAR houselist mapping](https://user-images.githubusercontent.com/80357045/209957139-7e775559-e4d1-45b7-8276-82b705396ae8.jpg)

    
    3. navigate to the sample.csv (sample_of_four_1.csv from this repository) file and click "Import Houselist" button to kickoff the houselist upload 
    ![image](https://user-images.githubusercontent.com/80357045/209957904-48ab6855-1721-4c17-b9f3-c109bf7918e6.png)

    4. if there is no error then houselist should be displayed 
    ![image](https://user-images.githubusercontent.com/80357045/209958147-9f274fc9-5100-448b-aced-df66c0afd364.png)

    5. if the file is invalid then an error message will occur
     ![image](https://user-images.githubusercontent.com/80357045/209958593-2bb953c9-11e5-40b3-9590-d31273829e5d.png)
    6. or if the file content does not match empty load will occur  
     ![image](https://user-images.githubusercontent.com/80357045/209958465-531faed6-cb85-4ab0-be1c-adcca9ae9583.png)
