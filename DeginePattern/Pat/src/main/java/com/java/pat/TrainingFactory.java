package com.java.pat;

public class TrainingFactory extends AbstractFactory {

	@Override
	String getDetails(String topic) {
		 if(topic.equals("Java")) {
			return new JavaTraining();
		}
		
		if(topic.equals("Dotnet")) {
			return new DotnetTraining();
		}
		return null;
	}

	

}
