package C_F_TreeMap;

import java.util.TreeMap;

public class Demo {
public static void main(String[] args) {
	TreeMap m = new TreeMap();
	m.put(100, "ZZZ");
	m.put(103, "YYY");
	m.put(101, "AAA");
	m.put(104, 106);
	m.put(107, null);
	m.put("FFF", "BBB");
	m.put(null, "VVv");
	System.out.println(m);
	
}
}
