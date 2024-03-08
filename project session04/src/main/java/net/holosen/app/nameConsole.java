package net.holosen.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nameConsole {
    public static void main(String[] args) {         try {

        System.out.println("Please enter your name:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String myName = reader.readLine();
            System.out.println("hello" + " " + myName);
            System.out.println("Please enter your age");
           Integer myAge = Integer.valueOf(reader.readLine());
            System.out.println("your age is : " + myAge);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
        }
    }
