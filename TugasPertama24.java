import java.util.Scanner;
public class TugasPertama24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        if (N > 20) {
            System.out.println("input terlalu banyak, silahkan jalankan lagi");
        }else{
            for (int i = 1; i <= N; i++) { 
                for (int j = 1; j <= N ; j++) { 
                    if (i == 1 || i == N || j == 1 || j == N ) {
                        System.out.print(N + " ");
                    }else{
                        if (N < 10) {
                            System.out.print("  ");
                        }else if(N < 21){
                            System.out.print("   ");
                        }
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
