package Learn.Java8.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnLambda {

	public void sortWithLamda() {
		//List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		List<Integer> ages = Arrays.asList(1,5,10,12,3,4,6,8,9,13,16,0,17,-1);
		Collections.sort(ages, (l1,l2)->{
			return l1.compareTo(l2);
		});
		//languages.forEach(l -> System.out.print(l+" "));
		ages.forEach(a -> System.out.print(a+" "));
	}
	
	public void lambWithFunctionalInterface() {
		Sayable1 s1 = ()->{
			return "Sayable1";
		};
		Sayable1 s2 = ()->{
			return "Sayable2";
		};
		System.out.println("\n"+s1.sayable1());
		System.out.println(s2.sayable1());
	}
	
	public void addAble() {
		AddAble add = (a,b) ->{
			return a+b;
		};
		System.out.println("Add result: "+add.caculate(1, 2));
		AddAble mul = (a,b)->{
			return a*b;
		};
		System.out.println("Mul result: "+mul.caculate(5, 3));
		AddAble sub = (a,b)->{
			return a-b;
		};
		System.out.println("Sub result: "+sub.caculate(10, 8));
	}
	public static void main(String[] args) {
		LearnLambda learnLambda = new LearnLambda();
		learnLambda.sortWithLamda();
		learnLambda.lambWithFunctionalInterface();
		learnLambda.addAble();
	}
}
