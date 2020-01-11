import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int matches = 0;
		for(String key : hashmap1.keySet()) {
			for(String key2 : hashmap2.keySet()) {
				if(key.equals(key2)) {
					if(hashmap1.get(key).equals(hashmap2.get(key2))) {
						matches++;
					}
				}
			}
		}
		return matches;
	}

}
