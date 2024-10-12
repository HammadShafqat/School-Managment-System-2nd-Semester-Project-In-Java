import java.util.*;
import java.io.*;
public class School {
	//static object can be used in all methods
	static Scanner input=new Scanner(System.in);
	static String password;
	//Main method display welcome message and  call authentication method
    public static void main(String[] args){
        System.out.println("\n*** WELCOME TO SCHOOL MANAGEMENT SYSTEM ***");
        authentication();
    }
	//checks that u r a teacher or student and then get user name and password for authentication and call main menu
    public static void authentication(){
		System.out.println("\nEnter 1 if you are Student :");
		System.out.println("Enter 2 if you are Teacher :");
		String select1=input.nextLine();
		if(select1.equals("1")){
			System.out.print("Please Enter User_Name : ");
			System.out.print("Hello");
		while(true){
			String user_name=input.nextLine();
			if(user_name.matches("[a-zA-z ]+")){
				if(user_name.length()>3&&user_name.length()<15)
					break;
				else 
					System.out.println("Wrong input : User Name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct name :-) ");
		}
		System.out.print("Please Enter password to continue : ");
		String match="0000";
		password = input.nextLine();
		if(password.equals(match))
			main_menuS();
		else{
			System.out.println("\nInvalid Password \n");
			authentication();
		}
		}
		else if(select1.equals("2")){
			System.out.print("Please Enter User_Name : ");
		while(true){
			String user_name=input.nextLine();
			if(user_name.matches("[a-zA-z ]+")){
				if(user_name.length()>3&&user_name.length()<15)
					break;
				else 
					System.out.println("Wrong input : User Name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct name :-) ");
		}
		System.out.print("Please Enter password to continue : ");
		String match="12345";
		String password = input.nextLine();
		if(password.equals(match))
			main_menu();
		else{
			System.out.println("\nInvalid Password \n");
			authentication();
		}
		}
		else{
			System.out.println("\nInvalid Choice \n");
			authentication();
		}
    }//main_menuSis a main menu for students
	public static void main_menuS(){
		System.out.println("\n*** Main Menu ***\n ");
		System.out.println("Hello! Please select option : ");
        System.out.println("To check your detail press 1.");
        System.out.println("To check your attendence press 2.");
		System.out.println("To check your cources press 3.");
		String select=input.nextLine();
        if(select.equals("1"))
            Students_Records();
		else if(select.equals("2"))
			AttendenceS();
		else if(select.equals("3"))
			Cources();
		else{
			System.out.println("\nInvalid Choice!!! ");
			System.out.println("Please Enter Valid Input : \n");
			main_menu();
		}
    }
	//Main menu method gets input from user and called the different methods to perform different funcationalities
    public static void main_menu(){
		System.out.println("\n*** Main Menu ***\n ");
        System.out.println("To check Teachers Record press 1.");
        System.out.println("To check Students detail press 2.");
        System.out.println("To mark Students attendence press 3.");
        System.out.println("To enter Student Result press 4.");
        System.out.println("For new admission press 5.");
        System.out.println("For delete Student Record press 6.");
		System.out.println("To check/modify cources press 7.");
		String select=input.nextLine();
        if(select.equals("1"))
            Teachers_Record();
		else if(select.equals("2"))
			Students_Records();
		else if(select.equals("3"))
			Attendence();
		else if(select.equals("4"))
		    Enter_Result();
		else if(select.equals("5"))
			New_Admission();
		else if(select.equals("6"))
			Delete_Student();
		else if(select.equals("7"))
			CourcesT();
		else{
			System.out.println("");
			System.out.println("Invalid Choice!!! ");
			System.out.println("Please Enter Valid Input : ");
			System.out.println("");
			main_menu();
		}
    }
	//In Teacher record method teachers file are created and data written in files also it gets  input from user to call different methods
	//to display teachers details
    public static void Teachers_Record(){
        System.out.println("\n\nTo check Sir Shahzad's Record (Press 1): ");
        System.out.println("To check Sir Zulfiqar's Record (Press 2): ");
        System.out.println("To check MAM Sadia's Record (Press 3): ");
        System.out.println("To check MAM Rabia's Record (Press 4): ");
        System.out.println("To check MAM Sania's Record (Press 5): ");
        System.out.println("Press 0 for return main menu :");
        File Shahzad_Sir=new File("Shahzad_Sir.txt");
        File Zulfiqar_Sir=new File("Zulfiqar_Sir.txt");
        File Sadia_MAM=new File("Sadia_MAM.txt");
        File Rabia_MAM=new File("Rabia_MAM.txt");
        File Sania_MAM=new File("Sania_MAM.txt");
		// below here Sir Shahzad file is created and date wrote in file
        try{
            Shahzad_Sir.createNewFile();
            FileWriter Sir_Shahzad=new FileWriter("Shahzad_Sir.txt");
            Sir_Shahzad.write("Name : Shahzad Akram \nF\\Name : Akram Ali\nEmail : shahzad123@gmail.com\nContact # : 0300-0000000\nSalary : 120,000pkr\nAddress : Rawalpindi Pakistan ");
            Sir_Shahzad.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }// below here Sir Zulfiqar file is created and date wrote in file
        try{
            Zulfiqar_Sir.createNewFile();
            FileWriter Sir_Zulfiqar=new FileWriter("Zulfiqar_Sir.txt");
            Sir_Zulfiqar.write("Name : Zulfiqar Jamal \nF\\Name : Shah Nawaz\nEmail : zulfiqar3232@gmail.com\nContact # : 0311-1111111\nSalary : 120,000pkr\nAddress : Lahore Pakistan ");
            Sir_Zulfiqar.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }// below here MAM Sadia file is created and date wrote in file
        try{
            Sadia_MAM.createNewFile();
            FileWriter Sir_Zulfiqar=new FileWriter("Sadia_MAM.txt");
            Sir_Zulfiqar.write("Name : Sadia Kamran \nF\\Name : Anwar Ali\nEmail :sadia1166@gmail.com\nContact # : 0333-3333333\nSalary : 150,000pkr\nAddress : Bagh AJK ");
            Sir_Zulfiqar.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }// below here MAM Rabia file is created and date wrote in file
        try{
            Rabia_MAM.createNewFile();
            FileWriter Sir_Zulfiqar=new FileWriter("Rabia_MAM.txt");
            Sir_Zulfiqar.write("Name : Rabia Anum \nF\\Name : Waqar Ikhtiar\nEmail : rabia99@gmail.com\nContact # : 0344-4444444\nSalary : 125,000pkr\nAddress : Karachi Pakistan ");
            Sir_Zulfiqar.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }// below here MAM Sania file is created and date wrote in file
        try{
            Sania_MAM.createNewFile();
            FileWriter Sir_Zulfiqar=new FileWriter("Sania_MAM.txt");
            Sir_Zulfiqar.write("Name : Sania Saddaf \nF\\Name : Muhammad Abu Bakar\nEmail : sania22@gmail.com\nContact # : 0355-5555555\nSalary : 100,000pkr\nAddress : Bahawalpur Pakistan ");
            Sir_Zulfiqar.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
		try{
			String sel_teac=input.nextLine();
        if(sel_teac.equals("0"))
            main_menu();
        else if(sel_teac.equals("1"))
            Sir_Shah();
        else if(sel_teac.equals("2"))
            Sir_Zulfi();
        else if(sel_teac.equals("3"))
            MAM_Sadia();
        else if(sel_teac.equals("4"))
            MAM_Rabia();
        else if(sel_teac.equals("5"))
            MAM_Sania();
        else{
            System.out.println("\nInvalid Input !!!! \n");
            System.out.println("Please enter Valid Input  \n");
            Teachers_Record();
        }
    }catch(Exception e){
		System.out.print(e.getMessage());
	}
	}//Below method is display the sir shahzad record by reading his file 
    public static void Sir_Shah(){
        try{
            FileReader data_read1= new FileReader("Shahzad_Sir.txt");
            try{
                int i;
                while((i=data_read1.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_read1.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress 1 for main menu \nPress 2 for return Teachers Records\nPress any other key for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
		else if(repeat.equals("2"))
			Teachers_Record();
    }//Below method is display the sir Zulfiqar record by reading his file 
    public static void Sir_Zulfi(){
        try{
            FileReader data_read2= new FileReader("Zulfiqar_Sir.txt");
            try{
                int i;
                while((i=data_read2.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_read2.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress 1 for main menu \nPress 2 for return Teachers Records\nPress any other key for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
		else if(repeat.equals("2"))
			Teachers_Record();
    }//Below method is display the MAM Sadia record by reading his file 
    public static void MAM_Sadia(){
        try{
            FileReader data_read3= new FileReader("Sadia_MAM.txt");
            try{
                int i;
                while((i=data_read3.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_read3.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress 1 for main menu \nPress 2 for return Teachers Records\nPress any other key for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
		else if(repeat.equals("2"))
			Teachers_Record();
    }//Below method is display the MAM Rabia record by reading his file 
    public static void MAM_Rabia(){
        try{
            FileReader data_read4= new FileReader("Rabia_MAM.txt");
            try{
                int i;
                while((i=data_read4.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_read4.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress 1 for main menu \nPress 2 for return Teachers Records\nPress any other key for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
		else if(repeat.equals("2"))
			Teachers_Record();
    }//Below method is display the MAM Sania record by reading his file 
    public static void MAM_Sania(){
        try{
            FileReader data_read5= new FileReader("Sania_MAM.txt");
            try{
                int i;
                while((i=data_read5.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_read5.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress 1 for main menu \nPress 2 for return Teachers Records\nPress any other key for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
		else if(repeat.equals("2"))
			Teachers_Record();
    }//below method get input from user to select the class 
    public static void Students_Records(){
        System.out.println("Please select the class :\n");
        System.out.println("Enter 0 for for Class Nursery  :");
        System.out.println("Enter 1 for for First Class  :");
        System.out.println("Enter 2 for for Secound Class  :");
        System.out.println("Enter 3 for for Third Class  :");
        System.out.println("Enter 4 for for Fourth Class  :");
        System.out.println("Enter 5 for for Fiveth Class  :");
		String select_class=input.nextLine();
        if(select_class.equals("0"))
            Class_Nur();
        else if(select_class.equals("1"))
            Class_One();
        else if(select_class.equals("2"))
            Class_Two();
        else if(select_class.equals("3"))
            Class_Three();
        else if(select_class.equals("4"))
            Class_Four();
        else if(select_class.equals("5"))
            Class_Five();
        else{
            System.out.println("Invalid choice !\nPlease Enter a valid choice to continue :\n");
            Students_Records();
           }
    }//in below method we select the nursery student by roll no and call his method
    public static void Class_Nur(){
        System.out.println("\n*** Class Nursery ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
            String roll=input.nextLine();
            if(roll.equals(roll_no[0]))
                C0R1();
			else if(roll.equals(roll_no[1]))
                C0R2();
			else if(roll.equals(roll_no[2]))
                C0R3();
			else if(roll.equals(roll_no[3]))
                C0R4();
			else if(roll.equals(roll_no[4]))
                C0R5();
			else {
				System.out.println("\nInvalid choice !\nPlease enter roll no from 1-5 \n\n ");
				Class_Nur();
    }
	}//below method is used to display roll no 1 student of nursery class's data by reading his file
    public static void C0R1(){
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readNur1= new FileReader("Nur_Student1.txt");
            try{
                int i;
                while((i=data_readNur1.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readNur1.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
		}
    //below method is used to display roll no 2 student of nursery class's data by reading his file
	    public static void C0R2(){
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readNur2= new FileReader("Nur_Student2.txt");
            try{
                int i;
                while((i=data_readNur2.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readNur2.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//below method is used to display roll no 3 student of nursery class's data by reading his file
	    public static void C0R3(){
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readNur3= new FileReader("Nur_Student3.txt");
            try{
                int i;
                while((i=data_readNur3.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readNur3.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//below method is used to display roll no 4 student of nursery class's data by reading his file
	    public static void C0R4(){
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readNur4= new FileReader("Nur_Student4.txt");
            try{
                int i;
                while((i=data_readNur4.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readNur4.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//below method is used to display roll no 5 student of nursery class's data by reading his file
	    public static void C0R5(){
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readNur5= new FileReader("Nur_Student5.txt");
            try{
                int i;
                while((i=data_readNur5.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readNur5.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//below method is used to display roll no 1 student of One class's data by reading his file
	    public static void C1R1(){
		System.out.println("");
		System.out.println("Personal Details : ");
		System.out.println("");
        try{
            FileReader data_readOne1= new FileReader("One_Student1.txt");
            try{
                int i;
                while((i=data_readOne1.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readOne1.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//below method is used to display roll no 2 student of One class's data by reading his file
		public static void C1R2(){
		System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readOne2= new FileReader("One_Student2.txt");
            try{
                int i;
                while((i=data_readOne2.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readOne2.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }   //below method is used to display roll no 3 student of One class's data by reading his file
    	public static void C1R3(){
		System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readOne3= new FileReader("One_Student3.txt");
            try{
                int i;
                while((i=data_readOne3.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readOne3.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//below method is used to display roll no 4 student of One class's data by reading his file
	    public static void C1R4(){
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readOne4= new FileReader("One_Student4.txt");
            try{
                int i;
                while((i=data_readOne4.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readOne4.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//below method is used to display roll no 5 student of One class's data by reading his file
	    public static void C1R5(){
		System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readOne5= new FileReader("One_Student5.txt");
            try{
                int i;
                while((i=data_readOne5.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readOne5.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }//method to select the roll no of class one to select the student ans call his methos to show his record
    	public static void Class_One(){
        System.out.println("\n"+"*** Class One ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
        String roll=input.nextLine();
        if(roll.equals(roll_no[0]))
            C1R1();
		else if(roll.equals(roll_no[1]))
            C1R2();
		else if(roll.equals(roll_no[2]))
            C1R3();
		else if(roll.equals(roll_no[3]))
            C1R4();
		else if(roll.equals(roll_no[4]))
            C1R5();
		else {
			System.out.println("\nInvalid choice !\n ");
			System.out.println("Please enter roll no from 1-5 ");
			Class_One();
		}
    }//method to select the roll no of class two to select the student and call his methos to show his record
    	public static void Class_Two(){
        System.out.println("\n*** Class Two ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
        String roll=input.nextLine();
        if(roll.equals(roll_no[0]))
            C2R1();
		else if(roll.equals(roll_no[1]))
            C2R2();
		else if(roll.equals(roll_no[2]))
            C2R3();
		else if(roll.equals(roll_no[3]))
            C2R4();
		else if(roll.equals(roll_no[4]))
            C2R5();
		else{
			System.out.println("\nInvalid choice ! \n");
			System.out.println("Please enter roll no from 1-5 \n");
			Class_Two();
		}
    }
	public static void C2R1(){//This method show the record of class 2 roll no 1 record by reading hid file
		System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readTwo1= new FileReader("Two_Student1.txt");
            try{
                int i;
                while((i=data_readTwo1.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readTwo1.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }	
	public static void C2R2(){//This method show the record of class 2 roll no 2 record by reading hid file
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readTwo2= new FileReader("Two_Student2.txt");
            try{
                int i;
                while((i=data_readTwo2.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readTwo2.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C2R3(){//This method show the record of class 2 roll no 3 record by reading hid file
		System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readTwo3= new FileReader("Two_Student3.txt");
            try{
                int i;
                while((i=data_readTwo3.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readTwo3.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C2R4(){//This method show the record of class 2 roll no 4 record by reading hid file
		System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readTwo4= new FileReader("Two_Student4.txt");
            try{
                int i;
                while((i=data_readTwo4.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readTwo4.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C2R5(){//This method show the record of class 2 roll no 5 record by reading hid file
		System.out.println("\nPersonal Details :\n");
        try{
            FileReader data_readTwo5= new FileReader("Two_Student5.txt");
            try{
                int i;
                while((i=data_readTwo5.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readTwo5.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Class_Three(){//this method is used to select the student by his roll no to call his file reading method to shoew his details
        System.out.println("\n*** Class Three ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
        String roll=input.nextLine();
        if(roll.equals(roll_no[0]))
            C3R1();
		else if(roll.equals(roll_no[1]))
            C3R2();
		else if(roll.equals(roll_no[2]))
            C3R3();
		else if(roll.equals(roll_no[3]))
            C3R4();
		else if(roll.equals(roll_no[4]))
            C3R5();
		else {
			System.out.println("\nInvalid choice !\n ");
			System.out.println("Please enter roll no from 1-5 ");
			Class_Three();
		}
	}
	public static void C3R1(){//This method show the record of class 3 roll no 1 record by reading hid file also it gets password to return to main menu
		System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readThree1= new FileReader("Three_Student1.txt");
            try{
                int i;
                while((i=data_readThree1.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readThree1.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C3R2(){//This method show the record of class 3 roll no 2 record by reading hid file also it gets password to return to main menu
		System.out.println("\nPersonal Details : \n");
        try{
            FileReader data_readThree2= new FileReader("Three_Student2.txt");
            try{
                int i;
                while((i=data_readThree2.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readThree2.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C3R3(){//This method show the record of class 3 roll no 3 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readThree3= new FileReader("Three_Student3.txt");
            try{
                int i;
                while((i=data_readThree3.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readThree3.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C3R4(){//This method show the record of class 3 roll no 4 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readThree4= new FileReader("Three_Student4.txt");
            try{
                int i;
                while((i=data_readThree4.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readThree4.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C3R5(){//This method show the record of class 3 roll no 5 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readThree5= new FileReader("Three_Student5.txt");
            try{
                int i;
                while((i=data_readThree5.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readThree5.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Class_Four(){//this method is used to select the student by his roll no to call his file reading method to shoew his details
        System.out.println("\n*** Class Four ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
        String roll=input.nextLine();
        if(roll.equals(roll_no[0]))
            C4R1();
		else if(roll.equals(roll_no[1]))
            C4R2();
		else if(roll.equals(roll_no[2]))
            C4R3();
		else if(roll.equals(roll_no[3]))
            C4R4();
		else if(roll.equals(roll_no[4]))
            C4R5();
		else {
			System.out.println("\nInvalid choice ! \n");
			System.out.println("Please enter roll no from 1-5 \n");
			Class_Four();
		}
	}
	public static void C4R1(){//This method show the record of class 4 roll no 1 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFour1= new FileReader("Four_Student1.txt");
            try{
                int i;
                while((i=data_readFour1.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFour1.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C4R2(){//This method show the record of class 4 roll no 2 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFour2= new FileReader("Four_Student2.txt");
            try{
                int i;
                while((i=data_readFour2.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFour2.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C4R3(){//This method show the record of class 4 roll no 3 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFour3= new FileReader("Four_Student3.txt");
            try{
                int i;
                while((i=data_readFour3.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFour3.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C4R4(){//This method show the record of class 4 roll no 4 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFour4= new FileReader("Four_Student4.txt");
            try{
                int i;
                while((i=data_readFour4.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFour4.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C4R5(){//This method show the record of class 4 roll no 5 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFour5= new FileReader("Four_Student5.txt");
            try{
                int i;
                while((i=data_readFour5.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFour5.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Class_Five(){//this method is used to select the student by his roll no to call his file reading method to shoew his details
        System.out.println("\n*** Class Five ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
        String roll=input.nextLine();
        if(roll.equals(roll_no[0]))
            C5R1();
		else if(roll.equals(roll_no[1]))
            C5R2();
		else if(roll.equals(roll_no[2]))
            C5R3();
		else if(roll.equals(roll_no[3]))
            C5R4();
		else if(roll.equals(roll_no[4]))
            C5R5();
		else {
			System.out.println("");
			System.out.println("\nInvalid choice ! ");
			System.out.println("Please enter roll no from 1-5 \n");
			Class_Five();
		}
	}
	public static void C5R1(){//This method show the record of class 5 roll no 1 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFive1= new FileReader("Five_Student1.txt");
            try{
                int i;
                while((i=data_readFive1.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFive1.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C5R2(){//This method show the record of class 5 roll no 2 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFive2= new FileReader("Five_Student2.txt");
            try{
                int i;
                while((i=data_readFive2.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFive2.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C5R3(){//This method show the record of class 5 roll no 3 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFive3= new FileReader("Five_Student3.txt");
            try{
                int i;
                while((i=data_readFive3.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFive3.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C5R4(){//This method show the record of class 5 roll no 4 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFive4= new FileReader("Five_Student4.txt");
            try{
                int i;
                while((i=data_readFive4.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFive4.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void C5R5(){//This method show the record of class 5 roll no 5 record by reading hid file also it gets password to return to main menu
        System.out.println("\nPersonal Details :\n ");
        try{
            FileReader data_readFive5= new FileReader("Five_Student5.txt");
            try{
                int i;
                while((i=data_readFive5.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readFive5.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress 1 for return to Student Records\nOR\nAnd any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else if(select2.equals("1"))
			Students_Records();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Enter_Result(){//This method is used to enter academic details of students also display their record
		System.out.println("Please select the class :\n");
        System.out.println("Enter 0 for for Class Nursery  :");
        System.out.println("Enter 1 for for First Class  :");
        System.out.println("Enter 2 for for Secound Class  :");
        System.out.println("Enter 3 for for Third Class  :");
        System.out.println("Enter 4 for for Fourth Class  :");
        System.out.println("Enter 5 for for Fiveth Class  :");
		String s_class=input.nextLine();
		if(s_class.equals("0")){
            System.out.println("Enter student roll number: ");
            String rollNumber = input.nextLine();
			System.out.println("");
			if(rollNumber.equals("1")){
				String academic="\n*** Academic Details ***\n";
				try{
					System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Picture Story Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3;
				double percentage=(totalMarks*100)/300;
				try (
						BufferedWriter Class0 = new BufferedWriter(new FileWriter("Nur_Student1.txt",true))) {
						Class0.write("\n" + academic+"\n\n");
						Class0.write("Name : Saim Ali\n ");
						Class0.write("Roll Number: " + rollNumber+"\n");
						Class0.write("Class : Nursery ");
						Class0.write("Marks in Urdu : " + marks1+"\n");
						Class0.write("Marks in English : " + marks2+"\n");
						Class0.write("Marks in Picture Story : " + marks3+"\n");
						Class0.write("Total marks: " + totalMarks+"\n");
						Class0.write("Percentage: " + percentage+"\n");
				} catch (Exception e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C0R1();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
			}	
			else if(rollNumber.equals("2")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Picture Story Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3;
				double percentage=(totalMarks*100)/300;
				try (
						BufferedWriter Class01 = new BufferedWriter(new FileWriter("Nur_Student2.txt",true))) {
						Class01.write("\n" + academic+"\n\n");
						Class01.write("Name : Saad Raza \n");
						Class01.write("Roll Number: " + rollNumber+"\n");
						Class01.write("Class : Nursery ");
						Class01.write("Marks in Urdu : " + marks1+"\n");
						Class01.write("Marks in English : " + marks2+"\n");
						Class01.write("Marks in Picture Story : " + marks3+"\n");
						Class01.write("Total marks: " + totalMarks+"\n");
						Class01.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C0R2();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("3")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Picture Story Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3;
				double percentage=(totalMarks*100)/300;
				try (
						BufferedWriter Class02 = new BufferedWriter(new FileWriter("Nur_Student3.txt",true))) {
						Class02.write("\n" + academic+"\n\n");
						Class02.write("Name : Sara Khan \n");
						Class02.write("Roll Number: " + rollNumber+"\n");
						Class02.write("Class : Nursery ");
						Class02.write("Marks in Urdu : " + marks1+"\n");
						Class02.write("Marks in English : " + marks2+"\n");
						Class02.write("Marks in Picture Story : " + marks3+"\n");
						Class02.write("Total marks: " + totalMarks+"\n");
						Class02.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C0R3();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
			}
			else if(rollNumber.equals("4")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Picture Story Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3;
				double percentage=(totalMarks*100)/300;
				try (
						BufferedWriter Class03 = new BufferedWriter(new FileWriter("Nur_Student4.txt",true))) {
						Class03.write("\n" + academic+"\n\n");
						Class03.write("Name : Zoya Ali \n");
						Class03.write("Roll Number: " + rollNumber+"\n");
						Class03.write("Class : Nursery ");
						Class03.write("Marks in Urdu : " + marks1+"\n");
						Class03.write("Marks in English : " + marks2+"\n");
						Class03.write("Marks in Picture Story : " + marks3+"\n");
						Class03.write("Total marks: " + totalMarks+"\n");
						Class03.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C0R4();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
			}
			else if(rollNumber.equals("5")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Picture Story Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3;
				double percentage=(totalMarks*100)/300;
				try (
						BufferedWriter Class04 = new BufferedWriter(new FileWriter("Nur_Student5.txt",true))) {
						Class04.write("\n" + academic+"\n\n");
						Class04.write("Name : Bilawal Ajaib\n ");
						Class04.write("Roll Number: " + rollNumber+"\n");
						Class04.write("Class : Nursery ");
						Class04.write("Marks in Urdu : " + marks1+"\n");
						Class04.write("Marks in English : " + marks2+"\n");
						Class04.write("Marks in Picture Story : " + marks3+"\n");
						Class04.write("Total marks: " + totalMarks+"\n");
						Class04.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C0R5();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
		}	
		else{
					System.out.println("\nInvalid Input ");
					System.out.println("Roll Number must be from 1-5 : Because you only have 5 student in your Class :-)\n");
					Enter_Result();
				}
	}
	else if(s_class.equals("1")){
		System.out.println("Enter student roll number: ");
            String rollNumber = input.nextLine();
			System.out.println("");
			if(rollNumber.equals("1")){
				String academic="\n*** Academic Details ***\n";
				try{
					System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4;
				double percentage=(totalMarks*100)/400;
				try (
						BufferedWriter Class11 = new BufferedWriter(new FileWriter("One_Student1.txt",true))) {
						Class11.write("\n" + academic+"\n\n");
						Class11.write("Name : Saram Khan\n");
						Class11.write("Roll Number: " + rollNumber+"\n");
						Class11.write("Class : One \n");
						Class11.write("Marks in Urdu : " + marks1+"\n");
						Class11.write("Marks in English : " + marks2+"\n");
						Class11.write("Marks in Mathematics : " + marks3+"\n");
						Class11.write("Marks in Drawing : " + marks4+"\n");
						Class11.write("Total marks: " + totalMarks+"\n");
						Class11.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C1R1();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
			}	
			else if(rollNumber.equals("2")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4;
				double percentage=(totalMarks*100)/400;
				try (
						BufferedWriter Class12 = new BufferedWriter(new FileWriter("One_Student2.txt",true))) {
						Class12.write("\n" + academic+"\n");
						Class12.write("Name : Azan Rashid\n ");
						Class12.write("Roll Number: " + rollNumber+"\n");
						Class12.write("Class : One \n");
						Class12.write("Marks in Urdu : " + marks1+"\n");
						Class12.write("Marks in English : " + marks2+"\n");
						Class12.write("Marks in Mathematics : " + marks3+"\n");
						Class12.write("Marks in Drawing : " + marks4+"\n");
						Class12.write("Total marks: " + totalMarks+"\n");
						Class12.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C1R2();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("3")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4;
				double percentage=(totalMarks*100)/400;
				try (
						BufferedWriter Class13= new BufferedWriter(new FileWriter("One_Student3.txt",true))) {
						Class13.write("\n" + academic+"\n\n");
						Class13.write("Name : Umer Ramzan\n ");
						Class13.write("Roll Number: " + rollNumber+"\n");
						Class13.write("Class : One \n");
						Class13.write("Marks in Urdu : " + marks1+"\n");
						Class13.write("Marks in English : " + marks2+"\n");
						Class13.write("Marks in Mathematics : " + marks3+"\n");
						Class13.write("Marks in Drawing : " + marks4+"\n");
						Class13.write("Total marks: " + totalMarks+"\n");
						Class13.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C1R3();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
			}
			else if(rollNumber.equals("4")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4;
				double percentage=(totalMarks*100)/400;
				try (
						BufferedWriter Class14 = new BufferedWriter(new FileWriter("One_Student4.txt",true))) {
						Class14.write("\n" + academic+"\n\n");
						Class14.write("Name : Hijab Azhar \n");
						Class14.write("Roll Number: " + rollNumber+"\n");
						Class14.write("Class : One \n");
						Class14.write("Marks in Urdu : " + marks1+"\n");
						Class14.write("Marks in English : " + marks2+"\n");
						Class14.write("Marks in Mathematics : " + marks3+"\n");
						Class14.write("Marks in Drawing : " + marks4+"\n");
						Class14.write("Total marks: " + totalMarks+"\n");
						Class14.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C1R4();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("5")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100  \n");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4;
				double percentage=(totalMarks*100)/400;
				try (
						BufferedWriter Class15 = new BufferedWriter(new FileWriter("One_Student5.txt",true))) {
						Class15.write("\n" + academic+"\n\n");
						Class15.write("Name : Sania Shahzad \n");
						Class15.write("Roll Number: " + rollNumber+"\n");
						Class15.write("Class : One \n");
						Class15.write("Marks in Urdu : " + marks1+"\n");
						Class15.write("Marks in English : " + marks2+"\n");
						Class15.write("Marks in Mathematics : " + marks3+"\n");
						Class15.write("Marks in Drawing : " + marks4+"\n");
						Class15.write("Total marks: " + totalMarks+"\n");
						Class15.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C1R5();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
		}	
		else{
					System.out.println("\nInvalid Input ");
					System.out.println("Roll Number must be from 1-5 : Because you only have 5 student in your Class :-)\n\n");
					Enter_Result();
				}
	}
	else if(s_class.equals("2")){
		System.out.println("Enter student roll number: ");
            String rollNumber = input.nextLine();
			System.out.println("");
			if(rollNumber.equals("1")){
				String academic="\n*** Academic Details ***\n";
				try{
					System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class21 = new BufferedWriter(new FileWriter("Two_Student1.txt",true))) {
						Class21.write("\n" + academic+"\n\n");
						Class21.write("Name : Muhammad Ali\n");
						Class21.write("Roll Number: " + rollNumber+"\n");
						Class21.write("Class : Two \n");
						Class21.write("Marks in Urdu : " + marks1+"\n");
						Class21.write("Marks in English : " + marks2+"\n");
						Class21.write("Marks in Mathematics : " + marks3+"\n");
						Class21.write("Marks in Drawing : " + marks4+"\n");
						Class21.write("Marks in Social Study : " + marks5+"\n");
						Class21.write("Marks in Islamiat : " + marks6+"\n");
						Class21.write("Total marks: " + totalMarks+"\n");
						Class21.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C2R1();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
			}	
			else if(rollNumber.equals("2")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class22 = new BufferedWriter(new FileWriter("Two_Student2.txt",true))) {
						Class22.write("\n" + academic+"\n\n");
						Class22.write("Name : Hamza Shafique\n ");
						Class22.write("Roll Number: " + rollNumber+"\n");
						Class22.write("Class : Two \n");
						Class22.write("Marks in Urdu : " + marks1+"\n");
						Class22.write("Marks in English : " + marks2+"\n");
						Class22.write("Marks in Mathematics : " + marks3+"\n");
						Class22.write("Marks in Drawing : " + marks4+"\n");
						Class22.write("Marks in Social Study : " + marks5+"\n");
						Class22.write("Marks in Islamiat : " + marks6+"\n");
						Class22.write("Total marks: " + totalMarks+"\n");
						Class22.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C2R2();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("3")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class23= new BufferedWriter(new FileWriter("Two_Student3.txt",true))) {
						Class23.write("\n" + academic+"\n\n");
						Class23.write("Name : Salman Agha \n");
						Class23.write("Roll Number: " + rollNumber+"\n");
						Class23.write("Class : Two \n");
						Class23.write("Marks in Urdu : " + marks1+"\n");
						Class23.write("Marks in English : " + marks2+"\n");
						Class23.write("Marks in Mathematics : " + marks3+"\n");
						Class23.write("Marks in Drawing : " + marks4+"\n");
						Class23.write("Marks in Social Study : " + marks5+"\n");
						Class23.write("Marks in Islamiat : " + marks6+"\n");
						Class23.write("Total marks: " + totalMarks+"\n");
						Class23.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C2R3();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
			}
			else if(rollNumber.equals("4")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class24 = new BufferedWriter(new FileWriter("Two_Student4.txt",true))) {
						Class24.write("\n" + academic+"\n\n");
						Class24.write("Name : Shamila Parveen \n");
						Class24.write("Roll Number: " + rollNumber+"\n");
						Class24.write("Class : Two \n");
						Class24.write("Marks in Urdu : " + marks1+"\n");
						Class24.write("Marks in English : " + marks2+"\n");
						Class24.write("Marks in Mathematics : " + marks3+"\n");
						Class24.write("Marks in Drawing : " + marks4+"\n");
						Class24.write("Marks in Social Study : " + marks5+"\n");
						Class24.write("Marks in Islamiat : " + marks6+"\n");
						Class24.write("Total marks: " + totalMarks+"\n");
						Class24.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C2R4();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("5")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Drawing  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100 ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class25 = new BufferedWriter(new FileWriter("Two_Student5.txt",true))) {
						Class25.write("\n" + academic+"\n\n");
						Class25.write("Name : Ahmen Khan \n");
						Class25.write("Roll Number: " + rollNumber+"\n");
						Class25.write("Class : Two \n");
						Class25.write("Marks in Urdu : " + marks1+"\n");
						Class25.write("Marks in English : " + marks2+"\n");
						Class25.write("Marks in Mathematics : " + marks3+"\n");
						Class25.write("Marks in Drawing : " + marks4+"\n");
						Class25.write("Marks in Social Study : " + marks5+"\n");
						Class25.write("Marks in Islamiat : " + marks6+"\n");
						Class25.write("Total marks: " + totalMarks+"\n");
						Class25.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C2R5();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
		}	
		else{
					System.out.println("Invalid Input\nRoll Number must be from 1-5 : Because you only have 5 student in your Class :-) ");
					Enter_Result();
				}
	}
	else if(s_class.equals("3")){
		System.out.println("Enter student roll number: ");
            String rollNumber = input.nextLine();
			System.out.println("");
			if(rollNumber.equals("1")){
				String academic="\n*** Academic Details ***\n";
				try{
					System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class31 = new BufferedWriter(new FileWriter("Three_Student1.txt",true))) {
						Class31.write("\n" + academic+"\n\n");
						Class31.write("Name : Khan Muhammad\n");
						Class31.write("Roll Number: " + rollNumber+"\n");
						Class31.write("Class : Three \n");
						Class31.write("Marks in Urdu : " + marks1+"\n");
						Class31.write("Marks in English : " + marks2+"\n");
						Class31.write("Marks in Mathematics : " + marks3+"\n");
						Class31.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class31.write("Marks in Social Study : " + marks5+"\n");
						Class31.write("Marks in Islamiat : " + marks6+"\n");
						Class31.write("Total marks: " + totalMarks+"\n");
						Class31.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C3R1();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks \n\n");
					Enter_Result();
				}
			}	
			else if(rollNumber.equals("2")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class32 = new BufferedWriter(new FileWriter("Three_Student2.txt",true))) {
						Class32.write("\n" + academic+"\n\n");
						Class32.write("Name : Babar Azam \n");
						Class32.write("Roll Number: " + rollNumber+"\n");
						Class32.write("Class : Three \n");
						Class32.write("Marks in Urdu : " + marks1+"\n");
						Class32.write("Marks in English : " + marks2+"\n");
						Class32.write("Marks in Mathematics : " + marks3+"\n");
						Class32.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class32.write("Marks in Social Study : " + marks5+"\n");
						Class32.write("Marks in Islamiat : " + marks6+"\n");
						Class32.write("Total marks: " + totalMarks+"\n");
						Class32.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C3R2();
				}catch(Exception e){;
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("3")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class33= new BufferedWriter(new FileWriter("Three_Student3.txt",true))) {
						Class33.write("\n" + academic+"\n\n");
						Class33.write("Name : Salman Agha \n");
						Class33.write("Roll Number: " + rollNumber+"\n");
						Class33.write("Class : Three \n");
						Class33.write("Marks in Urdu : " + marks1+"\n");
						Class33.write("Marks in English : " + marks2+"\n");
						Class33.write("Marks in Mathematics : " + marks3+"\n");
						Class33.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class33.write("Marks in Social Study : " + marks5+"\n");
						Class33.write("Marks in Islamiat : " + marks6+"\n");
						Class33.write("Total marks: " + totalMarks+"\n");
						Class33.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C3R3();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
			}
			else if(rollNumber.equals("4")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class34 = new BufferedWriter(new FileWriter("Three_Student4.txt",true))) {
						Class34.write("\n" + academic+"\n\n");
						Class34.write("Name : Shameem Noor \n");
						Class34.write("Roll Number: " + rollNumber+"\n");
						Class34.write("Class : Three \n");
						Class34.write("Marks in Urdu : " + marks1+"\n");
						Class34.write("Marks in English : " + marks2+"\n");
						Class34.write("Marks in Mathematics : " + marks3+"\n");
						Class34.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class34.write("Marks in Social Study : " + marks5+"\n");
						Class34.write("Marks in Islamiat : " + marks6+"\n");
						Class34.write("Total marks: " + totalMarks+"\n");
						Class34.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C3R4();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("5")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class35 = new BufferedWriter(new FileWriter("Three_Student5.txt",true))) {
						Class35.write("\n" + academic+"\n\n");
						Class35.write("Name : Bilal Raja \n");
						Class35.write("Roll Number: " + rollNumber+"\n");
						Class35.write("Class : Three \n");
						Class35.write("Marks in Urdu : " + marks1+"\n");
						Class35.write("Marks in English : " + marks2+"\n");
						Class35.write("Marks in Mathematics : " + marks3+"\n");
						Class35.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class35.write("Marks in Social Study : " + marks5+"\n");
						Class35.write("Marks in Islamiat : " + marks6+"\n");
						Class35.write("Total marks: " + totalMarks+"\n");
						Class35.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C3R5();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n ");
					Enter_Result();
				}
		}	
		else{
					System.out.println("Invalid Input\nRoll Number must be from 1-5 : Because you only have 5 student in your Class :-)\n\n ");
					Enter_Result();
				}
	}
	else if(s_class.equals("4")){
		System.out.println("Enter student roll number: ");
            String rollNumber = input.nextLine();
			System.out.println("");
			if(rollNumber.equals("1")){
				String academic="\n*** Academic Details ***\n";
				try{
					System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class41 = new BufferedWriter(new FileWriter("Four_Student1.txt",true))) {
						Class41.write("\n" + academic+"\n\n");
						Class41.write("Name : Shahid Iqbal\n");
						Class41.write("Roll Number: " + rollNumber+"\n");
						Class41.write("Class : Four \n");
						Class41.write("Marks in Urdu : " + marks1+"\n");
						Class41.write("Marks in English : " + marks2+"\n");
						Class41.write("Marks in Mathematics : " + marks3+"\n");
						Class41.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class41.write("Marks in Social Study : " + marks5+"\n");
						Class41.write("Marks in Islamiat : " + marks6+"\n");
						Class41.write("Total marks: " + totalMarks+"\n");
						Class41.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C4R1();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
			}	
			else if(rollNumber.equals("2")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class42 = new BufferedWriter(new FileWriter("Four_Student2.txt",true))) {
						Class42.write("\n" + academic+"\n\n");
						Class42.write("Name : Shan Khan \n");
						Class42.write("Roll Number: " + rollNumber+"\n");
						Class42.write("Class : Four \n");
						Class42.write("Marks in Urdu : " + marks1+"\n");
						Class42.write("Marks in English : " + marks2+"\n");
						Class42.write("Marks in Mathematics : " + marks3+"\n");
						Class42.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class42.write("Marks in Social Study : " + marks5+"\n");
						Class42.write("Marks in Islamiat : " + marks6+"\n");
						Class42.write("Total marks: " + totalMarks+"\n");
						Class42.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C4R2();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("3")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class43= new BufferedWriter(new FileWriter("Four_Student3.txt",true))) {
						Class43.write("\n" + academic+"\n\n");
						Class43.write("Name : Hammad Shafqat \n");
						Class43.write("Roll Number: " + rollNumber+"\n");
						Class43.write("Class : Four \n");
						Class43.write("Marks in Urdu : " + marks1+"\n");
						Class43.write("Marks in English : " + marks2+"\n");
						Class43.write("Marks in Mathematics : " + marks3+"\n");
						Class43.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class43.write("Marks in Social Study : " + marks5+"\n");
						Class43.write("Marks in Islamiat : " + marks6+"\n");
						Class43.write("Total marks: " + totalMarks+"\n");
						Class43.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C4R3();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
			}
			else if(rollNumber.equals("4")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class44 = new BufferedWriter(new FileWriter("Four_Student4.txt",true))) {
						Class44.write("\n" + academic+"\n\n");
						Class44.write("Name : Sadia Noor \n");
						Class44.write("Roll Number: " + rollNumber+"\n");
						Class44.write("Class : Four \n");
						Class44.write("Marks in Urdu : " + marks1+"\n");
						Class44.write("Marks in English : " + marks2+"\n");
						Class44.write("Marks in Mathematics : " + marks3+"\n");
						Class44.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class44.write("Marks in Social Study : " + marks5+"\n");
						Class44.write("Marks in Islamiat : " + marks6+"\n");
						Class44.write("Total marks: " + totalMarks+"\n");
						Class44.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C4R4();
				}catch(Exception e){
					System.out.println("");
					System.out.print("Wrong Input\nPlease Enter Integer Input for marks \n");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("5")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Tameer-A-Seerat  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater then 0 and less then 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class45 = new BufferedWriter(new FileWriter("Four_Student5.txt",true))) {
						Class45.write("\n" + academic+"\n\n");
						Class45.write("Name : Samia Sadaf \n");
						Class45.write("Roll Number: " + rollNumber+"\n");
						Class45.write("Class : Four \n");
						Class45.write("Marks in Urdu : " + marks1+"\n");
						Class45.write("Marks in English : " + marks2+"\n");
						Class45.write("Marks in Mathematics : " + marks3+"\n");
						Class45.write("Marks in Tameer-A-Seerat : " + marks4+"\n");
						Class45.write("Marks in Social Study : " + marks5+"\n");
						Class45.write("Marks in Islamiat : " + marks6+"\n");
						Class45.write("Total marks: " + totalMarks+"\n");
						Class45.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C4R5();
				}catch(Exception e){
					System.out.print("Wrong Input\nPlease Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
		}	
		else{
					System.out.println("Invalid Input\nRoll Number must be from 1-5 : Because you only have 5 student in your Class :-)\n ");
					Enter_Result();
				}
	}
	else if(s_class.equals("5")){
		System.out.println("Enter student roll number: ");
            String rollNumber = input.nextLine();
			System.out.println("");
			if(rollNumber.equals("1")){
				String academic="\n*** Academic Details ***\n";
				try{
					System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Science  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class51 = new BufferedWriter(new FileWriter("Five_Student1.txt",true))) {
						Class51.write("\n" + academic+"\n\n");
						Class51.write("Name : Farhan Khan");
						Class51.write("Roll Number: " + rollNumber+"\n");
						Class51.write("Class : Five \n");
						Class51.write("Marks in Urdu : " + marks1+"\n");
						Class51.write("Marks in English : " + marks2+"\n");
						Class51.write("Marks in Mathematics : " + marks3+"\n");
						Class51.write("Marks in Science : " + marks4+"\n");
						Class51.write("Marks in Social Study : " + marks5+"\n");
						Class51.write("Marks in Islamiat : " + marks6+"\n");
						Class51.write("Total marks: " + totalMarks+"\n");
						Class51.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C5R1();
				}catch(Exception e){
					System.out.print("Wrong Input  Please Enter Integer Input for marks ");
					Enter_Result();
				}
			}	
			else if(rollNumber.equals("2")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Science  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class52 = new BufferedWriter(new FileWriter("Five_Student2.txt",true))) {
						Class52.write("\n" + academic+"\n\n");
						Class52.write("Name : Sara Ali Khan \n");
						Class52.write("Roll Number: " + rollNumber+"\n");
						Class52.write("Class : Five \n");
						Class52.write("Marks in Urdu : " + marks1+"\n");
						Class52.write("Marks in English : " + marks2+"\n");
						Class52.write("Marks in Mathematics : " + marks3+"\n");
						Class52.write("Marks in Science : " + marks4+"\n");
						Class52.write("Marks in Social Study : " + marks5+"\n");
						Class52.write("Marks in Islamiat : " + marks6+"\n");
						Class52.write("Total marks: " + totalMarks+"\n");
						Class52.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C5R2();
				}catch(Exception e){
					System.out.print("Wrong Input  Please Enter Integer Input for marks ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("3")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Science  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class53= new BufferedWriter(new FileWriter("Five_Student3.txt",true))) {
						Class53.write("\n" + academic+"\n\n");
						Class53.write("Name : Umer Shafqat \n");
						Class53.write("Roll Number: " + rollNumber+"\n");
						Class53.write("Class : Five \n");
						Class53.write("Marks in Urdu : " + marks1+"\n");
						Class53.write("Marks in English : " + marks2+"\n");
						Class53.write("Marks in Mathematics : " + marks3+"\n");
						Class53.write("Marks in Science : " + marks4+"\n");
						Class53.write("Marks in Social Study : " + marks5+"\n");
						Class53.write("Marks in Islamiat : " + marks6+"\n");
						Class53.write("Total marks: " + totalMarks+"\n");
						Class53.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C5R3();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
			}
			else if(rollNumber.equals("4")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Science  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class54 = new BufferedWriter(new FileWriter("Five_Student4.txt",true))) {
						Class54.write("\n" + academic+"\n\n");
						Class54.write("Class : Five \n");
						Class54.write("Roll Number: " + rollNumber+"\n");
						Class54.write("Marks in Urdu : " + marks1+"\n");
						Class54.write("Marks in English : " + marks2+"\n");
						Class54.write("Marks in Mathematics : " + marks3+"\n");
						Class54.write("Marks in Science : " + marks4+"\n");
						Class54.write("Marks in Social Study : " + marks5+"\n");
						Class54.write("Marks in Islamiat : " + marks6+"\n");
						Class54.write("Total marks: " + totalMarks+"\n");
						Class54.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C5R4();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
				
			}
			else if(rollNumber.equals("5")){
				String academic="\n*** Academic Details ***\n";
				try{
				System.out.println("Please enter  Urdu Marks out of 100 ");
				double marks1=input.nextDouble();
				if(marks1>100||marks1<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  English Marks out of 100 ");
				double marks2=input.nextDouble();
				if(marks2>100||marks2<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Mathematics  Marks out of 100 ");
				double marks3=input.nextDouble();
				if(marks3>100||marks3<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Science  Marks out of 100 ");
				double marks4=input.nextDouble();
				if(marks4>100||marks4<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				System.out.println("Please enter  Social Study  Marks out of 100 ");
				double marks5=input.nextDouble();
				if(marks5>100||marks5<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100 ");
					Enter_Result();
				}
				System.out.println("Please enter  Islamiat  Marks out of 100 ");
				double marks6=input.nextDouble();
				if(marks6>100||marks6<0){
					System.out.println("Wrong Input\nMarks must be greater than 0 or less than 100\n ");
					Enter_Result();
				}
				double totalMarks=marks1+marks2+marks3+marks4+marks5+marks6;
				double percentage=(totalMarks*100)/600;
				try (
						BufferedWriter Class55 = new BufferedWriter(new FileWriter("Five_Student5.txt",true))) {
						Class55.write("\n" + academic+"\n\n");
						Class55.write("Class : Five \n");
						Class55.write("Roll Number: " + rollNumber+"\n");
						Class55.write("Marks in Urdu : " + marks1+"\n");
						Class55.write("Marks in English : " + marks2+"\n");
						Class55.write("Marks in Mathematics : " + marks3+"\n");
						Class55.write("Marks in Science : " + marks4+"\n");
						Class55.write("Marks in Social Study : " + marks5+"\n");
						Class55.write("Marks in Islamiat : " + marks6+"\n");
						Class55.write("Total marks: " + totalMarks+"\n");
						Class55.write("Percentage: " + percentage+"\n");
				} catch (IOException e) {
				e.printStackTrace();
				}
				String temp=input.nextLine();
				C5R5();
				}catch(Exception e){
					System.out.print("\nWrong Input  Please Enter Integer Input for marks\n\n ");
					Enter_Result();
				}
		}	
		else{
					System.out.println("Invalid Input\nRoll Number must be from 1-5 : Because you only have 5 student in your Class :-) ");
					Enter_Result();
				}
	}
	else{
		System.out.println("\nInvalid Input\nThis is primary School So please enter class from 0-5 (0 for Nursery ) :-) ");
		Enter_Result();
	}
	}
	public static void AttendenceS(){//This methos select the class by  no and show his attendence
		System.out.println("Please select the class :\n");
        System.out.println("Enter 0 for for Class Nursery  :");
        System.out.println("Enter 1 for for First Class  :");
        System.out.println("Enter 2 for for Secound Class  :");
        System.out.println("Enter 3 for for Third Class  :");
        System.out.println("Enter 4 for for Fourth Class  :");
        System.out.println("Enter 5 for for Fiveth Class  :");
		System.out.println("Press 00 for main menu  :");
		String sel_class=input.nextLine();
		if(sel_class.equals("0"))
			Nursery_AttenFile();
		else if(sel_class.equals("00"))
			main_menuS();
		else if(sel_class.equals("1"))
			F_Atten_Show();
		else if(sel_class.equals("2"))
			S_Atten_Show();
		else if(sel_class.equals("3"))
			T_Atten_Show();
		else if(sel_class.equals("4"))
			Fo_Atten_Show();
		else if(sel_class.equals("5"))
			Fi_Atten_Show();
		else{
			System.out.println("\nInvalid Input : Please Enter vlid Input to continue :-)");
			AttendenceS();
		}
	}
	public static void CourcesT(){///This method is used to select the class to show or odify their courses
		System.out.println("Please select the class :\n");
        System.out.println("Enter 0 for Class Nursery  :");
        System.out.println("Enter 1 for First Class  :");
        System.out.println("Enter 2 for Secound Class  :");
        System.out.println("Enter 3 for Third Class  :");
        System.out.println("Enter 4 for Fourth Class  :");
        System.out.println("Enter 5 for Fiveth Class  :");
		System.out.println("Enter 00 for Main Memu  :");
		String sel_class=input.nextLine();
		if(sel_class.equals("0"))
			Mo_Course_Nur();
		if(sel_class.equals("00"))
			main_menu();
		else if(sel_class.equals("1"))
			Mo_Course_One();
		else if(sel_class.equals("2"))
			Mo_Course_Two();
		else if(sel_class.equals("3"))
			Mo_Course_Three();
		else if(sel_class.equals("4"))
			Mo_Course_Four();
		else if(sel_class.equals("5"))
			Mo_Course_Five();
		else{
			System.out.println("\nInvalid Input : Please Enter valid Input to continue :-)");
			CourcesT();
		}
	}
	public static void Mo_Course_Nur(){//This method is used to show the courses of nursery also the user can modify them
		String course1,course2,course3;
		System.out.println("\n*** Class Nursery ***\n");
		System.out.println("Press 0 to show course of Class  : ");
		System.out.println("Press 1 to modify course : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Course_Nur();
		else if(checks.equals("1")){
		try{
			File co_nur=new File("Course_Nur.txt");
			FileWriter mo_nur=new FileWriter(co_nur);
			mo_nur.write("\n*** Class Nursery Course ***\n\n");
			System.out.println("\nNursery class can maximum three courses : ");
			System.out.println("Enter your first course : ");
			while(true){
			course1=input.nextLine();
			if(course1.matches("[a-zA-z ]+")){
				if(course1.length()>3&&course1.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your secound course : ");
			while(true){
			course2=input.nextLine();
			if(course2.matches("[a-zA-z ]+")){
				if(course2.length()>3&&course2.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your third course : ");
			while(true){
			course3=input.nextLine();
			if(course3.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		mo_nur.write("1- "+course1+"\n");
		mo_nur.write("2- "+course2+"\n");
		mo_nur.write("3- "+course3+"\n");
		mo_nur.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Course_Nur();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Mo_Course_Nur();
		}
	}
	public static void Mo_Course_One(){//This method is used to show the courses of class one also the user can modify them
		String course1,course2,course3,course4;
		System.out.println("\n*** Class One ***\n");
		System.out.println("Press 0 to show course of Class  : ");
		System.out.println("Press 1 to modify course : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Course_One();
		else if(checks.equals("1")){
		try{
			File co_one=new File("Course_One.txt");
			FileWriter mo_one=new FileWriter(co_one);
			mo_one.write("\n*** Class One Course ***\n\n");
			System.out.println("\nClass One can maximum four courses : ");
			System.out.println("Enter your first course : ");
			while(true){
			course1=input.nextLine();
			if(course1.matches("[a-zA-z ]+")){
				if(course1.length()>3&&course1.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your secound course : ");
			while(true){
			course2=input.nextLine();
			if(course2.matches("[a-zA-z ]+")){
				if(course2.length()>3&&course2.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your third course : ");
			while(true){
			course3=input.nextLine();
			if(course3.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fourth course : ");
			while(true){
			course4=input.nextLine();
			if(course4.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		mo_one.write("1- "+course1+"\n");
		mo_one.write("2- "+course2+"\n");
		mo_one.write("3- "+course3+"\n");
		mo_one.write("4- "+course4+"\n");
		mo_one.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Course_One();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Mo_Course_One();
		}
	}
	public static void Mo_Course_Two(){//This method is used to show the courses of class two also the user can modify them
		String course1,course2,course3,course4,course5,course6;
		System.out.println("\n*** Class Two ***\n");
		System.out.println("Press 0 to show course of Class  : ");
		System.out.println("Press 1 to modify course : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Course_Two();
		else if(checks.equals("1")){
		try{
			File co_two=new File("Course_Two.txt");
			FileWriter mo_two=new FileWriter(co_two);
			mo_two.write("\n*** Class Two Course ***\n\n");
			System.out.println("\nClass Two can maximum six courses : ");
			System.out.println("Enter your first course : ");
			while(true){
			course1=input.nextLine();
			if(course1.matches("[a-zA-z ]+")){
				if(course1.length()>3&&course1.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your secound course : ");
			while(true){
			course2=input.nextLine();
			if(course2.matches("[a-zA-z ]+")){
				if(course2.length()>3&&course2.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your third course : ");
			while(true){
			course3=input.nextLine();
			if(course3.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fourth course : ");
			while(true){
			course4=input.nextLine();
			if(course4.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fifth course : ");
			while(true){
			course5=input.nextLine();
			if(course5.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your sixth course : ");
			while(true){
			course6=input.nextLine();
			if(course6.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		mo_two.write("1- "+course1+"\n");
		mo_two.write("2- "+course2+"\n");
		mo_two.write("3- "+course3+"\n");
		mo_two.write("4- "+course4+"\n");
		mo_two.write("5- "+course5+"\n");
		mo_two.write("6- "+course6+"\n");
		mo_two.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Course_Two();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Mo_Course_Two();
		}
	}
	public static void Mo_Course_Three(){//This method is used to show the courses of class three also the user can modify them
		String course1,course2,course3,course4,course5,course6;
		System.out.println("\n*** Class Three ***\n");
		System.out.println("Press 0 to show course of Class  : ");
		System.out.println("Press 1 to modify course : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Course_Three();
		else if(checks.equals("1")){
		try{
			File co_three=new File("Course_Three.txt");
			FileWriter mo_three=new FileWriter(co_three);
			mo_three.write("\n*** Class Three Course ***\n\n");
			System.out.println("\nClass Two can maximum six courses : ");
			System.out.println("Enter your first course : ");
			while(true){
			course1=input.nextLine();
			if(course1.matches("[a-zA-z ]+")){
				if(course1.length()>3&&course1.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your secound course : ");
			while(true){
			course2=input.nextLine();
			if(course2.matches("[a-zA-z ]+")){
				if(course2.length()>3&&course2.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your third course : ");
			while(true){
			course3=input.nextLine();
			if(course3.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fourth course : ");
			while(true){
			course4=input.nextLine();
			if(course4.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fifth course : ");
			while(true){
			course5=input.nextLine();
			if(course5.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your sixth course : ");
			while(true){
			course6=input.nextLine();
			if(course6.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		mo_three.write("1- "+course1+"\n");
		mo_three.write("2- "+course2+"\n");
		mo_three.write("3- "+course3+"\n");
		mo_three.write("4- "+course4+"\n");
		mo_three.write("5- "+course5+"\n");
		mo_three.write("6- "+course6+"\n");
		mo_three.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Course_Three();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Mo_Course_Three();
		}
	}
	public static void Mo_Course_Four(){//This method is used to show the courses of class four also the user can modify them
		String course1,course2,course3,course4,course5,course6;
		System.out.println("\n*** Class Four ***\n");
		System.out.println("Press 0 to show course of Class  : ");
		System.out.println("Press 1 to modify course : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Course_Four();
		else if(checks.equals("1")){
		try{
			File co_four=new File("Course_Four.txt");
			FileWriter mo_four=new FileWriter(co_four);
			mo_four.write("\n*** Class Four Course ***\n\n");
			System.out.println("\nClass Two can maximum six courses : ");
			System.out.println("Enter your first course : ");
			while(true){
			course1=input.nextLine();
			if(course1.matches("[a-zA-z ]+")){
				if(course1.length()>3&&course1.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your secound course : ");
			while(true){
			course2=input.nextLine();
			if(course2.matches("[a-zA-z ]+")){
				if(course2.length()>3&&course2.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your third course : ");
			while(true){
			course3=input.nextLine();
			if(course3.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fourth course : ");
			while(true){
			course4=input.nextLine();
			if(course4.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fifth course : ");
			while(true){
			course5=input.nextLine();
			if(course5.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your sixth course : ");
			while(true){
			course6=input.nextLine();
			if(course6.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		mo_four.write("1- "+course1+"\n");
		mo_four.write("2- "+course2+"\n");
		mo_four.write("3- "+course3+"\n");
		mo_four.write("4- "+course4+"\n");
		mo_four.write("5- "+course5+"\n");
		mo_four.write("6- "+course6+"\n");
		mo_four.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Course_Four();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Mo_Course_Four();
		}
	}
	public static void Mo_Course_Five(){//This method is used to show the courses of class five also the user can modify them
		String course1,course2,course3,course4,course5,course6;
		System.out.println("\n*** Class Five ***\n");
		System.out.println("Press 0 to show course of Class  : ");
		System.out.println("Press 1 to modify course : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Course_Five();
		else if(checks.equals("1")){
		try{
			File co_five=new File("Course_Five.txt");
			FileWriter mo_five=new FileWriter(co_five);
			mo_five.write("\n*** Class Five Course ***\n\n");
			System.out.println("\nClass Two can maximum six courses : ");
			System.out.println("Enter your first course : ");
			while(true){
			course1=input.nextLine();
			if(course1.matches("[a-zA-z ]+")){
				if(course1.length()>3&&course1.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your secound course : ");
			while(true){
			course2=input.nextLine();
			if(course2.matches("[a-zA-z ]+")){
				if(course2.length()>3&&course2.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your third course : ");
			while(true){
			course3=input.nextLine();
			if(course3.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fourth course : ");
			while(true){
			course4=input.nextLine();
			if(course4.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your fifth course : ");
			while(true){
			course5=input.nextLine();
			if(course5.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		System.out.println("Enter your sixth course : ");
			while(true){
			course6=input.nextLine();
			if(course6.matches("[a-zA-z ]+")){
				if(course3.length()>3&&course3.length()<15)
					break;
				else 
					System.out.println("Wrong input : Book name must be greater than 3 and less than 15 characters :-) ");
			}	
			else
				System.out.println("Wrong input : Please enter correct book name :-) ");
		}
		mo_five.write("1- "+course1+"\n");
		mo_five.write("2- "+course2+"\n");
		mo_five.write("3- "+course3+"\n");
		mo_five.write("4- "+course4+"\n");
		mo_five.write("5- "+course5+"\n");
		mo_five.write("6- "+course6+"\n");
		mo_five.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Course_Five();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Mo_Course_Five();
		}
	}
	public static void Cources(){//This method select the class and call that specific method to either mark oe show attendance
		System.out.println("Please select the class :\n");
        System.out.println("Enter 0 for Class Nursery  :");
        System.out.println("Enter 1 for First Class  :");
        System.out.println("Enter 2 for Secound Class  :");
        System.out.println("Enter 3 for Third Class  :");
        System.out.println("Enter 4 for Fourth Class  :");
        System.out.println("Enter 5 for Fiveth Class  :");
		String sel_class=input.nextLine();
		if(sel_class.equals("0"))
			Course_Nur();
		else if(sel_class.equals("1"))
			Course_One();
		else if(sel_class.equals("2"))
			Course_Two();
		else if(sel_class.equals("3"))
			Course_Three();
		else if(sel_class.equals("4"))
			Course_Four();
		else if(sel_class.equals("5"))
			Course_Five();
		else{
			System.out.println("\nInvalid Input : Please Enter valid Input to continue :-)");
			Cources();
		}
	}
	public static void Course_Nur(){//This method show the nursery class attendence file also we can go to the main menu through this method
        try{
            FileReader course= new FileReader("Course_Nur.txt");
            try{
                int i;
                while((i=course.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                course.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }	
	public static void Course_One(){//This method show the  class One attendence file also we can go to the main menu through this method
        try{
            FileReader courseOne= new FileReader("Course_One.txt");
            try{
                int i;
                while((i=courseOne.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                courseOne.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Course_Two(){//This method show the  class Two attendence file also we can go to the main menu through this method
        try{
            FileReader courseTwo= new FileReader("Course_Two.txt");
            try{
                int i;
                while((i=courseTwo.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                courseTwo.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Course_Three(){//This method show the  class three attendence file also we can go to the main menu through this method
        try{
            FileReader courseThree= new FileReader("Course_Three.txt");
            try{
                int i;
                while((i=courseThree.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                courseThree.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Course_Four(){//This method show the class four attendence file also we can go to the main menu through this method
        try{
            FileReader courseFour= new FileReader("Course_Four.txt");
            try{
                int i;
                while((i=courseFour.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                courseFour.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Course_Five(){//This method show the class five attendence file also we can go to the main menu through this method
        try{
            FileReader courseFive= new FileReader("Course_Five.txt");
            try{
                int i;
                while((i=courseFive.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                courseFive.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other number for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Attendence(){//This method is used to select class to call a method to either mark class attendence or show attendence
		System.out.println("Please select the class :\n");
        System.out.println("Enter 0 for for Class Nursery  :");
        System.out.println("Enter 1 for for First Class  :");
        System.out.println("Enter 2 for for Secound Class  :");
        System.out.println("Enter 3 for for Third Class  :");
        System.out.println("Enter 4 for for Fourth Class  :");
        System.out.println("Enter 5 for for Fiveth Class  :");
		System.out.println("Press 00 for main menu  :");
		String sel_class=input.nextLine();
		if(sel_class.equals("0"))
			Atten_Nur();
		else if(sel_class.equals("00"))
			main_menu();
		else if(sel_class.equals("1"))
			First_Atten();
		else if(sel_class.equals("2"))
			Seco_Atten();
		else if(sel_class.equals("3"))
			Third_Atten();
		else if(sel_class.equals("4"))
			Four_Atten();
		else if(sel_class.equals("5"))
			Five_Atten();
		else{
			System.out.println("\nInvalid Input : Please Enter valid Input to continue :-)");
			Attendence();
		}
	}
	public static void Atten_Nur(){//This method mark the nursery class attentence and save that in file also we can check previous attendence
		System.out.println("\n*** Class Nursery ***\n");
		System.out.println("Press 0 previous Attendence of Class  : ");
		System.out.println("Press 1 to mark Attendence : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Nursery_AttenFile();
		else if(checks.equals("1")){
		String[] nur_std={"Saim Ali","Saad Raza","Sara Khan","Zoya Ali","Bilawal Ajaib"};
		int[] rol_nur={1,2,3,4,5};
		String[] atten_nur=new String[5];
		String First_Line="Roll No.  Name\t\tAttendence";
		String className="*** Class Nursery ***";
		System.out.println(className);
		int i=0;
		while(i<rol_nur.length){
			System.out.print(rol_nur[i]+"  "+nur_std[i]+"  press 1 for present and 0 for absent : ");
			String mark_att=input.nextLine();
			if(mark_att.equals("1"))
				atten_nur[i]="Present";
			else if(mark_att.equals("0"))
				atten_nur[i]="Absent";
			else{
				System.out.println("Wrong Input : Please only select 0 and 1 ");
				continue;
			}
			i++;
		}
		try{
			File nurr=new File("Nur_Att.txt");
			nurr.createNewFile();
			PrintWriter nur_Atten=new PrintWriter(nurr);
			nur_Atten.println("");
			nur_Atten.println(className+"\n");
			nur_Atten.println(First_Line);
			for(int k=0;k<rol_nur.length;k++)
				nur_Atten.write(rol_nur[k]+"\t  "+nur_std[k]+"\t "+atten_nur[k]+"\n");
			nur_Atten.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Nursery_AttenFile();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Atten_Nur();
		}
	}
	public static void Nursery_AttenFile(){//This method shows nursery class attendence by reading that file
        try{
            FileReader data_readA= new FileReader("Nur_Att.txt");
            try{
                int i;
                while((i=data_readA.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readA.close();
            }
        }
        catch(Exception ex){
            System.out.println("No Attendence Found ");
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other key for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void First_Atten(){//This method mark the class one attentence and save that in file also we can check previous attendence
		System.out.println("\n*** Class One ***\n");
		System.out.println("Press 0 previous Attendence of Class  : ");
		System.out.println("Press 1 to mark Attendence : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			F_Atten_Show();
		else if(checks.equals("1")){
		String[] nur_std={"Saram Khan","Azan Rashid","Umer Ramzan","Hijab Azhar","Sania Shahzad"};
		int[] rol_nur={1,2,3,4,5};
		String[] atten_nur=new String[5];
		String First_Line="Roll No.  Name\t\tAttendence";
		String className="*** Class One ***";
		System.out.println(className);
		int i=0;
		while(i<rol_nur.length){
			System.out.print(rol_nur[i]+"  "+nur_std[i]+"  press 1 for present and 0 for absent : ");
			String mark_att=input.nextLine();
			if(mark_att.equals("1"))
				atten_nur[i]="Present";
			else if(mark_att.equals("0"))
				atten_nur[i]="Absent";
			else{
				System.out.println("Wrong Input : Please only select 0 and 1 ");
				continue;
			}
			i++;
		}
		try{
			File first=new File("First_Attendence.txt");
			first.createNewFile();
			PrintWriter first_Atten=new PrintWriter(first);
			first_Atten.println("");
			first_Atten.println(className+"\n");
			first_Atten.println(First_Line);
			for(int k=0;k<rol_nur.length;k++)
				first_Atten.write(rol_nur[k]+"\t  "+nur_std[k]+"\t "+atten_nur[k]+"\n");
			first_Atten.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		F_Atten_Show();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			First_Atten();
		}
	}
	public static void F_Atten_Show(){//This method show the class first attendence by reading that file
        try{
            FileReader data_readB= new FileReader("First_Attendence.txt");
            try{
                int i;
                while((i=data_readB.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readB.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
			System.out.println("No Attendence Found ");
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other key for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Seco_Atten(){//This method mark the class two attentence and save that in file also we can check previous attendence
		System.out.println("\n*** Class Two ***\n");
		System.out.println("Press 0 previous Attendence of Class  : ");
		System.out.println("Press 1 to mark Attendence : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			S_Atten_Show();
		else if(checks.equals("1")){
		String[] nur_std={"Muhammad Ali","Hamza Shafique","Salman Agha","Shamila Parveen","Ahmen Khan"};
		int[] rol_nur={1,2,3,4,5};
		String[] atten_nur=new String[5];
		String First_Line="Roll No.  Name\t\tAttendence";
		String className="*** Class Two ***";
		System.out.println(className);
		int i=0;
		while(i<rol_nur.length){
			System.out.print(rol_nur[i]+"  "+nur_std[i]+"  press 1 for present and 0 for absent : ");
			String mark_att=input.nextLine();
			if(mark_att.equals("1"))
				atten_nur[i]="Present";
			else if(mark_att.equals("0"))
				atten_nur[i]="Absent";
			else{
				System.out.println("Wrong Input : Please only select 0 and 1 ");
				continue;
			}
			i++;
		}
		try{
			File secound=new File("Secound_Attendence.txt");
			secound.createNewFile();
			PrintWriter secound_Atten=new PrintWriter(secound);
			secound_Atten.println("");
			secound_Atten.println(className+"\n");
			secound_Atten.println(First_Line);
			for(int k=0;k<rol_nur.length;k++)
				secound_Atten.write(rol_nur[k]+"\t  "+nur_std[k]+"\t "+atten_nur[k]+"\n");
			secound_Atten.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		S_Atten_Show();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Seco_Atten();
		}
	}
	public static void S_Atten_Show(){//This method show the class two attendence by reading that file
        try{
            FileReader data_readC= new FileReader("Secound_Attendence.txt");
            try{
                int i;
                while((i=data_readC.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readC.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
			System.out.println("No Attendence Found ");
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other key for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Third_Atten(){//This method mark the class three attentence and save that in file also we can check previous attendence
		Scanner input=new Scanner(System.in);
		System.out.println("\n*** Class Three ***\n");
		System.out.println("Press 0 previous Attendence of Class  : ");
		System.out.println("Press 1 to mark Attendence : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			T_Atten_Show();
		else if(checks.equals("1")){
		String[] nur_std={"Khan Muhammad","Babar Azam","Salman Agha","Shameem Noor","Bilal Raja"};
		int[] rol_nur={1,2,3,4,5};
		String[] atten_nur=new String[5];
		String First_Line="Roll No.  Name\t\tAttendence";
		String className="*** Class Three ***";
		System.out.println(className);
		int i=0;
		while(i<rol_nur.length){
			System.out.print(rol_nur[i]+"  "+nur_std[i]+"  press 1 for present and 0 for absent : ");
			String mark_att=input.nextLine();
			if(mark_att.equals("1"))
				atten_nur[i]="Present";
			else if(mark_att.equals("0"))
				atten_nur[i]="Absent";
			else{
				System.out.println("Wrong Input : Please only select 0 and 1 ");
				continue;
			}
			i++;
		}
		try{
			File third=new File("Third_Attendence.txt");
			third.createNewFile();
			PrintWriter third_Atten=new PrintWriter(third);
			third_Atten.println("");
			third_Atten.println(className+"\n");
			third_Atten.println(First_Line);
			for(int k=0;k<rol_nur.length;k++)
				third_Atten.write(rol_nur[k]+"\t  "+nur_std[k]+"\t "+atten_nur[k]+"\n");
			third_Atten.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		T_Atten_Show();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Third_Atten();
		}
	}
	public static void T_Atten_Show(){//This method show the class three attendence by reading that file
        try{
            FileReader data_readD= new FileReader("Third_Attendence.txt");
            try{
                int i;
                while((i=data_readD.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readD.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
			System.out.println("No Attendence Found ");
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other key for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Four_Atten(){//This method mark the class four attentence and save that in file also we can check previous attendence
		Scanner input=new Scanner(System.in);
		System.out.println("\n*** Class Four ***\n");
		System.out.println("Press 0 previous Attendence of Class  : ");
		System.out.println("Press 1 to mark Attendence : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Fo_Atten_Show();
		else if(checks.equals("1")){
		String[] nur_std={"Shahid Iqbal","Shan Khan","Asad Ali","Sadia Noor","Samia Sadaf"};
		int[] rol_nur={1,2,3,4,5};
		String[] atten_nur=new String[5];
		String First_Line="Roll No.  Name\t\tAttendence";
		String className="*** Class Four ***";
		System.out.println(className);
		int i=0;
		while(i<rol_nur.length){
			System.out.print(rol_nur[i]+"  "+nur_std[i]+"  press 1 for present and 0 for absent : ");
			String mark_att=input.nextLine();
			if(mark_att.equals("1"))
				atten_nur[i]="Present";
			else if(mark_att.equals("0"))
				atten_nur[i]="Absent";
			else{
				System.out.println("Wrong Input : Please only select 0 and 1 ");
				continue;
			}
			i++;
		}
		try{
			File four=new File("Four_Attendence.txt");
			four.createNewFile();
			PrintWriter four_Atten=new PrintWriter(four);
			four_Atten.println("");
			four_Atten.println(className+"\n");
			four_Atten.println(First_Line);
			for(int k=0;k<rol_nur.length;k++)
				four_Atten.write(rol_nur[k]+"\t  "+nur_std[k]+"\t "+atten_nur[k]+"\n");
			four_Atten.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Fo_Atten_Show();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Four_Atten();
		}
	}
	public static void Fo_Atten_Show(){//This method show the class four attendence by reading that file
        try{
            FileReader data_readE= new FileReader("Four_Attendence.txt");
            try{
                int i;
                while((i=data_readE.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readE.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
			System.out.println("No Attendence Found ");
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other key for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
	public static void Five_Atten(){//This method mark the class five attentence and save that in file also we can check previous attendence
		System.out.println("\n*** Class Five ***\n");
		System.out.println("Press 0 previous Attendence of Class  : ");
		System.out.println("Press 1 to mark Attendence : ");
		String checks=input.nextLine();
		if(checks.equals("0"))
			Fi_Atten_Show();
		else if(checks.equals("1")){
		String[] nur_std={"Farhan Khan","Sara Ali Khan","Umer Shafqat","Shabnum Atiq","Aliza Shah"};
		int[] rol_nur={1,2,3,4,5};
		String[] atten_nur=new String[5];
		String First_Line="Roll No.  Name\t\tAttendence";
		String className="*** Class Five ***";
		System.out.println(className);
		int i=0;
		while(i<rol_nur.length){
			System.out.print(rol_nur[i]+"  "+nur_std[i]+"  press 1 for present and 0 for absent : ");
			String mark_att=input.nextLine();
			if(mark_att.equals("1"))
				atten_nur[i]="Present";
			else if(mark_att.equals("0"))
				atten_nur[i]="Absent";
			else{
				System.out.println("Wrong Input : Please only select 0 and 1 ");
				continue;
			}
			i++;
		}
		try{
			File five=new File("Five_Attendence.txt");
			five.createNewFile();
			PrintWriter five_Atten=new PrintWriter(five);
			five_Atten.println("");
			five_Atten.println(className+"\n");
			five_Atten.println(First_Line);
			for(int k=0;k<rol_nur.length;k++)
				five_Atten.write(rol_nur[k]+"\t  "+nur_std[k]+"\t "+atten_nur[k]+"\n");
			five_Atten.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		Fi_Atten_Show();
		}else{
			System.out.println("Invalid Input : Please Enter correct input \n");
			Five_Atten();
		}
	}
	public static void Fi_Atten_Show(){//This method show the class five attendence by reading that file
        try{
            FileReader data_readF= new FileReader("Five_Attendence.txt");
            try{
                int i;
                while((i=data_readF.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readF.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
			System.out.println("No Attendence Found ");
        }
        System.out.println("\n\nPress enter your password to return to main menu\nOR\nPress any other key for terminate program : ");
		String select2=input.nextLine();
		if(select2.equals("12345"))
			main_menu();
		else if(select2.equals("0000"))
			main_menuS();
		else
			System.out.println("\nProgram Terminated");
    }
    public static void New_Admission() {//This method is used to add new studennt by geting info from user also save that info in file and display for user
        String name, fatherName, className, rollNo, gender, regNo, contactNumber, address;
		System.out.println("Press 1 to show previously add student : ");
		System.out.println("Press 2 to add new student : ");
		String sel_opt=input.nextLine();
		if(sel_opt.equals("1"))
			Show_New_Std();
		else if(sel_opt.equals("2")){
        System.out.print("Enter Student Name: ");
		while(true){
			name = input.nextLine();
			if(name.matches("[a-zA-z ]+"))
				break;
			else
				System.out.println("Wrong input : Please enter correct name :-) ");
		}
        System.out.print("Enter Father's Name: ");
		while(true){
			fatherName = input.nextLine();
			if(fatherName.matches("[a-zA-z ]+"))
				break;
			else
				System.out.println("Wrong input : Please enter correct name :-) ");
		}
        System.out.print("Enter Class: ");
		while(true){
			className = input.nextLine();
			if(className.equals("Nursery")||className.equals("Prep")||className.equals("One")||className.equals("Two")||className.equals("Three")||className.equals("Four")||className.equals("Five"))
				break;
			else
				System.out.println("Wrong input : Only ( Nursery,Prep,One,Two,Three,Four and Five ) are valid classes :-) ");
		}
        System.out.print("Enter roll number: ");
			while(true){
			rollNo = input.nextLine();
			if(rollNo.matches("[0-9]+"))
				break;
			else
				System.out.println("Wrong input : Please enter Roll Number from 0-10  :-) ");
		}
        System.out.print("Enter registration number: ");
        regNo = input.nextLine();
		System.out.print("Enter Gender : ");
		while(true){
			gender = input.nextLine();
			if(gender.equals("Male")||gender.equals("Female")||gender.equals("Custom"))
				break;
			else
				System.out.println("Wrong input : Only ( Male, Female & Custom ) are valid genders :-) ");
		}
        System.out.print("Enter contact number: ");
		while(true){
			contactNumber = input.nextLine();
			if(contactNumber.matches("[0-9 ]+")){
				if(contactNumber.length()<12)
					break;
				else
					System.out.println("Wrong input : Please enter correct name :-) ");	
			}	
			else
				System.out.println("Wrong input : Please enter correct name :-) ");
		}
        System.out.print("Enter address: ");
        address = input.nextLine();
        try {
            File file = new File("New_students.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("*** Personal Details ***\n\n");
            bw.write("Name : "+name+"\n");
			bw.write("Father Name : "+fatherName+"\n");
			bw.write("Class : "+className+"\n");
			bw.write("Roll No. : "+rollNo+"\n");
			bw.write("Registration Number  : "+regNo+"\n");
			bw.write("Gender  : "+gender+"\n");
			bw.write("Contact Number : "+contactNumber+"\n");
			bw.write("Address : "+address+"\n");
            bw.close();
            System.out.println("Student added to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
		Show_New_Std();
		}
		else{
			System.out.println("\nInvalid Input : Please enter valid Input to continue.\n");
			New_Admission();
		}
    }
	public static void Show_New_Std(){//This method show new students added by reading their file
        try{
            FileReader data_readNS= new FileReader("New_students.txt");
            try{
                int i;
                while((i=data_readNS.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                data_readNS.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\nPress 1 for main menu \nPress 2 for return Add New Student\nPress any other key for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
		else if(repeat.equals("2"))
			New_Admission();
    }
	public static void Delete_Student(){//This method is used to selsect class by calling that class method to delete specifice student
        System.out.println("Please select the class :\n");
        System.out.println("Enter 0 for for Class Nursery  :");
        System.out.println("Enter 1 for for First Class  :");
        System.out.println("Enter 2 for for Secound Class  :");
        System.out.println("Enter 3 for for Third Class  :");
        System.out.println("Enter 4 for for Fourth Class  :");
        System.out.println("Enter 5 for for Fiveth Class  :");
		String select_class=input.nextLine();
        if(select_class.equals("0"))
            Class_NurDel();
        else if(select_class.equals("1"))
            Class_OneDel();
        else if(select_class.equals("2"))
            Class_TwoDel();
        else if(select_class.equals("3"))
            Class_ThreeDel();
        else if(select_class.equals("4"))
            Class_FourDel();
        else if(select_class.equals("5"))
            Class_FiveDel();
        else{
            System.out.println("Invalid choice !\nPlease Enter a valid choice to continue :");
            Delete_Student();
           }
    }
	public static void Class_NurDel(){//This method gets the roll no of nursery class student to delete that student
        System.out.println("\n*** Class Nursery ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
            String roll=input.nextLine();
            if(roll.equals(roll_no[0])){
				try{
					File ns1d=new File("Nur_Student1.txt");
					if (ns1d.delete()) { 
						System.out.println("Deleted the file: " + ns1d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[1])){
				try{
					File ns2d=new File("Nur_Student2.txt");
					if (ns2d.delete()) { 
						System.out.println("Deleted the file: " + ns2d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[2])){
				try{
					File ns3d=new File("Nur_Student3.txt");
					if (ns3d.delete()) { 
						System.out.println("Deleted the file: " + ns3d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[3])){
				try{
					File ns4d=new File("Nur_Student4.txt");
					if (ns4d.delete()) { 
						System.out.println("Deleted the file: " + ns4d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[4])){
				try{
					File ns5d=new File("Nur_Student5.txt");
					if (ns5d.delete()) { 
						System.out.println("Deleted the file: " + ns5d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Invalid choice !\nPlease enter roll no from 1-5 ");
				Class_NurDel();
			}
		System.out.println("Student Record Deleted Successfully\nPress 1 for return to main menu and any other number for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
    }
	public static void Class_OneDel(){//This method gets the roll no of  class one student to delete that student
        System.out.println("\n*** Class One ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
            String roll=input.nextLine();
            if(roll.equals(roll_no[0])){
				try{
					File fs1d=new File("One_Student1.txt");
					if (fs1d.delete()) { 
						System.out.println("Deleted the file: " + fs1d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[1])){
				try{
					File fs2d=new File("One_Student2.txt");
					if (fs2d.delete()) { 
						System.out.println("Deleted the file: " + fs2d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[2])){
				try{
					File fs3d=new File("One_Student3.txt");
					if (fs3d.delete()) { 
						System.out.println("Deleted the file: " + fs3d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[3])){
				try{
					File fs4d=new File("One_Student4.txt");
					if (fs4d.delete()) { 
						System.out.println("Deleted the file: " + fs4d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[4])){
				try{
					File fs5d=new File("One_Student5.txt");
					if (fs5d.delete()) { 
						System.out.println("Deleted the file: " + fs5d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Invalid choice !\nPlease enter roll no from 1-5 ");
				Class_OneDel();
			}
		System.out.println("Student Record Deleted Successfully\nPress 1 for return to main menu and any other number for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
    }
	public static void Class_TwoDel(){//This method gets the roll no of  class two student to delete that student
        System.out.println("\n*** Class Two ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
            String roll=input.nextLine();
            if(roll.equals(roll_no[0])){
				try{
					File ts1d=new File("Two_Student1.txt");
					if (ts1d.delete()) { 
						System.out.println("Deleted the file: " + ts1d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[1])){
				try{
					File ts2d=new File("Two_Student2.txt");
					if (ts2d.delete()) { 
						System.out.println("Deleted the file: " + ts2d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[2])){
				try{
					File ts3d=new File("Two_Student3.txt");
					if (ts3d.delete()) { 
						System.out.println("Deleted the file: " + ts3d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[3])){
				try{
					File ts4d=new File("Two_Student4.txt");
					if (ts4d.delete()) { 
						System.out.println("Deleted the file: " + ts4d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[4])){
				try{
					File ts5d=new File("Two_Student5.txt");
					if (ts5d.delete()) { 
						System.out.println("Deleted the file: " + ts5d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else {
				System.out.println("\nInvalid choice !\nPlease enter roll no from 1-5 ");
				Class_TwoDel();
			}
		System.out.println("Student Record Deleted Successfully\nPress 1 for return to main menu and any other number for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
    }
	public static void Class_ThreeDel(){//This method gets the roll no of  class three student to delete that student
        System.out.println("\n*** Class Three ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
            String roll=input.nextLine();
            if(roll.equals(roll_no[0])){
				try{
					File ths1d=new File("Three_Student1.txt");
					if (ths1d.delete()) { 
						System.out.println("Deleted the file: " + ths1d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[1])){
				try{
					File ths2d=new File("Three_Student2.txt");
					if (ths2d.delete()) { 
						System.out.println("Deleted the file: " + ths2d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[2])){
				try{
					File ths3d=new File("Three_Student3.txt");
					if (ths3d.delete()) { 
						System.out.println("Deleted the file: " + ths3d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[3])){
				try{
					File ths4d=new File("Three_Student4.txt");
					if (ths4d.delete()) { 
						System.out.println("Deleted the file: " + ths4d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[4])){
				try{
					File ths5d=new File("Three_Student5.txt");
					if (ths5d.delete()) { 
						System.out.println("Deleted the file: " + ths5d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else {
				System.out.println("\nInvalid choice !\nPlease enter roll no from 1-5 : ");
				Class_ThreeDel();
			}
		System.out.println("Student Record Deleted Successfully\nPress 1 for return to main menu and any other number for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
    }
	public static void Class_FourDel(){//This method gets the roll no of  class four student to delete that student
        System.out.println("\n*** Class Four ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
            String roll=input.nextLine();
            if(roll.equals(roll_no[0])){
				try{
					File fos1d=new File("Four_Student1.txt");
					if (fos1d.delete()) { 
						System.out.println("Deleted the file: " + fos1d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[1])){
				try{
					File fos2d=new File("Four_Student2.txt");
					if (fos2d.delete()) { 
						System.out.println("Deleted the file: " + fos2d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[2])){
				try{
					File fos3d=new File("Four_Student3.txt");
					if (fos3d.delete()) { 
						System.out.println("Deleted the file: " + fos3d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[3])){
				try{
					File fos4d=new File("Four_Student4.txt");
					if (fos4d.delete()) { 
						System.out.println("Deleted the file: " + fos4d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[4])){
				try{
					File fos5d=new File("Four_Student5.txt");
					if (fos5d.delete()) { 
						System.out.println("Deleted the file: " + fos5d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Invalid choice !\nPlease enter roll no from 1-5 \n\n");
				Class_FourDel();
			}
		System.out.println("Student Record Deleted Successfully \nPress 1 for return to main menu and any other number for terminate program : ");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
    }
	public static void Class_FiveDel(){//This method gets the roll no of  class five student to delete that student
        System.out.println("\n*** Class Five ***\n");
        String[] roll_no={"1","2","3","4","5"};
        System.out.println("Enter Roll Number of a student : ");
            String roll=input.nextLine();
            if(roll.equals(roll_no[0])){
				try{
					File fis1d=new File("Five_Student1.txt");
					if (fis1d.delete()) { 
						System.out.println("Deleted the file: " + fis1d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[1])){
				try{
					File fis2d=new File("Five_Student2.txt");
					if (fis2d.delete()) { 
						System.out.println("Deleted the file: " + fis2d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[2])){
				try{
					File fis3d=new File("Five_Student3.txt");
					if (fis3d.delete()) { 
						System.out.println("Deleted the file: " + fis3d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[3])){
				try{
					File fis4d=new File("Five_Student4.txt");
					if (fis4d.delete()) { 
						System.out.println("Deleted the file: " + fis4d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else if(roll.equals(roll_no[4])){
				try{
					File fis5d=new File("Five_Student5.txt");
					if (fis5d.delete()) { 
						System.out.println("Deleted the file: " + fis5d.getName());
					} else {
						System.out.println("Failed to delete the file.");
					} 
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else {;
				System.out.println("Invalid choice !\nPlease enter roll no from 1-5 \n\n ");
				Class_FiveDel();
			}
		System.out.println("Student Record Deleted Successfully \nPress 1 for return to main menu and any other number for terminate program :");
        String repeat=input.nextLine();
        if(repeat.equals("1"))
            main_menu();
    }
}	
