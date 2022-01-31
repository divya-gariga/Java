package com.zemoso.assignment6;

import java.util.HashMap;
import java.util.Map;

public class VampireNumber {
    public static void main(String[] args) {
        int count = 0, maxValue = Integer.MAX_VALUE;
        for (int number = 1260; number < maxValue; number++) {
            if (isVampireNumber(number)) {
                System.out.println(number);
                count += 1;
                if (count == 100)
                    break;
            }
        }
    }


    public static boolean isVampireNumber(int number) {
        //counting the number of digits
        int length = 0;
        for (int i = number; i > 0; i /= 10)
            length++;


        if (length % 2 != 0)
            return false;
        else {
            Map<Integer,Integer> frequencyOfNumber=new HashMap<>();
            int num=number;

            //Storing the occurrences of number
           while(num!=0)
           {
               int key=num%10;
               if(frequencyOfNumber.containsKey(key))
                   frequencyOfNumber.put(key, frequencyOfNumber.get(key)+1);
               else
                   frequencyOfNumber.put(key,1);
               num=num/10;
           }


            //finding factors
            //ex: for number 102510  , we need factors in the range of 10^2 to 10^3 (100 to 999)
            for (int i = (int) Math.pow(10, (length / 2) - 1); i < (int) Math.pow(10, length / 2); i++) {

                if (number % i == 0) {
                    int j = number / i;
                    if ((j >= (int)Math.pow(10, (length / 2) - 1) )&& (j < Math.pow(10, (length / 2)))) {
                        //if both the factors has trailing zeroes
                        if (i % 10 == 0 && j % 10 == 0)
                            continue;

                            int combinedNum = (i * (int) Math.pow(10, length / 2) )+ j;
                             if(equal(frequencyOfNumber,combinedNum))
                                 return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean equal(Map<Integer,Integer> frequencyOfNum1,int number2){
        Map<Integer,Integer> frequencyOfNum2=new HashMap<>();

        while(number2!=0)
        {
            int key=number2%10;
            if(frequencyOfNum2.containsKey(key))
                frequencyOfNum2.put(key, frequencyOfNum2.get(key)+1);
            else
                frequencyOfNum2.put(key,1);
            number2=number2/10;
        }

        if(frequencyOfNum2.equals(frequencyOfNum1))
            return true;
        else
            return false;
    }

}