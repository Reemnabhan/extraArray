package ARRAYTHUIS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Opdracht3 {
    public static void main(String[] args) {
        int[] temperaturs={6,3,1,-1,-3,0,-1};
        float sum=0;

        for (int j=0;j<temperaturs.length;j++){
            sum=sum+temperaturs[j];

        }
        System.out.println( "avg="+  sum/7);

        for (int Z:temperaturs) {
            if (Z<0){

                System.out.println((Z));
            }
             }

            temperaturs[5]=-2;

        System.out.println(temperaturs[0]);
        System.out.println(temperaturs[1]);
        System.out.println(temperaturs[2]);
        System.out.println(temperaturs[3]);
        System.out.println(temperaturs[4]);
        System.out.println(temperaturs[5]);
        System.out.println(temperaturs[6]);





    }


    }

