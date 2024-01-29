package ouaGorev1;
import java.util.Scanner;
public class main {
	public static void main(String args[]) {
		int yanit = 0;
		int sayac = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("takım çalışması etkinliğine katıldın mı ? (evet:1 - hayır:0 )");
		yanit = scan.nextInt();
		 if (yanit == 1) {
		     sayac++;

		 }yanit = 0;

		System.out.println("Unity uzmanlık eğitiminin %35 'ini tamamladın mı?(evet:1 - hayır:0 )");
		yanit = scan.nextInt();
			 if (yanit == 1) {
			     sayac++;

		}yanit = 0;

		System.out.println("teknoloji girişimciliği eğitiminin %50'sini tamamladın mı?(evet:1 - hayır:0 )");
		yanit = scan.nextInt();
			 if (yanit == 1) {
			     sayac++;

		}yanit = 0;
		
		System.out.println("Google proje yönetimi eğitiminin 1.kursunu tamamladın mı?(evet:1 - hayır:0 )");
		yanit = scan.nextInt();
			 if (yanit == 1) {
			     sayac++;

		}yanit = 0;
		
		if (sayac == 4)
		{
		   System.out.println("Tebrikler Ocak ayı görevlerini tamamladınız!");

		} else
		{
		    System.out.println("Lütfen tüm görevleri tamamlayın");
		}
		
		
	}

	

}

