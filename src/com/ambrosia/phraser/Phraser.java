package com.ambrosia.phraser;

public class Phraser {
	
	public static void main(String[] args) {
		
		String[] phraseOutcome1 = {"Hello", "Chicken", "Nuggests", "Cats", "Dogs", "Doge"};
		String[] phraseOutcome2 = {"Chase", "Be", "Need", "Say", "Want", "Help", "Pay", "Please"};
		String[] phraseOutcome3 = {"Chum", "Want", "Me", "Day", "Dad", "Mom", "Some", "Burgers"};
		
		int phraseLength1 = phraseOutcome1.length;
		int phraseLength2 = phraseOutcome2.length;
		int phraseLength3 = phraseOutcome3.length;
		
		int phraseRandom1 = (int) (Math.random() * phraseLength1);
		int phraseRandom2 = (int) (Math.random() * phraseLength2);
		int phraseRandom3 = (int) (Math.random() * phraseLength3);
		
		String phraseOutput = phraseOutcome1[phraseRandom1] + " " + phraseOutcome2[phraseRandom2] + " " + phraseOutcome3[phraseRandom3];
		
		System.out.println(phraseOutput);
	}
}