import java.util.Scanner;
public class UTSno2 {

    private float berat_Badan,tinggi_Badan;
    private float BMI;

    public UTSno2(){
        berat_Badan = 0;
        tinggi_Badan = 0;
        BMI = 0;
    }

    public float hitung(){
        BMI = berat_Badan/(tinggi_Badan*tinggi_Badan);
        return BMI;
    }
    public static void main(String[] args) {
        UTSno2 obj = new UTSno2();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Berat Badan(Kg) : ");
        obj.berat_Badan = input.nextFloat();
        System.out.println("Masukan Tinggi(m)       : ");
        obj.tinggi_Badan = input.nextFloat();
        System.out.println("Body Mass Index         : "+obj.hitung());
        if(obj.hitung()>=18.5 && obj.hitung()<=22.9){
            System.out.println("Tubuh Anda Ideal.");
        }else if(obj.hitung()>22.9){
            System.out.println("Tubuh Anda OverWeight");

        }else if(obj.hitung()<18.5){
            System.out.println("Tubuh Anda UnderWeight");
        }

    }
}
