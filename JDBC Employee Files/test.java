package JDBC;
import java.util.ArrayList;
import java.util.Scanner;

import JDBC.emp;
import JDBC.dao;
public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//emp e=new emp();
		dao d = new dao();
		int ch = 0;
		int i;
		do
		{
			System.out.println("\n\n1.ADD\n2.DELETE\n3.UPDATE\n4.DISPLAY\n5.EXIT");
			System.out.println("Eneter your choice : ");
			i=sc.nextInt();
			switch(i)
			{
				case 1: 
				if(d.add())
				{
					System.out.println("insert successfull");
					
				}
				else
				{
					System.out.println("insert unsuccessfull");
				}
				break;
				case 2: 
				if(d.delete())
				{
					System.out.println("deletion successfull");
					
				}
				else
				{
					System.out.println("deletion unsuccessfull");
				}
						break;
				case 3: 
					if(d.update())
					{
						System.out.println("update successfull");
						
					}
					else
					{
						System.out.println("update unsuccessfull");
					}
						break;
				case 4: d.view();
				
				/*ArrayList<emp> a =d.view();
					System.out.println();
						System.out.println("ID\t\tNAME\t\tSALARY");
						for(emp e1:a)
						{
							System.out.println(e1.getId()+"\t\t"+e1.getName()+"\t\t"+e1.getSalary());
							System.out.println();
						}*/
						
						break;
				case 5:	break;
			}
		}while(i!=5);
		
	

	}

}


