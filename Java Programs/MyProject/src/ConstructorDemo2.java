class Book{
	int bookId;
	String bookName;
	Book(int bookId,String bookName){
		this.bookId=bookId;
		this.bookName=bookName;
	}
	Book(){}
	void display() {
		System.out.println("Book ID : "+bookId);
		System.out.println("Book Name : "+bookName);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Book b1=new Book(101,"Learn Java");
		b1.display();
		Book b2=new Book();
		b2.display();
	}

}
