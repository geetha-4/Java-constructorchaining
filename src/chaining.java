class Parent{
	Parent(){
		super();
	System.out.println("Inside the parent Constrctor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Inside the child Constructor");
	}
}
class chaining{
	public static void main(String[] args) {
		Child c1=new Child();
	}
	
}