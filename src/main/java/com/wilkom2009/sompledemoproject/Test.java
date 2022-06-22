package com.wilkom2009.sompledemoproject;

import java.util.Scanner;

import com.wilkom2009.sompledemoproject.util.Utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        processVowOcc();
    }

    static void processAv() {
        log.info("********************************");
        log.info("****  AVERAGE OF 2 NUMBERS  ****");
        log.info("********************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = scanner.nextInt();
        System.out.print("Enter b : ");
        double b = scanner.nextInt();
        scanner.close();

        double av = Utils.calculateAverage(a, b);
        log.info("Average of " + a + " and " + b + " = " + av);
    }

    static void processTabAv() {
        System.out.println();
        System.out.println("*************************************");
        System.out.println("****  PROCESS AVERAGE OF ARRAYS  ****");
        System.out.println("*************************************");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tab length : ");
        int length = scanner.nextInt();
        double[] tab = new double[length];
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                System.out.print("Tab[");
            }
            double val = Math.pow(i, i);
            tab[i] = val;

            if (i == length - 1) {
                System.out.print(val + "]");
            } else {
                System.out.print(val + ", ");
            }
        }
        System.out.println("");
        scanner.close();

        double av = Utils.calculateTabAverage(tab);
        System.out.println("Average of elements values = " + av);
        System.out.println();
    }

    static void processOcc1() {
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("****  PROCESS NUMBER OF OCCURENCES OF C IN TEXT  ****");
        System.out.println("*****************************************************");
        System.out.println();
        String text = "Vous avez été déconnecté de votre compte. Appuyez sur « Recharger » pour vous reconnecter à AWS Management Console.";
        String c = "V";
        double occ = Utils.findNumberOccurences(c.charAt(0), text);
        System.out.print("Occurence of " + c + " in text << " + text + " >> = " + occ);
        System.out.println("");
    }

    static void processVowOcc() {
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("****  PROCESS NUMBER OF VOWELS OCCURENCES OF C IN TEXT  ****");
        System.out.println("*****************************************************");
        System.out.println();
        String text = "If you interact with AWS programmatically using the SDKs, Command Line Interface (CLI), or APIs, you must provide access keys to verify who you are and whether you have permission to access the resources you're requesting. Manage your account's access keys .";
        double occ = Utils.findWordCounts("keys",text);
        System.out.print("Number of Vowels in text << " + text + " >> = " + occ);
        System.out.println("");
    }
}
