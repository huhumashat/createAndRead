package creatandread;
import java.util.Scanner;
import java.io.*;

public class CreatAndRead {

   public static void main(String[] args) throws IOException {
       String filename;
       String studentName;
       int num;
       int numStudents;
       int marks;
       boolean begin=true;
       Scanner keyboard = new Scanner(System.in);
       File directoryPath = new File("C:\\Users\\huhuMashat\\Documents\\NetBeansProjects\\creatAndRead");

       /*
           System.out.print("What do you want to do now?\n"
               + "1- Add class file\n"
               + "2- read class file\n"
               + "3- exit\n");
       */
       // Begin
       System.out.println("==============================\n"
               + "Welcome to CreatAndRead project\n"
               + "==============================\n");
       
       
       // create 
       System.out.print("How many students do you have? "); 
       numStudents = keyboard.nextInt();
       // Consume the remaining newline character.
           keyboard.nextLine();
       // Get the filename.
           System.out.print("Enter the filename: "); 
           filename = keyboard.nextLine();
       // Open the file.
           PrintWriter outputFile = new PrintWriter(filename+".txt");
       // Get data and write it to the file. 
           for (int i = 1; i <= numStudents; i++) {
           // Get the name of a friend. 
               System.out.println("Enter the name of student number " + i + ": "); 
               studentName = keyboard.nextLine();
               System.out.println("and add mark for number " + i + ": "); 
               marks = keyboard.nextInt();
           // Write the name to the file.
               outputFile.println(studentName + " => " +marks);
               // Consume the remaining newline character.
               keyboard.nextLine();
       }
       //close the file
           outputFile.close();
           System.out.println("Data written to the file.\n\n\n");  
           
       //read
       //List all files and directories
		System.out.println("------------All files------------");
		for (File file : directoryPath.listFiles()) {
			System.out.println(file.getName());
		}
		
		//List text files only
		System.out.println("\n------------Text files------------");
		File[] files=directoryPath.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}
		});
		
		for (File file : files) {
			System.out.println(file.getName());
		}
       System.out.print("\n------------\n"
               + "Enter the filename: "); 
           filename = keyboard.nextLine();
           // Open the file.
           File file = new File(filename+".txt"); 
           Scanner inputFile = new Scanner(file);
           // Read lines from the file until no more are left. 
           while (inputFile.hasNext()) {
               // Read the next name.
                studentName = inputFile.nextLine();
               // Display the last name read.
               System.out.println(studentName); 
           }
           //Close the file. 
            inputFile.close();
               
      
   }
   
}


