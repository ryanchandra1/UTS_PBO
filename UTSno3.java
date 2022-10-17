import java.util.Scanner;
public class UTSno3 {

    private  int bilangan;
    private int total;
    public UTSno3(){
        this.total = 0;
    }

    void hitung(){
        int counter = 0;
        while(counter<10){
            Scanner input = new Scanner(System.in);
            System.out.println("Bilangan ke-"+(counter+1)+":");
            bilangan = input.nextInt();
            total += bilangan;
            counter++;
        }
        System.out.println("TOTAL = "+total);
    }

    public static void main(String[] args) {
        UTSno3 obj = new UTSno3();
        System.out.println("Masukkan 10 Bilangan Bulat.");
        obj.hitung();

    }
}
