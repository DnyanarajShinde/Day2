public class Child extends AccessDemo {
	void show() {
		System.out.println("I'm beleiving in smart work");
	}

	void personality() {
		System.out.println("I do prefer gym");
	}

	void digital() {
		System.out.println("I'm living in digital world");
	}

	public static void main(String args[]) {
		AccessDemo obj1 = new AccessDemo();
		obj1.personality();
		obj1.exercise();
		Child obj = new Child();
		obj.show();
		obj.personality();
		obj.digital();
	}
}
