import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main (String[] args) {

        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa :");

        int[] nilaiMhs = new int [input02.nextInt()];
        double total_lls = 0, total_tdklls = 0, rata2_lls, rata2_tdklls;
        int jmlhMhs_lulus = 0, jmlhMhs_tdklulus = 0;
        
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i + 1) +" : ");
            nilaiMhs[i] = input02.nextInt();
        }

        for (int i=0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                jmlhMhs_lulus += 1;
                total_lls += nilaiMhs[i];
            }else{
                jmlhMhs_tdklulus += 1;
                total_tdklls += nilaiMhs[i];
            }
        }

        rata2_lls = total_lls / jmlhMhs_lulus;
        rata2_tdklls = total_tdklls / jmlhMhs_tdklulus;
        System.out.println("Rata - rata nilai lulus: " + rata2_lls);
        System.out.println("Rata - rata nilai tidak lulus: " + rata2_tdklls);
        System.out.println("Jumlah mahasiswa yang lulus: " + jmlhMhs_lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlhMhs_tdklulus);
    }
}