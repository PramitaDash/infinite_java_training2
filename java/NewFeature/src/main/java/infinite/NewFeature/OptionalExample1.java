package infinite.NewFeature;

import java.util.Optional;

public class OptionalExample1 {
	
	public static void main(String[] args) {
		String[] str = new String[10];
		str[0]= "Rahul";
		str[1]="Sourabh";
		str[2]="Naresh";
		str[3]="Sanjya";
		str[4]="Satya";
		str[5]="Nagesh";
//		System.out.println(str[10]);
		Optional<String> result = Optional.ofNullable(str[8]);
		if(result.isPresent()) {
			System.out.println(str[8]);
		}else {
			System.out.println("value is not avilable in the index");
			
		}
	}

}
