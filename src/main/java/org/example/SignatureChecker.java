package org.example;

import tech.sourced.siva.SivaException;
import java.util.ArrayList;
import java.util.List;
import tech.sourced.siva.SivaException;

public class SignatureChecker {

    public static boolean containsCAdESSignature(List<String> files) {
        return files.stream().anyMatch(file -> file.toLowerCase().endsWith(".p7s"));
    }

    public static void main(String[] args) {

        List<String> fileList = new ArrayList<>();

        boolean containsCAdES = containsCAdESSignature(fileList);

        if (containsCAdES) {
            System.out.println("The ASiC-S container contains the CAdES signature. Process with the SiVa service.");

            try {
                String sivaServiceUrl = "https://siva.example.com";
                String apiKey = "your-actual-api-key";

                SivaClient sivaClient = new SivaClient(sivaServiceUrl, apiKey);
                sivaClient.validateCAdESSignatures(fileList);

                System.out.println("CAdES signature processing completed.");

            } catch (SivaException e) {
                e.printStackTrace();

            }
        } else {
            System.out.println("The ASiC-S container does not contain a CAdES signature.");
        }
    }
}
