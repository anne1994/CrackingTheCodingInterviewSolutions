package _2WordFrequencies;


import java.util.HashMap;

class Tester{
	
	
	public static void main(String[] args) { 
		HashMap<String,Integer> table = WordFrequencies.setupDictionary(new String[]{"cracking","the","Coding","interview","cracking","the","Coding"});
		System.out.println(WordFrequencies.getFrequency(table,"coding"));
		
	}
	
	
	
}