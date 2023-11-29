package infinite.NewFeature;

public class ConRef {
	
	public static void main(String[] args) {
		ITest obj1 = Emp::new;
		Emp e = obj1.showEmploy(1, "Raj", 88997);
		System.out.println(e);
	}

}
