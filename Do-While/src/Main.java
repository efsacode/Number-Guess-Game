import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random sayi = new Random();
		
		int random_number = 1 + sayi.nextInt(9);
		
		System.out.println("The number is between 1-10.");
		int secilenSayi = scan.nextInt();
		
		
		do {
			System.out.println("Wrong guess, try again!");
			secilenSayi= scan.nextInt();
		}
		while (secilenSayi != random_number);
		
		if (secilenSayi == random_number) {
			System.out.println("Your guess is right! The number is " +random_number +".");
		}

	}

}

