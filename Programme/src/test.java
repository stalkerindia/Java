import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		
	
		String s1= new String("RAhul");
		String s2= "RAhul";
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		

		Map<String,Integer> mapp= new HashMap<String,Integer>();
		mapp.put(null,5);
		mapp.put("5hii",18);
		mapp.put("tr",8);
		
		
		System.out.println(mapp);
		System.out.println(mapp.values());
		System.out.println(mapp.keySet());
		
		Set s= new TreeSet();
		s.add(null);
		s.add("hello");
		System.out.println(s);
		
		
		for(Map.Entry<String,Integer> kk : mapp.entrySet()) {
		System.out.println(kk);
		}
		mapp.values();
		mapp.entrySet().iterator().forEachRemaining(System.out::println);
		mapp.entrySet().iterator().forEachRemaining(k-> System.out.println(k.getKey()));
		
		Iterator<Map.Entry<String,Integer>> itr = mapp.entrySet().iterator(); 
		while(itr.hasNext()== true) {
		System.out.println(itr.next());
		}
	}

}
