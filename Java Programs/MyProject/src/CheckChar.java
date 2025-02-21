import java.util.Scanner;
public class CheckChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println("Given character is a vowel"); break;
		default: System.out.println("Given character is a consonent");
		}
	}

}
