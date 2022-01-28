   package LockedMe.com;
   				
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



		public class Menus {
			
			String path="C:\\Prasad\\Project_file\\";
			
			public void Menu() throws IOException 
			{
				System.out.println("------------------------------");
				System.out.println(" welcome to Lockme Application");
				System.out.println("      Lockers Pvt. Ltd        ");	
				System.out.println("     Developed by Prasad      ");
				System.out.println("------------------------------");								
				
				
				while(true) {
					System.out.println("\nPlease choose yours choice -->");
					System.out.println("\n----------------------------");
					System.out.println("1) List all the Present Files \n2) More Operations \n3) Exit from Application !!!");
					System.out.println("------------------------------");
					Scanner sc=new Scanner(System.in);
					
					System.out.println("\n--> Enter your choice");
					
					int choice=sc.nextInt();
					try {
					switch (choice) {
					case 1: 
					{  //Display list of files
		 	 
						File f=new File(path);
						File filename[]=f.listFiles();
						System.out.println("This files are present in your folder:\n");
		 	 
						for(File file:filename) 
						{
							System.out.println(file.getName());
						}
							break;
					}
			 
					case 2: 
					{
						OperationsOnFiles();
						break;
					}
					
					case 3: 
					{  
						System.out.println("Thank you....Visit Again.....");
						System.exit(0);
					} 
					
					default:
					//throw new IllegalArgumentException("Unexpected value: " + choice);
						System.out.println("Invalid");
					}
					}catch(Exception e) {
						System.out.println("Invalid ");
					}
			}
		}	
			
		public void OperationsOnFiles() throws IOException {
			
			while(true) {
				System.out.println("---------------------------");
				System.out.println("1) Create a new File\n2) Delete File\n3) Search File\n4) <-- Back to main menu");
				System.out.println("---------------------------");
				Scanner sc=new Scanner(System.in);
				System.out.println("\n--> Enter your choice");
				
				int choice=sc.nextInt();
				
				switch (choice) {
			 
				case 1: 
				{  //File creation
					ArrayList<String> al=new ArrayList<>();
					
					System.out.println("Enter the file name to create");
					String filename=sc.next();
					String finalfilename=path+filename;
					File f=new File(finalfilename);
					boolean result=f.createNewFile();
					
					if(result==false) 
					{
						System.out.println("Your file is not created");
					}
					else 
					{
						al.add(filename);
						System.out.println("Your file "+filename+" is successfully created at C:\\Prasad\\Project_file\\");
					}
						break;
				} 
			 
				case 2: 
				{   // Delete the File
		  	
					System.out.println("Enter the filename to delete");
					String filename=sc.next();
					String finalfilename=path+filename;
					File f=new File(finalfilename); 
					
					if( f.delete()) 
					{
						System.out.println("Your file is successfully deleted.");
					} 
					else 
					{
						System.out.println("Unfortunately this file is not deleted.");
					}
						break;
				}
			 
				case 3: 
				{  //search the File
		   	
					File f=new File(path);
					System.out.println("\nEnter file name to search");
					String filenameserach=sc.next();
					File filename[]=f.listFiles();
		  		 
					int flag=0;
		  		 
					for(File ff:filename) 
					{
		   	 			if(ff.getName().equals(filenameserach))
		   	 			{
		   	 				flag=1;
		   	 				break;
		   	 			}
		   	 			else 
		   	 			{
		   	 				flag=0;
		   	 			}
		   	 		}
		  		 
					if(flag==1) 
					{
						System.out.println(filenameserach+" file is available.");
					}
					else 
					{
						System.out.println("\nSorry "+filenameserach+" file is not available.\n");
					}
						break;	
				}
		   	 
				case 4:
				{
					Menu();
				}
		   	
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
			}
		  }
		}