package basics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

	public class Map1 {
	    public static void main(String[] args) {
	        Map<String, Integer> priceMap = new HashMap<>();
	        priceMap.put("cr", 9100);
	        priceMap.put("lm", 3700);
	        priceMap.put("jn", 3200);
	        priceMap.put("km", 4000);
	        priceMap.put("rl", 1500);

	       
	        System.out.println("price map: " + priceMap);

	        Set<String> keys = priceMap.keySet();
	       

	        System.out.println("keys of Map : " + keys);
	        

	    }

	}

