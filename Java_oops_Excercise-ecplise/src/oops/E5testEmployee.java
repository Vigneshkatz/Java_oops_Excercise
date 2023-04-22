package oops;

public class E5testEmployee {
	
	public static void main(String[] args) {
		E5person person = new E5person("Vignesh");
		E5employee emp = new E5employee();
		emp.setIssurance_number(5);
		emp.setJoining_year(2023);
		emp.setSalary(72000);
		emp.setPerson(person);
		emp.getEmpDetails();
		
		
	}

}
