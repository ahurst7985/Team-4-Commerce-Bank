package com.Encryption.entity;

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

public class Crypto {

    private String textToEncrypt;
    final static String password = "Hello";

    public String Encrypt(String textToEncrypt, String salt)
    {
        if (textToEncrypt != null && !textToEncrypt.isEmpty())
        {
            TextEncryptor encryptor = Encryptors.text(password, salt);
            String encryptedText = encryptor.encrypt(textToEncrypt);
            return encryptedText;
        }

        return null;
    }

    public String getTextToEncrypt() { return textToEncrypt; }
}
