/*
 Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary*/
 
 class Employee{
 	String name;
 	String  jobTitle;
 	int salary;
 	double ctc;
 	int pf = 8;
 	int deduction=5;
 	
 	
 	public Employee(){
 	}
 	public Employee(String name,String jobTitle,double ctc)
 	{
 	
 		this.name = name;
 		this.jobTitle = jonTitle;
 		this.ctc = ctc;
 	}
 	public double salaryCalculation(){
 	
 		salary = ctc/12;
 		salary -= salary*pf/100;
 		salary -= salary*deduction/100
 	}
 	public void salaryUpdation(double percentile)
 	{
 	
 		ctc+=(ctc * percentile/100)
 		
 		System.out.println("Your new Salary is "+ctc);
 		
 	}	
 }
 
 class Employe6{
 	
 	public static void main(String[] args){
 		
 		Employee e = new Employee("Vignesh","Founder","1600000");
 		System.out.print(e.salaryCalculation);
 		e.salaryUpdation(99%);
 	
 	}
 	
 }
