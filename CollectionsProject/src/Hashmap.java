import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Mumbai");
		map.put(2,"Kolkata");
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()) {
		System.out.println(map.get(itr.next()));
		}
		Iterator itr1 = map.entrySet().iterator();
		while(itr1.hasNext()) {
		Map.Entry entry = (Map.Entry)itr1.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
