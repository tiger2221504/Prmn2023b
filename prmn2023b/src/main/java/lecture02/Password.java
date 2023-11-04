package lecture02;

import java.util.Objects;

public class Password {
    String[][] students = new String[5][2];
    int x;

    Password() {
        students[0][0] = "B2220000";
        students[0][1] = "aaa";
        students[1][0] = "B2220001";
        students[1][1] = "iii";
        students[2][0] = "B2220002";
        students[2][1] = "uuu";
        students[3][0] = "B2220003";
        students[3][1] = "eee";
        students[4][0] = "B2220004";
        students[4][1] = "ooo";
    }

    boolean checkGakuseki(String num){
       for(int i=0;i< students.length;i++){
           if(students[i][0].equals(num)){
               x = i;
               return true;
           }
       }
       return false;
    }

    boolean checkPass(String num){
        return students[x][1].equals(num);
    }
}
