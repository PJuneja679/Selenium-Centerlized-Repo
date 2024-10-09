package pkg1;

public class Student1 
{
int rollNo;
int age;
public void display1() 
{
	System.out.println("welcom to all of you");
}
public void display2()
{
	System.out.println("automation is very easy");
}
public static void main(String[] args) 
{
	Student1 abc=new Student1();
	abc.rollNo= 31;
	abc.age=6;
	System.out.println(abc.rollNo);
	System.out.println(abc.age);
	abc.display1();
	abc.display2();
}
}
