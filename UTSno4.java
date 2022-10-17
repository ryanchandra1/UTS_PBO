import java.util.Scanner;
class lingkaran{
    double PHI = 3.14;
    float r;
}
class KelilingLuas extends lingkaran{

    double Luas(){
        Scanner input = new Scanner(System.in);
        lingkaran obj = new lingkaran();
        double luas;
        System.out.println("\nMenghitung Luas Lingkaran");
        System.out.println("Masukkan jari\t:");
        obj.r = input.nextFloat();
        luas = obj.PHI* obj.r* obj.r;
        return luas;
    }

    double keliling(){
        Scanner input = new Scanner(System.in);
        lingkaran obj = new lingkaran();
        double keliling;
        System.out.println("\nMenghitung Keliling Lingkaran");
        System.out.println("Masukkan jari\t:");
        obj.r = input.nextFloat();
        keliling = 2*obj.PHI* obj.r;
        return keliling;
    }

}

class Hasil extends KelilingLuas{
    void ShowDataLuas(){
        KelilingLuas obj = new KelilingLuas();
        System.out.println("LUAS = "+obj.Luas());
    }
    void ShowDataKeliling(){
        KelilingLuas obj = new KelilingLuas();
        System.out.println("KELILING= "+obj.keliling());
    }
}

public class UTSno4 {
    public static void main(String[] args) {
        KelilingLuas obj = new KelilingLuas();
        Hasil hasil = new Hasil();
        hasil.ShowDataLuas();
        hasil.ShowDataKeliling();

    }

}
