import java.util.Scanner;
public class ItemAmount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Item Number: ");
		int itemNum=s.nextInt();
		System.out.println("Enter the Item Name: ");
		String itemName=s.next();
		System.out.println("Enter the Item Rate: ");
		double rate=s.nextDouble();
		System.out.println("Enter the Item Quantity: ");
		int quantity=s.nextInt();
		double amount=rate*quantity;
		System.out.println("Item Number: "+itemNum);
		System.out.println("Item Name: "+itemName);
		System.out.println("Item Amount: "+amount);
	}

}
