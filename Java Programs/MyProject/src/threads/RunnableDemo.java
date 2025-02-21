package threads;
class ThreadR implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
}
public class RunnableDemo {
	public static void main(String[] args) {
		ThreadR tr=new ThreadR();
		Thread t=new Thread(tr);
		t.start();
	}

}
