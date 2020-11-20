package com.company;

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

        System.out.println(isLeapYear(1924));

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

}
