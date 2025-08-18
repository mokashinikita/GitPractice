package javaPackage;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) 
	{
		int a=56;
		int b=25;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
