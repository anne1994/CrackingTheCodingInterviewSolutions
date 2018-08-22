package _2WordFrequencies;

import java.util.HashMap;

class WordFrequencies{
	
	//book is given as an string array or a hashmap
	public static HashMap<String, Integer> setupDictionary(String[] book){
		HashMap<String, Integer> table = new HashMap<String,Integer>();
		for(String word : book) {
			word = word.toLowerCase();
			if(word.trim() != "") {
				if(!table.containsKey(word)) {
					table.put(word, 0);
				}
					table.put(word, table.get(word)+1);
				}
			}
			
		return table;
	}
	
	
	
	
	
	public static int getFrequency(HashMap<String, Integer> table, String word) {
		if(table == null || word == null) return -1;
		word = word.toLowerCase();
		if(table.containsKey(word)) {
			return table.get(word);
		}
		return 0;
	}
	
	
	
	
}