package basics;

import java.util.ArrayList;
import java.util.List;
public class tester1{

public static void main(String[] args) {
List<String> list1 = new ArrayList<>();//line 1
List<String> list2 = list1;//line 2
list2.add(new Integer(12), null);//line 3
System.out.println(list2.size());//line 4
}
}


