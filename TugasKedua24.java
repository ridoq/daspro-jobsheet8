import java.util.Scanner;
public class TugasKedua24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cabor1 = "Badminton";
        String cabor2 = "Tenis Meja";
        String cabor3 = "Basket";
        String cabor4 = "Bola Voly";
        int jumlahPendaftar;
        System.out.print("Masukkan jumlah Politeknik yang mendaftar : ");
        jumlahPendaftar = sc.nextInt();
        System.out.println("=".repeat(50));
        sc.nextLine();
        for(int x = 1 ; x <= jumlahPendaftar ; x++){
            System.out.print("Masukkan nama politeknik : ");
            String namaPoliteknik = sc.nextLine();
            System.out.println("Daftar atlet Politeknik ke-" + x + " :" +namaPoliteknik.toUpperCase());
            System.out.println("=".repeat(50));
            System.out.println("Cabang Olahraga " + cabor1 + " : ");
            for(int y = 1 ; y <= 5 ; y++){
                System.out.print("Masukkan nama Atlet : ");
                String atlet = sc.nextLine();
                System.out.println("Atlet " + y + " : " + atlet);
            }
            System.out.println("=".repeat(50));
            System.out.println("Cabang Olahraga " + cabor2 + " : ");
            for(int y = 1 ; y <= 5 ; y++){
                System.out.print("Masukkan nama Atlet : ");
                String atlet = sc.nextLine();
                System.out.println("Atlet " + y + " : " + atlet);
            }
            System.out.println("=".repeat(50));
            System.out.println("Cabang Olahraga " + cabor3 + " : ");
            for(int y = 1 ; y <= 5 ; y++){
                System.out.print("Masukkan nama Atlet : ");
                String atlet = sc.nextLine();
                System.out.println("Atlet " + y + " : " + atlet);
            }
            System.out.println("=".repeat(50));
            System.out.println("Cabang Olahraga " + cabor4 + " : ");
            for(int y = 1 ; y <= 5 ; y++){
                System.out.print("Masukkan nama Atlet : ");
                String atlet = sc.nextLine();
                System.out.println("Atlet " + y + " : " + atlet);
            }
            System.out.println("=".repeat(50) + "\n\n");
        }
        sc.close();
    }   
}
