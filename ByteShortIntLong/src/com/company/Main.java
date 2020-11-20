package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        char mychar = 'D';
        boolean bool = true;

        System.out.println("you are a " + mychar);

        if (bool) System.out.println("this is true");
        else System.out.println("this is false");
        System.out.println("LETS USING INTELEJJJJJJJJJJJJJ IDE NOW");
//        printConversion(25.42);
//        printMegaBytesAndKiloBytes(-10);
//        double result = area(5.0);
//        double result2 = area(5.0,4.0);
//        System.out.println(result + "\n" + result2);
        printYearsAndDays(561600);
    }


    public static Long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return (long) -1;
        }else{
            Double result = kilometersPerHour/1.609;
            long hasil = (long) Math.round(result);
            return hasil;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0) {
            System.out.println("(Invalid Value");
        }else{
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            int resultMB = kiloBytes/1024;
            int resultKB = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+resultMB+" MB and "+resultKB+" KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking==true) {
            if(hourOfDay<0 && hourOfDay>23){
                return false;
            }else if(hourOfDay<8 || hourOfDay>22){
                return true;
            }
        }else{
            System.out.println("dog is not barking");
        }
        return false;
    }

    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }else return false;
                }else return true;
            }else return false;
        }else return false;
    }

    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1.0;
        }else{
            return x*y;
        }
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid value");
        }else{
            long years = minutes/525600;
            long days = (minutes%525600)/1440;
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }
    }

    public static void printEqual(int num, int num2, int num3){
        if(num<0||num2<0||num3<0){
            System.out.println("Invalid value");
        }else if(num==num2&&num==num3&&num2==num3){
            System.out.println("All numbers are equal");
        }else if(num!=num2&&num!=num3&&num2!=num3){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temp){
        if(summer==false){
            if(temp>=25 && temp<=35) return true;
            else return false;
        }else{
            if(temp>=25&&temp<=45) return true;
            else return false;
        }
    }


}
