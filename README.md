# SignatureChecker

The SignatureChecker project provides an integration with SiVa (an external service) for verifying CAdES signatures in ASiC-S containers.

## Project Structure

- **SignatureChecker**: The main class defining the logic for checking CAdES signatures in an ASiC-S container.
- **SivaClient**: A client for interacting with the external SiVa service. Facilitates the validation of CAdES signatures.

## How to Use

1. **Build the Project:**
    - Ensure you have Apache Maven installed.
    - Run `mvn clean install` to build the project.

2. **Run the Application:**
    - Run `SignatureChecker` in your development environment 

3. **Configure SiVa:**
    - In the `SivaClient` class, replace the following parameters with the actual values of your SiVa service:
      ```java
      String sivaServiceUrl = "https://siva.example.com";
      String apiKey = "your-actual-api-key";
      ```

4. **Prepare Files:**
    - List of files for verification and pass it to the application.

5. **Check Results:**
    - The verification results will be printed to the console.
    - In case of successful verification, you will see: "CAdES signatures are valid."
    - In case of unsuccessful verification: "CAdES signatures are not valid."

## Configuring SiVa

The parameters of your SiVa service in the `SivaClient` class:

```java
String sivaServiceUrl = "https://siva.example.com";
String apiKey = "your-actual-api-key";
