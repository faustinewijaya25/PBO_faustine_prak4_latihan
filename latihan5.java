import java.util.Scanner;
public class latihan5 {
	public static void main (String[] args) {
		Scanner masukan = new Scanner(System.in);
		int bil;
		System.out.print(" masukkan bilangan = ");
		bil=masukan.nextInt();
		
		if(bil < 0){
			System.out.println("bil" +bil+" bilangan ini negatif");
		}
		if(bil > 0){
			System.out.println("bil" +bil+" bilangan ini positif");
		}
}
}

