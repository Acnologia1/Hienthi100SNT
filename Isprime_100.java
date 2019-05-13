package com.company;

public class Isprime_100 {
    public static void main(String[] args) {
        for(int i = 2;i<100;i++)
        {
            if(  i == 4) continue;
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    //HAM KIEM TRA SO NGUYEN TO
    private static boolean isPrime(int x) {
        boolean check = true;
        if (x < 2) {
            check = false;
        } else {
            int i  =2;

            while (i <x/2)
            {
                if(x %i == 0){
                    check = false;
                    break;
                }
                i++;
            }

        }
        return check;
    }
}

