package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	
		
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		if(b==0)
			return b;
		else
			return a/b;
		
	}
	public class power {
		public void main() {
			int x=4, y=3;
			double result= Math.pow(x,y);
			System.out.println(" x power y is="+result);
		}
	}
	
}
	
	



	
	


	

	


		


