import java.util.Scanner;



public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1 = new Person(null, 0, null, 0, 0);
		//System.out.println(p1);
		
		Scanner ob = new Scanner(System.in);
		
		String name,gender;
		int age,income;
		System.out.println("Enter Person Name : ");
		name = ob.next();
		System.out.println("Enter age: ");
		age = ob.nextInt();
		System.out.println("Enter gender: ");
	    gender = ob.next();
		System.out.println("Enter taxable income: ");
	   income = ob.nextInt();
		
		
		//Person object and initialize values using setter
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
							
				
		//display person details using toString() method
				
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person); //tax calculation
		System.out.println("After calculating tax : ");
		System.out.println(person);

		
		
		/*p1.setName("vivek");
		p1.setAge(20);
		p1.setGender("male");
		p1.setIncome(10000000);
		p1.setTax(10000);
		System.out.println(p1);
		*/
		
		

	}

}
