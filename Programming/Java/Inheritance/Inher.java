class Member
{
	String name,address,phno;
	int age,salary;
	void printSalary()
	{
		System.out.println("Salary = "+salary);
	}
};
class Employee extends Member
{
	String specialization;
	void display()
	{
		System.out.println(name+"\t"+specialization+"\t"+address+"\t"+age+"\t"+phno);
	}	
};
class Manager extends Member
{
	String department;
	void display()
	{
		System.out.println(name+"\t"+department+"\t"+address+"\t"+age+"\t"+phno);
	}
};
class Inher
{
	public static void main()
	{
		Employee e=new Employee();
		e.name="Samuel";
		e.age=34;
		e.phno="767985876";
		e.adress="4/345,Jopling road";
		e.salary=40000;
		e.dispaly();
		e.printSalary();
	
		Manager m=new Manager();
		m.name="Joshua";
		m.age=39;
		m.phno="631890755";
		m.adress="5-676,Rajendrapur Rd";
		m.salary=200000;
		m.dispaly();
		m.printSalary();
	}
};
		
	