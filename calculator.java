public class Calculator{
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

		int sum = app.addition(10,20);
		int sub = app.subtraction(30,7);
	}
}
