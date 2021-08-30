public class MethodOverloading {
	int add() {
		return 0;
	}
	public int add(int a, int b) {
		return a+b;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	void add(double a, double b) {
		
	}
public static void main(String args[]) {
	MethodOverloading obj=new MethodOverloading();
	System.out.println(obj.add(4,5));
}
}
