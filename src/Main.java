import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number  = in.nextInt();
        int[] mas = new int[number];
        int[] masD = new int[number];
        int[] masR = new int[number];

        masDirect (number);
        masReverse(masD);
        outPut(masD,masR);



    }

    public static int[] masDirect (int number) {
        int i = 0;
        int j = 0;
        int[] mas1 = new int[number];
        int[] mas = new int[number];
        for (i = 1; i < mas.length; i++) {

            mas[j] = i * i;
            j++;
        }
        return mas;
    }
    public static int[] masReverse (int masD[])
    {
        //int[] masD = new int [mas];
        int[] masR = new int [masD.length];
        int j =0;
        int c =masD.length;
        for(int i = 0;i < masD.length;i++ ){
            masR[i]=masD[c - 1];
            c = c - 1;

        }
        return  masR;
    }
    public static void outPut(int masD[],int masR[])
    {
        System.out.println(Arrays.toString(masD));
        System.out.println(Arrays.toString(masR));
    }
}