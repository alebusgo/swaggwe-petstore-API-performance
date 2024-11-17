# VISA Swagger Pet Store API Performance Test

This repo contains performance test on the swagger-petstore App
 
### The project is based on:
 
- Karate
- Gatling
- Maven
- CucumberJS
- Intellij Idea


The syntax of the scenarios is written in Gherkin.
 
## Tests include in the project and notes
 
The project includes load and stress tests on the following sections of the API:
 
- pet
    - Add New Pet endpoint
    - Find By Id endpoint
    - Find By Status endpoint
    - Update Existing Pet endpoint
- store
    - Delete Order endpoint
    - Find Order endpoint
    - Inventory endpoint
    - Place Order endpoint
- user
    - Create User endpoint
    - Find User By Name endpoint
    - Login User endpoint
    - Update User

The project has a total of 11 tests/gherkin scenarios.
 
## Required Configuration
 
1. You must have the following programs installed on your Windows PC (This Installation only works on Windows OS, if you need to configure in a MacOs PC, please contact abustos@cbtw.tech for support), please follow these steps:
 
    - [Download and install git](https://github.com/git-guides/install-git#:~:text=To%20install%20Git%2C%20navigate%20to,installation%20by%20typing%3A%20git%20version%20.)
    - [Download and install JAVA JDK 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
      - Set JAVA_HOME:
          - Right click My Computer and select Properties.
          - On the Advanced tab, select Environment Variables, and then create or edit JAVA_HOME System Variable to point to where the JDK software is located, like: "C:\Program Files\Amazon Corretto\jdk17.0.7_7".
          - Open the Path option from System and create a new Environment Variable %JAVA_HOME%\bin
          - You can check it by typing $ java -version command at the command prompt.
   - [Donwload Maven (Binary_only)](https://maven.apache.org/download.cgi)
     - Unzip the file, create a Maven folder in C:\ and paste the Maven inside
     - Right click My Computer and select Properties.
     - On the Advanced tab, select Environment Variables.
     - Open the Path option from System and create a new Environment Variable add to point to where the Gradle bin is located like "C:\Maven\apache-maven-3.9.1\bin"
   - [Download and install Intellij IDEA Community](https://www.jetbrains.com/idea/)
      - Open Intellij IDEA and install:
        - "Gherkin" from JetBrains plug in
        - "Cucumber for Java" from JetBrains plug in
        - "Scala" from JetBrains plug in

2. Clone this project locally
    ```git
        git clone https://github.com/alebusgo/swaggwe-petstore-API-performance.git
    ```
 
3. Open the project in Intellij IDEA and rebuild it 
 
## Running Auto Tests

1. Run one by one Performance Test in QA environment, just go to the root of the project, and write this via the command line: 
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.pet.findPetsByStatus.FindPetsByStatusSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.pet.addNewPet.AddNewPetSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.pet.findPetById.FindByIdSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.pet.updateExistingPet.UpdateExistingPetSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.store.deleteOrder.DeleteOrderSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.store.findOrder.FindOrderSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.store.inventory.RetursInventorySimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.store.placeOrder.PlaceOrderSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.user.createUser.CreateUserSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.user.findUserByName.FindUserSimulation
   ```
   ```bash
        mvn clean test-compile gatling:test -Dgatling.simulationClass=features.user.loginUser.LoginUserSimulation
   ```
## Gatling Repports

### The execution report folder is located following the path:

target/gatling/*/index.html
