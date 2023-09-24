public class Calculator{

	//multiplication method
	public int multi(int a, int b){
		return a*b;
	}

	//division method
	public int div(int a, int b){
		return a/b;

	//method for adding
	public int addition(int a, int b){
		return a+b;
	}

	//method for subtracting
	public int subtraction(int a, int b){
		return a-b;
	}

	public static void main(String[] args){
		Calculator app = new Calculator();

		int multi = app.multi(10,20);
		int div = app.div(10,2);

		int sum = app.addition(10,20);
		int sub = app.subtraction(30,7);
    
	}
}
