package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
//     double [] digits = {1.3, 1.5, (-16.6), 17.5, (-20.6), 54.2, (-12.4), 23.9, 11.4, 55.1,
//     0.1, (-1.61), 2.43, (-11.8), 22.5};


     double[] array = { 9, -3, -5 , 5 , 3 , 7};


        double sum = 0;
        double avarage;
        int count = 0;
        boolean negative = false;
//
//        for (double numbers: array
//             ) {
//            if (numbers< 0){
//                negative = true;
//          }
//            else if (negative){
//                count++;
//                sum += numbers;
//            }
//        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]< 0){
                negative = true;
            }

            else if(negative){
                count ++;
                sum += array[i];
            }

        }
        avarage = sum / count;
        System.out.println(sum);
        System.out.println(count);
        System.out.println(avarage);

            }

        }





