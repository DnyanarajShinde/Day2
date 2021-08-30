
public class RuntimePolymorphism extends Parent1 {
	void drive() {
		System.out.println("I drive run");
	}
	public static void main(String[] args) {
		Parent1 p=new RuntimePolymorphism();
		p.drive();
		Parent1 p1=new Childs();
		p1.drive();
		RuntimePolymorphism obj=new RuntimePolymorphism();
		obj.drive();
		Child2 o=new Child2();
		o.drive();
	}	
}
class Parent1 {
	void drive() {
		System.out.println("I drive maruti 800");
	}
	
}
class Childs extends Parent1{
	void drive() {
		System.out.println("I drive wagonr");
	}
	
}
class Child2 extends Parent1{
	void drive() {
		System.out.println("I drive bmw");
	}
	
}
class Child3 extends Parent{
	void drive() {
		System.out.println("I drive ferrari");
	}
	
}