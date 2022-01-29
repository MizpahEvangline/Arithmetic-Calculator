package com.simplilearn.packages;

class PrivateAccessSpecifier
{
	private void display()
	{
		System.out.println("This is private access specifier");
	}
}

public class AccessSpecifier2 
{
   public static void main(String[] args) 
   {
	  PrivateAccessSpecifier pac=new PrivateAccessSpecifier();
	  //pac.display();
      //Trying to access private access specifier
   }  
}
