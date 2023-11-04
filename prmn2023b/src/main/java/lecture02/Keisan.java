package lecture02;

public class Keisan {
    int[] num;

    Keisan(int[] num){
        this.num = num;
    }

    int sum(){
        int x = 0;
        for(int i=0;i<num.length;i++){
            x += num[i];
        }
        return x;
    }

    void hantei(){
        if(sum()>100){
            System.out.println("great!!");
        }else if(sum()>50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
