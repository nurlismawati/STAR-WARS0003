import java.util.Scanner;


public class StarWars0003 {

	/** Nur Lismawati
	 * 	D0217309
	 * 	Informatika.A
	 */	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT");
		int a = sc.nextInt();
		
		System.out.println("OUTPUT");
		for(int i=1; i <=a; i++){
			System.out.print(i + " ");
		}
			for(int i=1; i>=a; i++){
			System.out.print("UNDEFINED");
			break;
		}
	}
}
