package Learn.Java8.DeaulftMethod.Interface;

public class MultiInheritance implements Interface1,Interface2{

	@Override
	public void doSomething() {
		Interface1.super.doSomething();
	}

	public static void main(String[] args) {
		new MultiInheritance().doSomething();
	}
}
