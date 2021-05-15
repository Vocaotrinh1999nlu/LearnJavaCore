package Learn.Java8.ForEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoForEachJava8 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("money","abc","marya","marry","david","am","my");
		list.stream().filter(x->x.startsWith("m")).forEach(m->System.out.println(m));
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
}
