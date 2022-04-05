package ARRAYTHUIS;

import java.lang.reflect.Array;

public class Opdracht1 {
    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int integerArray1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //System.out.println(integerArray[0]);
        //System.out.println(integerArray[5]);

        for (int i = 0; i < integerArray.length; i++) {
            // System.out.println(integerArray[i]);
            if (i == 0 || i == 5) {
                //   System.out.println(integerArray[i]);

            }
        }

        for (int index = 0; index < integerArray.length; index++) {
            if (integerArray[index] % 4 == 0) {
                integerArray[index] = 0;

            }

            // System.out.println(integerArray[index]);


        }
        for (int s : integerArray1
        ) {
           // System.out.println(s);
        }

        for (int j = integerArray1.length-1; j >=0; j--) {
                integerArray1[j]=integerArray1[j]*13;
            System.out.println(integerArray1[j]);


        }

    }


}
