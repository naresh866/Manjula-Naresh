package com.src;

import java.util.Scanner;
interface Company
{
	public  abstract void cab();

abstract class Emp
{
	int uid;
	String name;
	int age;
	Scanner sc = new Scanner(System.in);
	Emp()
	{
		System.out.println("ENter ID :");
		 uid = sc.nextInt();
		System.out.println("ENter Name : ");
		 name=sc.next();
		System.out.println("ENter Age :");
		 age = sc.nextInt();
	}
	abstract void raiseSalary();
}
class Developer  extends Emp implements Company
{
	
	int salary=50000;
	String desig="Developer";
	Developer()
	{
	}
	void display()
	{
		System.out.println("===========");
		System.out.println("ID :"+ uid );
		System.out.println("Name :"+ name );
		System.out.println("Age :"+ age );
		System.out.println("Salary :"+ salary );
		System.out.println("Desig :"+ desig );		
	}
	@Override
	void raiseSalary() {
		salary= salary+ 10000;
		
	}
	@Override
	public void cab() {
		// bus 
		
	}
	
	
	
}
class Clerk  extends Emp implements Company
{
	int salary=20000;
	String desig="Clerk";
	Clerk()
	{	}
	void display()
	{
		System.out.println("===========");
		System.out.println("ID :"+ uid );
		System.out.println("Name :"+ name );
		System.out.println("Age :"+ age );
		System.out.println("Salary :"+ salary );
		System.out.println("Desig :"+ desig );		
	}
	void raiseSalary()
	{
		
		salary= salary + 5000;
		System.out.println("==Salary Raised =========");				
	}
	@Override
	public void cab() {
		// bus
		
	}

}
class Manager extends Emp implements Company
{
	int salary=90000;
	String desig="Manager";
	Scanner sc = new Scanner(System.in);
	Manager()
	{
	}
	void display()
	{
		System.out.println("===========");
		System.out.println("ID :"+ uid );
		System.out.println("Name :"+ name );
		System.out.println("Age :"+ age );
		System.out.println("Salary :"+ salary );
		System.out.println("Desig :"+ desig );		
	}
	void raiseSalary()
	{
		
		salary= salary + 5000;
		System.out.println("==Salary Raised =========");				
	}
	@Override
	public void cab() {
		// cars
		
	}

}
class Tester extends Emp implements Company
{
	int salary=40000;
	String desig="Tester";
	Scanner sc = new Scanner(System.in);
	Tester()
	{
	}
	void display()
	{
		System.out.println("===========");
		System.out.println("ID :"+ uid );
		System.out.println("Name :"+ name );
		System.out.println("Age :"+ age );
		System.out.println("Salary :"+ salary );
		System.out.println("Desig :"+ desig );		
	}
	void raiseSalary()
	{
		
		salary= salary + 5000;
		System.out.println("==Salary Raised =========");				
	}
	@Override
	public void cab() {
		// bus
		
	}

}
public class  Collections
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch1,ch2,ch3,ch4=0;
		Developer d=null; 
		Clerk c= null;
		Manager m= null;
		Tester t = null;
		Emp e=null;
		do{
			System.out.println("1 ) Create  ");
			System.out.println("2 ) Display ");
			System.out.println("3 ) Raise Salary  ");
			System.out.println("4 ) Exit ");
			ch1= sc.nextInt();
			if(ch1==1){
				do{
					System.out.println("1 ) Developer  ");
					System.out.println("2 ) Clerk ");
					System.out.println("3 ) Manager  ");
					System.out.println("4 ) Tester ");
					System.out.println("5 ) Exit ");
					ch2= sc.nextInt();
					
					if(ch2==1){  d = new Developer();}
					if(ch2==2){  c = new Clerk();}
					if(ch2==3){  m = new Manager();}
					if(ch2==4){  t = new Tester();}

				}while(ch2!=5);
			}
			if(ch1==2){
				do{
					System.out.println("1 ) Developer  ");
					System.out.println("2 ) Clerk ");
					System.out.println("3 ) Manager  ");
					System.out.println("4 ) Tester ");
					System.out.println("5 ) Exit ");
					ch3= sc.nextInt();
					if(ch3==1){ d.display();}
					if(ch3==2){ c.display();}
					if(ch3==3){ m.display();}
					if(ch3==4){ t.display();}

				}while(ch3!=5);

			}
			if(ch1==3){
				do{
					System.out.println("1 ) Developer  ");
					System.out.println("2 ) Clerk ");
					System.out.println("3 ) Manager  ");
					System.out.println("4 ) Tester ");
					System.out.println("5 ) Exit ");
					ch4= sc.nextInt();
					if(ch4==1){ d.raiseSalary();}
					if(ch4==2){ c.raiseSalary();}
					if(ch4==3){ m.raiseSalary();}
					if(ch4==4){ t.raiseSalary();}

				}while(ch4!=5);

			}
			if(ch1==4){
				System.out.println("Thank you ");
				System.exit(0);
			}
					
		}while(ch1!=4);	
	}
}
}
