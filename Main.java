package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int liczba = scanner.nextInt();
        scanner.close();
        for(int i=1; i<=liczba; i++){
            if((liczba % i == 0) ){
                System.out.println(" " + i);

            }
        }



        }

    }

