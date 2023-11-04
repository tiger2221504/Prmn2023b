package lecture02;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args){

        int[] num = new int[5]; //配列の定義

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("数字つ目" + i + "つ目:");
            num[i] = scan.nextInt();
            System.out.println(""); //改行
        }

        Keisan k = new Keisan(num);

        System.out.println("合計値：" + k.sum());
        k.hantei();
    }
}
