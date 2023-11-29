package com.java.pat;

public class MainProg {
	
	 public static void main(String[] args) {
		String topic = "Java";
		AbstractFactory factory = new TrainingFactory();
		String result = factory.getDetails(topic);
		System.out.println(result.getTrainingDetails());
	}
}
