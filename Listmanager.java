package basics;
import java.util.ArrayList;
import java.util.List;

	public class Listmanager {
		public static void main(String [] args)
		{
			 List<String> List1 = new ArrayList<>();
			 List1.add("panner");
			 List1.add("Chicken ");
			 List1.add("fish");
			 List<String> List2 = new ArrayList<>();
			 List2.add("panner");
			 List2.add("Chicken ");
			 List2.add("fish");
			 List1.removeAll(List2);
			 System.out.println("remove menu ="+ List1);
			 

		}

	}


