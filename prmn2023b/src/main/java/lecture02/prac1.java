package lecture02;

import java.util.Scanner; //Scannerライブラリを使うためのimport

public class prac1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //標準入力をするインスタンス
        System.out.print("学籍番号を入力してください。:");
        String gakuseki = scan.next();

        Gakuseki g = new Gakuseki(gakuseki);

        g.hantei();
    }
}
