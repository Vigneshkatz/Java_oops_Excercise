package inheritanceOops;

public class Calimp {

	public static void main(String[] args) {
		
		Adcalculator cal = new Adcalculator();
		int a = 8;
		int b = 10;
		System.out.println(cal.add(a, b));
		System.out.println(cal.sub(a, b));
		System.out.println(cal.div(a, b));
		System.out.println(cal.mul(a, b));
		System.out.println("just a plain ole string".getClass());
		System.out.println(new Object() instanceof Object);
	}

}
