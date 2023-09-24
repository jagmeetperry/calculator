public class Calculator{
	//multiplication method
	public int multi(int a, int b){
		return a*b;
	}

	//division method
	public int div(int a, int b){
		return a/b;
	}

	public static void main(String[] args){
		Calculator app = new Calculator();

		int multi = app.multi(10,20);
		int div = app.div(10,2);

	}
}
