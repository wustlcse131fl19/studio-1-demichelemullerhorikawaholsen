package studio1;

import support.cse131.ArgsProcessor;

public class Hello {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String mood = ap.nextString("What's your name?");

		System.out.println("Hi " + mood + ". How are you?");
	}

}
