package InheritanceExample;

public class SingleChild extends SingleParent {
	public void display() {
		System.out.println("Child class");
	}


	public static void main(String[] args) {
		
		SingleChild obj=new SingleChild();
		obj.display();
		obj.print();
	}

}
