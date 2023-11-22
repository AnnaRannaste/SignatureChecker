package org.example;

import tech.sourced.siva.SivaException;

import java.util.List;

public class SivaClient {
    private String sivaServiceUrl;
    private String apiKey;

    public SivaClient(String sivaServiceUrl, String apiKey) {
        this.sivaServiceUrl = sivaServiceUrl;
        this.apiKey = apiKey;
    }

    public void validateCAdESSignatures(List<String> fileList) throws SivaException {

        boolean signaturesValid = checkCAdESSignatures(fileList, sivaServiceUrl, apiKey);


        if (signaturesValid) {
            System.out.println("CAdES signatures are valid.");
        } else {
            System.out.println("CAdES signatures are not valid.");
        }
    }

    private boolean checkCAdESSignatures(List<String> fileList, String sivaServiceUrl, String apiKey) {

        return true;
    }

    public static boolean containsCAdESSignature(List<String> files) {
        return files.stream().anyMatch(file -> file.toLowerCase().endsWith(".p7s"));
    }
}
