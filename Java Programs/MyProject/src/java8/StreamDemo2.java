package java8;
import java.util.*;
import java.util.stream.*;
class Product{
	int pid;
	String pname;
	int price;
	public Product(int pid,String pname,int price){
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	public Product(){}
	public String toString() {
		return pid+" "+pname+" "+price;
	}
}
public class StreamDemo2 {
	public static void main(String[] args) {
		// Price greater than 1000 products -- Ordinary Process
		List<Product> list1=new ArrayList<>();
		for(Product prod:getProducts()) {
			if(prod.price > 1000)
				list1.add(prod);
		}
		list1.forEach(System.out::println);
		
		// Using Stream API Filter
		System.out.println("----Using Stream API-----");
		List<Product> list2=getProducts().stream().filter((prod) -> prod.price > 1000).collect(Collectors.toList());
		list2.forEach(System.out::println);
			
	}
	private static List<Product> getProducts(){
		List<Product> prodList=new ArrayList<>();
		prodList.add(new Product(101,"Monitor",5000));
		prodList.add(new Product(102,"Mouse",300));
		prodList.add(new Product(103,"Keyboard",1000));
		prodList.add(new Product(104,"Ups",3000));
		prodList.add(new Product(105,"Speakers",1000));
		
		return prodList;
	}

}
