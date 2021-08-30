
public class Interface implements MyInterface, MyInterface2 {
	   public void display() {
		      System.out.println("This is the implementation of the display method");
		   }
		   public void show() {
		      MyInterface.super.display();
		      MyInterface2.super.display();
		   }

	public static void main(String[] args) {
	      Interface obj = new Interface();
	      obj.show();

	}

}
