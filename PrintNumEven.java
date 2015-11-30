package week12;

public class PrintNumEven extends Thread{
	
	private int num = 0;
	private int end = 0;
	
	public PrintNumEven(int a,int b){
		num = a;
		end = b;
	}
	
	public void run(){
		//System.out.println("Even Number:");
		for(int i = 2;i<end;i++){
			System.out.print(num+ " ");
			num+=2;
		}
	}
}
