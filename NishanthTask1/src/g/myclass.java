package g;
import java.util.Scanner;

public class myclass {

	public static void main(String[] args) {
		// que 1 greater than
		int a=2;
		int b=6;
		int c=2;
		int d=2;
		if(a+b>c+d)
			System.out.println("A+B is greater than C+d");
		
	// Que 2 if statement using % 
	
	{ int n=14; {
	 System.out.println("Odd" +"    " + "even");
	 for(int i=1; i<=n;i++) {
		 if(i%2==0) {
			 System.out.println(i);
		 }
			 else
				System.out.print(i+ "    ");
		 }
	 //A to Z programme que 3
	 char m;
	 for(m='A'; m<='Z'; ++m) {
		 System.out.println(m + "    ");}
		 
   //que 4 change variable
		 {		 
	int h=8;
	int t=90;
System.out.println("Before swaping:"+h+"     "+t);
    int temp = h;
    h=t;
    t=temp;
    System.out.println("After swaping:"+h+"     "+t);
	 }
	 }}
//que 5 to find prime number or not
	{{
	int g;
	int count=0;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the value to check:");
	g=x.nextInt();
	if(g<2)
	{
	System.out.println("The given value"+g+"is not prime");
	}
	for(int i=1;i<g;i++)
	{
	if(g%i==0)
		count +=1;
	}
	if(count>2)
	{
		System.out.println("The given value"+g+"is not prime");
	}
		else
		{
		System.out.println("The given value"+g+"is prime");
		}
}

//que 6 factorial
	{ 
	int s=7;
	
	int fact=1;
			
	for (int i=1; i<=s; i++)
		fact=fact*i;
	System.out.println("factorial;  "+fact);
	
	}}

//que 7 length of the given string
{
	String st="Guvi Geek";
	System.out.println(st.length());	
}
//que 8 print a string 10 times
{
	for(int i=0;i<10;i++)
		System.out.println("welcome to guvi");
}

//que 9 senior citizen
{
	String name;
	int age;
	Scanner dc=new Scanner(System.in);
	System.out.println("Enter the passanger name");
	name=dc.next();
	System.out.println("Enter the passanger age");
	age=dc.nextInt();
	if(age>=60)
	{
		System.out.println(name+ "is a senior citizen");
	}
	else
	{
		System.out.println(name+ "is not a senior citizen");
	}
	}


//que 10 no of digits in a integer
{
	int num = 8585976;
	int count =0;
	
	while(num != 0) {
		num = num/10;
		count++;
	}
	System.out.println("digit : "+  count);
}}
	}
