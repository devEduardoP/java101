
public class HelloWorld extends HelloService {
	
	
	public int result(int a, int b) {
		return a + b;
	}
	
	public int result(int a, int b, int c) {
		return a + b - c; 
	}
	
	public void getMessage() {
		System.out.println("Hello Edward");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create object
		
		HelloWorld obj = new HelloWorld();
		
		
		int result = obj.result(2,2,1);
		
		obj.getMessage();
		
		
		
	}

}
