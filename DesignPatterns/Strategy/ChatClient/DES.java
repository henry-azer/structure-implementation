package DesignPatterns.Strategy.ChatClient;

public class DES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String text) {
        System.out.println("Encrypting message using DES");
        return "encryptedText";
    }
}
