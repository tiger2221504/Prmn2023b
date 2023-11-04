package lecture02;

public class Gakuseki {
    String number = "B2001000";
    String gakuseki;

    Gakuseki(String gakuseki){
        this.gakuseki = gakuseki;
    }

    void hantei(){
        if(number.equals(gakuseki)) {
            System.out.println("complete!!");
        }else {
            System.out.println("error!!");
        }
    }
}
