import java.util.Scanner;
	public class latihan4 {
		public static void main(String [] args) {
			Scanner masukan = new Scanner(System.in);
			int n, i, z,max,min;
			System.out.print("masukkan jumlah nilai  = ");
			i = masukan.nextInt();
			min = i;
			max = i;
			for (z=1; z<=i; z++)
			
			System.out.print("masukkan nilai ke-" +z+ ": ");
			n=masukan.nextInt();
			
			if (n< min)
			{
				min = n;
			}
			else if (n> max)
			{
				max = n;
			}
			else
			{
			}
		
		System.out.println("nilai min: " +min);
		System.out.println("nilai max: " +max);
	}
}