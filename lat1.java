public class lat1{
public static void main(String args []){
		char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama anda : ");
		try{
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
			System.out.println(" Anda salah menginput");
		}
		if (hurufAwal =='a')
			System.out.println("apa nama anda amin?");
		else if (hurufAwal == 'b')
			System.out.println("apa nama anda bambang?");
		else if (hurufAwal =='c')
			System.out.println("apa nama anda ceceo?");
		else if (hurufAwal == 'd')
			System.out.println("apa nama anda daud?");
		else if (hurufAwal == 'e')
			System.out.println("apa nama anda endang?");
		else 
			System.out.println("aku tidak bisa menebak");
}
	
}