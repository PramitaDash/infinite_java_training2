package infinite.NewFeature;

public class RefExample1 {
	
	void display() {
		System.out.println("Example Of Functional Interface...");
	}
	
	public static void main(String[] args) {
		RefExample1 obj = new RefExample1();
		IMethodRef1 m1 = obj::display;
		m1.show();
	}

}
