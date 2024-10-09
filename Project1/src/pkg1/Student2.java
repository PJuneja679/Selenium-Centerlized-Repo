package pkg1;

public class Student2 
{
public int sum(int a, int b)
{
	int sumresult= a+b;
	System.out.println("sumresult="+sumresult);
	return sumresult;
}
public int sub(int a, int b)
{
	int subresult= a-b;
	System.out.println("subresult="+subresult);
	return subresult;
}
public int mul(int a, int b)
{
	int mulresult= a*b;
	System.out.println("mulresult="+mulresult);
	return mulresult;
}
public int div(int a, int b)
{
	int divresult= a/b;
	System.out.println("divresult="+divresult);
	return divresult;
}
public static void main(String[] args) 
{
	Student2 obj= new Student2();
	int result1= obj.sum(10, 2);
	int result2=obj.sum(result1, 2);
	int result3=obj.sub(result2, 2);
	int result4=obj.mul(result3, 2);
	int finalresult=obj.div(result4, 2);
	System.out.println("finalresult="+finalresult);
}
}
