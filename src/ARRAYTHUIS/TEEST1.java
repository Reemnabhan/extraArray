package ARRAYTHUIS;

import java.util.Arrays;

public class TEEST1 {
    public static void main(String[] args) {
        int[] studentPoint={1,5,6,-9,77,110,-4,3,10,2};

        for (int i=0;i<studentPoint.length;i++){

            if(studentPoint[i]>10){
                studentPoint[i]=studentPoint[i]/11;


            }else if (studentPoint[i]<0){
                studentPoint[i]=studentPoint[i]*-1;
            }else if(studentPoint[i]>3){
                studentPoint[i]=studentPoint[i]*3;
            }
        }
        System.out.println(Arrays.toString(studentPoint));
    }

}
