package newyeargift.gift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class App 
{
  public static void main( String[] args )
    {
    	@SuppressWarnings("unused")
		Scanner scan=new Scanner(System.in);
        //System.out.println( "Hello World!" );
    	sweetgeneration();
    	chocogeneration();
    	ArrayList<Chocolates> list=new ArrayList<Chocolates>();
    	Collections.sort(list);
    	Iterator<Chocolates> choco=list.iterator();
    	while(choco.hasNext()) {
    		Chocolates c=choco.next();
    		System.out.println(c.getPrice());
    	}
    	for(Chocolates c:list)
    	{
    		System.out.println(c);
    	}
    	
    }
    public static void sweetgeneration() {
    	Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of sweets");
		int noofsweets=scan.nextInt();
		ArrayList<Sweets> list=new ArrayList<Sweets>();
		for(int i=1;i<=noofsweets;i++){
			int sweetweight=scan.nextInt();
			int price=scan.nextInt();
			Sweets sweet=new Sweets(sweetweight,price);
			list.add(sweet);
			}
	}
    public static void chocogeneration() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter number of chocolates");
		int noofchoco=scan.nextInt();
		ArrayList<Chocolates> list=new ArrayList<Chocolates>();
		for(int i=1;i<=noofchoco;i++){
			int chocoweight=scan.nextInt();
			int price=scan.nextInt();
			Chocolates c=new Chocolates(chocoweight,price);
			list.add(c);
			}
		
	}
}
