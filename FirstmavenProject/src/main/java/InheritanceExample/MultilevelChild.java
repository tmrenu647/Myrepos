package InheritanceExample;

public class MultilevelChild extends MultilevelIntermediate{
	public void display2() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		MultilevelChild obj=new MultilevelChild();
		obj.display2();
		obj.display();
		obj.print();
	}

}
