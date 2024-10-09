package pkg1;

public class Student 
{
int a;
public void abc()
{
	System.out.println("welcome to all of you");
}
public static void main(String[] args) 
{
	Student xyz= new Student();
	xyz.abc();
	xyz.a=122;
	System.out.println(xyz.a);
	xyz.a=333;
	System.out.println(xyz.a);
}
}