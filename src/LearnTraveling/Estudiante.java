
package LearnTraveling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Estudiante extends Docente {
    
    static int op, cont=0; //(op) for student main menu, (cont) for the student maximum quota
    boolean enrolled; //to check wether the student is enrolled in a course or not
    protected static String Create_user,Create_pass,login_user,login_pass;
    protected static String name,email,country,language;
    protected static long  identification;
    Docente courses = new Docente();
 
    public void menu(){
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Hey! You wanna learn a new language?"
                + "\n       Welcome to Learn-Traveling"+
                "\n                 MAIN MENU\n\n1. Create an account\n2. Log-in"
                + "\n3. What languages does Learn-Traveling teach?\n0. Exit"));
        switch(op){
            case 1:
                CreatAcc();
                break;
                
            case 2:
                s_login();
                break;
                
            case 3: 
                Cursos info = new Cursos();
                info.languages();
                break;
        }
        }while(op!=0);
        
    }
    
    public void CreatAcc(){
    name = JOptionPane.showInputDialog("Type your first name");
    while (name == null || name.equals("")){
    name = JOptionPane.showInputDialog(null, "You have to type your name","Error",JOptionPane.ERROR_MESSAGE);
    }
    email = JOptionPane.showInputDialog("Type your e-mail");
    while (email == null || email.equals("")){
    email = JOptionPane.showInputDialog(null, "You have to type your email","Error",JOptionPane.ERROR_MESSAGE);
    }
    country = JOptionPane.showInputDialog("Where are you from?");
    while (country == null || country.equals("")){
    country = JOptionPane.showInputDialog(null, "You have to type your country","Error",JOptionPane.ERROR_MESSAGE);
    }
    language = JOptionPane.showInputDialog("What language/s do you speak?");
    while (language == null || language.equals("")){
    language = JOptionPane.showInputDialog(null, "You have to type your language","Error",JOptionPane.ERROR_MESSAGE);
    }
    identification = Integer.parseInt(JOptionPane.showInputDialog("Type your identification number"));
    Create_user = JOptionPane.showInputDialog("Type an username");
    while (Create_user == null || Create_user.equals("")){
    Create_user = JOptionPane.showInputDialog(null, "You have to type an username","Error",JOptionPane.ERROR_MESSAGE);
    }
    Create_pass = JOptionPane.showInputDialog("Type a password");
    while (Create_pass == null || Create_pass.equals("")){
    Create_pass = JOptionPane.showInputDialog(null, "You have to type a password","Error",JOptionPane.ERROR_MESSAGE);
    }
    
    
    String fileName = name+".txt"; // VARIABLE TO CONVERT THE NAME OF THE STUDENT TO A FILE TYPE (.txt)
    
    //CREATING THE FILE TO SAVE THE STUDENT INFORMATION 
    boolean fileCreated = false;
        File file = new File(fileName);
        try {
            fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("      Enrolled student"
              + "\n\nName: "+name+"\nE-mail: "+email+"\nCountry: "+country
                +"\nLanguage: "+language+"\nIdentification: "+identification);
            fileWriter.close();
            if(fileCreated) {
                JOptionPane.showMessageDialog(null, "CONGRATULATIONS!   Your account has been succesfully created!"
                +"\nYou've chosen the right place to have an amazing experience learning a language!"+
                "\nYou can login and Start Now!" );
            } else {
                JOptionPane.showMessageDialog(null, "The account already exists!!");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Exception creating the account" + e);
        }
    menu();
    }
    
    public void s_login(){
        int aux_log;
        enrolled = false;
        login_user = JOptionPane.showInputDialog("Type your username");
        login_pass = JOptionPane.showInputDialog("Type your password");
        if(login_user.equals(Create_user) && login_pass.equals(Create_pass)){
            JOptionPane.showMessageDialog(null,"Hi "+name+" Welcome to Learn-Traveling!!"
            +"\nWe've got a wide variety of courses, Check them out!");
            logged_in();
        }else if(login_user != Create_user && login_pass.equals(Create_pass)){
            JOptionPane.showMessageDialog(null, "The user doesn't match the password, try again", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(login_pass != Create_pass && login_user.equals(Create_user)){
            
            int resp = JOptionPane.showConfirmDialog(null, "¿Did you forget your password?", "Warning!", JOptionPane.YES_NO_OPTION);
            switch(resp){
                case 0:
                    aux_log = Integer.parseInt(JOptionPane.showInputDialog("You can log-in with your identification"));
                    if(aux_log == identification){
                    JOptionPane.showMessageDialog(null,"Hi "+name+" Welcome to Learn-Traveling!!"
                    +"\nWe've got a wide variety of courses, Check them out!");
                    logged_in();
                    }else{
                    JOptionPane.showMessageDialog(null, "Upps! Something went wrong, try again.", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Make sure you spell correctly next time.", "Error!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "This account doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    
    
    
    @Override
    public void logged_in(){
        int op2;
         do{
        op2 = Integer.parseInt(JOptionPane.showInputDialog("You're logged in! What do you wanna do next?\n       Welcome to Learn-Traveling"+
                "\n                 MAIN MENU\n\n1. Change password\n2. Check my info\n3. Check available courses\n4. Status\n0. Log-out"));
        switch(op2){
            case 1:
                Create_pass = JOptionPane.showInputDialog("Type your new password");
                JOptionPane.showMessageDialog(null, "Your password has been modified.");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Name: "+name+"\nE-mail: "+email
                +"\nIdentification: "+identification+"\nCountry: "+country+"\nLanguage/s: "+language
                        +"\nUser: "+Create_user+"\nPassword: "+Create_pass);
                break;
                
            case 3: 
               Courses();
                break;
                
            case 4:
                if(enrolled){
                    JOptionPane.showMessageDialog(null, "Greetings, You're already enrolled in a course. Best wishes!");
                }else{
                    JOptionPane.showMessageDialog(null, "Greetings, You're not yet enrolled in a course. Go and check the available ones!");
                }
        }
        }while(op2!=0);
    }
   
    public void Courses(){
        
         File file = new File("Docente.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
               JOptionPane.showMessageDialog(null, "The course is being shown in the console");
               int add = JOptionPane.showConfirmDialog(null, "¿Do you want to enroll in this course?", "Warning!", JOptionPane.YES_NO_OPTION);
               
               //ACÁ VA EL CONTADOR PARA EL MAXIMO DE ESTUDIANTES
            switch(add){
                case 0:
                    if(cont<5){
                    Cursos course = new Cursos();
                    course.Añadir();   
                    enrolled = true;
                    cont++;
                    }else{
                        JOptionPane.showMessageDialog(null, "We're sorry, there's no longer quota for this course.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Alright, keep checking for more courses!");
                    break;
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "There was an error trying to open the file" + e);
        }
    
    }
}
