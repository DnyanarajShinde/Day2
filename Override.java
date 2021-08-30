class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}
class Override extends Parent{
	void show()
	{
        System.out.println("Child's show()");
    }
	
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new Override();
        obj2.show();
    }
}