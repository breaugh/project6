package project6;

import java.util.InputMismatchException;
import java.util.Scanner;
 
 public class controller {

	 public static void main(String[] args)

		    {                 

		        Scanner scan = new Scanner(System.in);

		        class2 bst = new class2(); 

		        System.out.println("Hello :)\n");          

		        char ch;
		        int choice=0;
		        //  Options for User

		        do {
		        	try{
		        		
		            System.out.println("1. add a node ");

		            System.out.println("2. delete a node");

		            System.out.println("3. search for a node");

		            System.out.println("4. count the nodes");

		            System.out.println("5. check empty"); 

		 

		            choice = scan.nextInt(); 
		            
		        	} catch(InputMismatchException exception){}

		            switch (choice){

		            //letter check using try-catch

		            case 1 : 
		            	try{
		                System.out.println("Enter integer element to insert");

		                bst.insert( scan.nextInt() );                     
		            	} catch(InputMismatchException exception){}
		                	
		                break; 
		                

		            case 2 : 
		            	try{
		                System.out.println("Enter integer element to delete");

		                bst.delete( scan.nextInt() );                     
		            	} catch(InputMismatchException exception){}
		                break;                         

		            case 3 : 
		            	try{
		                System.out.println("Enter integer element to search");

		                System.out.println("Search result : "+ bst.search( scan.nextInt() ));
		            	} catch(InputMismatchException exception){}
		                break;                                          

		            case 4 : 
		            	try{
		                System.out.println("Nodes = "+ bst.countNodes());
		            	} catch(InputMismatchException exception){}
		                break;     

		            case 5 :  
		            	try{
		                System.out.println("Empty status = "+ bst.isEmpty());
		            	} catch(InputMismatchException exception){}
		                break;            

		            default : 

		                System.out.println("Not acceptable!! \n ");

		                break;   

		            }

		            // different ways the tree displays

		            System.out.print("\nPost order : ");

		            bst.postorder();

		            System.out.print("\nPre order : ");

		            bst.preorder();

		            System.out.print("\nIn order : ");

		            bst.inorder();

		 

		            System.out.println("\n If you want to continue, type y if not, type n \n");

		            ch = scan.next().charAt(0);                        

		        } while (ch == 'Y'|| ch == 'y');               

		    
		 }

	    
	  }
	

