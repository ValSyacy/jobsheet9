import java.util.Scanner;

public class ProgramMandiri02 {
    public static void main (String[] args){

        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen angka : ");
        int [] angka_alfitroh = new int [input02.nextInt()];

        for (int i=0; i < angka_alfitroh.length; i++){
            System.out.print("Masukkan nilai elemen ke-"+ (i +1) +" : ");
            angka_alfitroh[i] = input02.nextInt();
        }

        int temp = 0, total_angka = 0, rata2;

        for (int i=0; i < angka_alfitroh.length; i++) {
            total_angka += angka_alfitroh[i];
     
            for (int j=1; j < angka_alfitroh.length - i; j++){

                if (angka_alfitroh[j-1] > angka_alfitroh[j]) {
    
                        //swap elemen
                        temp = angka_alfitroh[j];
                        angka_alfitroh[j] = angka_alfitroh[j-1];
                        angka_alfitroh[j-1] = temp; 
                }
            }
        }
        
        rata2 = total_angka / angka_alfitroh.length;

        System.out.println("Nilai terkecil adalah: "+ angka_alfitroh[0]);
        System.out.println("Nilai terbesar adalah: "+ angka_alfitroh[angka_alfitroh.length-1]);
        System.out.println("Rata-rata angka adalah: "+ rata2);

    }
    
}
