
package LearnTraveling;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Docente {
   boolean NAT_LANG,EXP, CERT;//FOR COMPARING NATIVE LANGUAGE, EXPERIENCE AND CERTIFICATE
   String MOT_TONGUE;//FOR REQUESTING MOTHER TONGUE
   protected static String CREATE_D_USER,CREATE_D_PASS,LOGIN_D_USER,LOGIN_D_PASS;   
   protected static String D_NAME,D_EMAIL,D_COUNTRY,D_LANGUAGE,D_AVAILABILITY,T_AVAILABILITY;
   protected static int D_IDENTIFICATION, EXPERIENCE, CERTIFICATE;
    
    public void menu(){
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("Hey! You wanna sign-in for teaching your language?"
                + "\n               Welcome to Learn-Traveling"+
                "\n                         MAIN MENU\n\n1. Create an account\n2. Log-in"
                + "\n3. What languages does Learn-Traveling teach?\n4. Which are the requirements\n0. Exit"));
        switch(op){
            case 1:
                CreatAcc();
                break;
                
            case 2:
                d_login();
                break;
                
            case 3: 
                Cursos info =new Cursos();
                info.languages();
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "       Requirements for teaching in Learn-Traveling"
                        + "\n\n1. Being a  native of the language\n2. Staying in the country during the course"
                        + "\n3. Having a minimum of five years experience teaching the language"
                        + "\n4. Having a certificate for teaching languages.");
                break;
        }
        }while(op!=0);
        
    }
    
    public void CreatAcc(){
    D_NAME = JOptionPane.showInputDialog("Type your full name");
    while (D_NAME == null || D_NAME.equals("")){
    D_NAME = JOptionPane.showInputDialog(null, "You have to type your name","Error",JOptionPane.ERROR_MESSAGE);
    }
    D_EMAIL = JOptionPane.showInputDialog("Type your e-mail");
    while (D_EMAIL == null || D_EMAIL.equals("")){
    D_EMAIL = JOptionPane.showInputDialog(null, "You have to type your email","Error",JOptionPane.ERROR_MESSAGE);
    }
    D_COUNTRY = JOptionPane.showInputDialog("Type your country");
    while (D_COUNTRY == null || D_COUNTRY.equals("")){
    D_COUNTRY = JOptionPane.showInputDialog(null, "You have to type your country","Error",JOptionPane.ERROR_MESSAGE);
    }
    MOT_TONGUE = JOptionPane.showInputDialog("What is your mother tongue?");
    while (MOT_TONGUE == null || MOT_TONGUE.equals("")){
    MOT_TONGUE = JOptionPane.showInputDialog(null, "You have to type your mother tongue","Error",JOptionPane.ERROR_MESSAGE);
    }
    D_LANGUAGE = JOptionPane.showInputDialog("Type the language you want to teach");
    while (D_LANGUAGE == null || D_LANGUAGE.equals("")){
    D_LANGUAGE = JOptionPane.showInputDialog(null, "You have to type your language","Error",JOptionPane.ERROR_MESSAGE);
    }
    D_AVAILABILITY = JOptionPane.showInputDialog("Whats is your availability (days)");
    while (D_AVAILABILITY == null || D_AVAILABILITY.equals("")){
    D_AVAILABILITY = JOptionPane.showInputDialog(null, "You have to type your availability","Error",JOptionPane.ERROR_MESSAGE);
    }
    T_AVAILABILITY = JOptionPane.showInputDialog("Whats is your availability (time)");
    while (T_AVAILABILITY == null || T_AVAILABILITY.equals("")){
    T_AVAILABILITY = JOptionPane.showInputDialog(null, "You have to type your availability","Error",JOptionPane.ERROR_MESSAGE);
    }
    EXPERIENCE = Integer.parseInt(JOptionPane.showInputDialog("How many years have you been teaching this language?"));
    D_IDENTIFICATION = Integer.parseInt(JOptionPane.showInputDialog("Type your identification number"));
    CERTIFICATE = JOptionPane.showConfirmDialog(null, "¿Do you have a certificate for teaching this language?", "Warning!", JOptionPane.YES_NO_OPTION);
    CREATE_D_USER = JOptionPane.showInputDialog("Type an username");
    while (CREATE_D_USER == null || CREATE_D_USER.equals("")){
    CREATE_D_USER = JOptionPane.showInputDialog(null, "You have to type a username","Error",JOptionPane.ERROR_MESSAGE);
    }
    CREATE_D_PASS = JOptionPane.showInputDialog("Type a password");
    while (CREATE_D_PASS == null || CREATE_D_PASS.equals("")){
    CREATE_D_PASS = JOptionPane.showInputDialog(null, "You have to type a password","Error",JOptionPane.ERROR_MESSAGE);
    }
    Requirementes();
    }
    
    public void d_login(){
    int aux_log;
        LOGIN_D_USER = JOptionPane.showInputDialog("Type your username");
        LOGIN_D_PASS = JOptionPane.showInputDialog("Type your password");
        if(LOGIN_D_USER.equals(CREATE_D_USER) && LOGIN_D_PASS.equals(CREATE_D_PASS)){
            
            JOptionPane.showMessageDialog(null,"Hi "+D_NAME+" Welcome to Learn-Traveling!!"
            +"\nWe've got a wide variety of courses, Check them out!");
            logged_in();
        }else if(LOGIN_D_USER != CREATE_D_USER && LOGIN_D_PASS.equals(CREATE_D_PASS)){
            JOptionPane.showMessageDialog(null, "The user doesn't match the password, try again", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(LOGIN_D_PASS != CREATE_D_PASS && LOGIN_D_USER.equals(CREATE_D_USER)){
            
            int resp = JOptionPane.showConfirmDialog(null, "¿Did you forget your password?", "Warning!", JOptionPane.YES_NO_OPTION);
            switch(resp){
                case 0:
                    aux_log = Integer.parseInt(JOptionPane.showInputDialog("You can log-in with your identification"));
                    if(aux_log == D_IDENTIFICATION){
                    JOptionPane.showMessageDialog(null,"Hi "+D_NAME+" Welcome to Learn-Traveling!!"
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
    
      public void logged_in(){
        int op2;
         do{
        op2 = Integer.parseInt(JOptionPane.showInputDialog("You're logged in! What do you wanna do next?\n       Welcome to Learn-Traveling"+
                "\n                 MAIN MENU\n\n1. Change password\n2. Check my info\n3. Create Course\n4. Status\n0. Log-out"));
        switch(op2){
            case 1:
                CREATE_D_PASS = JOptionPane.showInputDialog("Type your new password");
                JOptionPane.showMessageDialog(null, "Your password has been modified.");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Name: "+D_NAME+"\nE-mail: "+D_EMAIL
                +"\nIdentification: "+D_IDENTIFICATION+"\nCountry: "+D_COUNTRY+"\nLanguage: "+D_LANGUAGE
                        +"\nUser: "+CREATE_D_USER+"\nPassword: "+CREATE_D_PASS);
                break;
            
            case 3:
                CreateCourse();
                break; 
                
            case 4:
                Cursos part = new Cursos();
                part.Participants();
                break;
        }
        }while(op2!=0);
    }
      
      public void CreateCourse(){
      
      boolean fileCreated = false;
        File file = new File("Docente.txt");
        try {
            fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("\n\n\n      Available course"
              +"\n\nTeacher: "+D_NAME+"\nE-mail: "+D_EMAIL+"\nCountry: "+D_COUNTRY
                +"\nLanguage: "+D_LANGUAGE+"\nAvailability: "+D_AVAILABILITY+" "+T_AVAILABILITY
                +"\nExperince: "+EXPERIENCE+"\n-->Hey there! You wanna join my class?. "
                        +"We'll have an amazing experience learning "+D_LANGUAGE+" in the lovely country of "
                                +D_COUNTRY);
            fileWriter.close();
            if(fileCreated) {
                JOptionPane.showMessageDialog(null, "Course succesfully created!!");
            } else {
                JOptionPane.showMessageDialog(null, "The file already exists");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Exception creating the file" + e);
        }
      }
      
      public void Requirementes(){
          if(MOT_TONGUE.equals(D_LANGUAGE)){
              NAT_LANG = true;
          }else{
              NAT_LANG = false;
          }
          
          if(EXPERIENCE >= 5){
              EXP = true;
          } else {
              EXP = false;
          }
          
          switch(CERTIFICATE){
                case 0:
                    CERT = true;
                    break;
                case 1:
                    CERT = false;
                    break;
            }
          
          if(NAT_LANG && EXP && CERT){   
              JOptionPane.showMessageDialog(null, "CONGRATULATIONS!   Your account has been succesfully created!"
                +"\nYou have met the requirements, Welcome to our family!"+
                    "\nNow you can login and Sign-up for teaching a course!" );
          }else{
              JOptionPane.showMessageDialog(null, "We're sorry you haven't met all the requirements, check them out again.");
              System.exit(0);
          }
      }
}
