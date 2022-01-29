package com.simplilearn.packages;

class DefAccessSpecifier
{
	void test()
	{
		System.out.println("This is a default access specifier");
	}
}

public class AccessSpecifiers1
{
   public static void main(String[] args) 
   {
	  DefAccessSpecifier dfs=new DefAccessSpecifier();
	  dfs.test();
   }
}
