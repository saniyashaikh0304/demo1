package repo1;

class Sum{
	
	
	public int sum(int a) {
		return a;
	}
	
	public int sum(int a,int b) {
		return a+b;

	}
}

class B extends Sum{
	@Override
	public int sum(int a) {
		return a;
	}
	@Override
	public int sum(int a, int b) {
		return a*b;
	}
}



public class Overloading {
	public static void main(String[] args) {
		Sum sum = new Sum();
		System.out.println(sum.sum(12));
		System.out.println(sum.sum(12, 12));;
		B b = new B();
		System.out.println(b.sum(20));
		System.out.println(b.sum(20, 3));
	}
}
