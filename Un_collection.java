package basics;

import java.util.*;
public class Un_collection {
	static Set<String> getCollection(String[] str){
		List<String> st = new ArrayList<>();
		Collections.addAll(st, str);
		Collections.sort(st);
		Set<String> s= new HashSet<>();
		s.addAll(st);
		return s;
	}
	public static void main(String[] args) {
		String[] str = new String[]{"nk","aa","dm","dj"};
		System.out.println(getCollection(str));
	}


}
