import java.util.Scanner;
public class UTSno1 {
    private int jam1,jam2,menit1,menit2,detik1,detik2;
    private int pertama,kedua;
    private int total_waktu;
    public UTSno1(){
        this.jam1 = 0;
        this.jam2 = 0;
        this.menit1 = 0;
        this.menit2 = 0;
        this.detik1 = 0;
        this.detik2 = 0;
        this.pertama = 0;
        this.kedua = 0;
        this.total_waktu = 0;
    }

        void setTotal_waktu(){
        pertama = 3600*jam1 + (60*menit1) + detik1;
        kedua = 3600*jam2 + (60*menit2) + detik2;
        total_waktu = kedua - pertama;
    }
    public int hitung(){
        setTotal_waktu();
        int harga;
        harga = total_waktu * 30;
        return harga;
    }


    public static void main(String[] args) {
        UTSno1 obj = new UTSno1();
        Scanner input = new Scanner(System.in);
        System.out.println("Tarif Telepon");
        System.out.println("Waktu Awal");
        System.out.println("JAM :");
        obj.jam1 = input.nextInt();
        System.out.println("MENIT :");
        obj.menit1 = input.nextInt();
        System.out.println("DETIK :");
        obj.detik1 = input.nextInt();

        System.out.println("Waktu Akhir");
        System.out.println("JAM :");
        obj.jam2 = input.nextInt();
        System.out.println("MENIT :");
        obj.menit2 = input.nextInt();
        System.out.println("DETIK :");
        obj.detik2 = input.nextInt();

        System.out.println("HARGA : Rp "+obj.hitung());

    }

}
