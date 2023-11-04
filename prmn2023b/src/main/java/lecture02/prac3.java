package lecture02;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Password p = new Password();

        System.out.print("学籍番号：");
        String num = input.next();

        if(!p.checkGakuseki(num)){
            System.out.println("error!!");
            System.exit(0);
        }

        System.out.print("パスワード：");
        String pass = input.next();

        if(!p.checkPass(pass)){
            System.out.println("不正なアクセス");
            System.exit(0);
        }

        System.out.println("ログイン完了");
    }
}
