package com.simplilearn.typecasting;

public class TypeCasting 
{
   public static void main(String[] args) 
   {
	  System.out.println("Implicit Type Casting");
	  
	  char a='A';
	  System.out.println("Value of a = " +a);
	  
	  int b=a;
	  System.out.println("Value of b = " +b);
	  
	  long c=a;
	  System.out.println("Value of e = " +c);
	  
	  double d=a;
	  System.out.println("Value of f = " +d);
	  
	  float e=a;
	  System.out.println("Value of g = " +e);
	  
	  System.out.println("\n");
	  
	  System.out.println("Explicit Type Casting");
	  
	  double y=40.5;
	  int z=(int)y;
	  System.out.println("Value of z = " +z);
   }
}
