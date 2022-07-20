import java.util.Locale;
import java.util.Scanner;

public class Men {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int media = sc.nextInt();

		if (media >= 7) {
			System.out.println("APROVADO");
		}
			else {
				System.out.println("REPROVADO");
			
		}
		
		sc.close();
	}
}