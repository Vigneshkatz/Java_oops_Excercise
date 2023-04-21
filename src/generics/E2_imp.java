package generics;

public class E2_imp {

	public static void main(String[] args) {
		
		Generic_E2<String,Integer> p1 = new Generic_E2<>();
		p1.setFirst("Hello");
		p1.setSecond(42);
		System.out.println(p1.getFirst());
		System.out.println(p1.getSecond());
		

	}

}
