package exceptions;
class Book{
	int bid;
	String bname;
	double price;
	public Book(int bid, String bname, double price) {
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	public Book() {}
	public String toString() {
		return "Book Id: "+bid+"\nBook Name: "+bname+"\nBook Price: "+price;
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		Book b=new Book(101,"Learn Spring",800);
		System.out.println(b); // invokes toString() implicitly
	}

}
