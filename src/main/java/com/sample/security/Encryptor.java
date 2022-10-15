package com.sample.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public class Encryptor {

    public String encryptString(String input) throws NoSuchAlgorithmException {

        // هنا قايلة يشتغل بل md5
        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] messageDigest = md.digest(input.getBytes());

        BigInteger bigInt = new BigInteger(1,messageDigest);

        return bigInt.toString(16);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Encryptor encryptor = new Encryptor();
// دة مثال بسيط يبين الفكرة
        // مثال مش اكتر, هههههه
        String password = "monkey123";
        String hashedPas = "cc25c0f861a83f5efadc6e1ba9d1269e";
// اكيد طبعا الموضوع واضح جدا هنا
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey! Plz input your Password: \n");
        String userInput = scanner.nextLine();
        if(encryptor.encryptString(userInput).equals(hashedPas)){
            System.out.println("Correct! You are in!");
        } else{
            System.out.println("Wrong!!");
        }

    }
}

