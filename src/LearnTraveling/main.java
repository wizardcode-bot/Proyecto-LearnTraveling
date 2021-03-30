/*
learn traveling.
-se crea una clase para estudiantes y una clase para docentes. -->DONE
-se crea menu para ingresar como docente o estudiante. -->DONE
-los docentes se crean una cuenta, ingresan sus datos y se guardan en un archivo si crea el curso. -->DONE
-los estudiantes se crean una cuenta por cada uno y se guarda en un archivo diferente --> DONE
y escojen uno de los cursos disponibles, en una opcion de cursos disponibles. --> DONE
-cuando un estudiante se quiere matricular a un curso pueda ver quienes ya estan o si no hay ninguno. -->DONE
-a el docente se le pone un maximo de estudiantes por curso 
y se muestra si ya se completo o cuantos hay (estado) --> DONE
-a el estudiante se le muestra si esta cursando o no algun curso (estado) --> DONE
-crear una clase que herede a docente y a estudiante, se crea un archivo en el que se agreguen los datos
del docente y los estudiantes que se anoten al curso. --> DONE
->el (DOCENTE) ingresa sus datos y al final se le dice con cuales requisitos cumplio y con cuales no.
*/
package LearnTraveling;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;


public class main {

   
    public static void main(String[] args) throws IOException {
        
    Estudiante student = new Estudiante();
    Docente teacher = new Docente();
        int op;
    
    do{
         op = Integer.parseInt(JOptionPane.showInputDialog("Hi there! Welcome to Learn-Traveling"
                +"\n                 MAIN MENU\n\n1. Access as a Teacher\n2. Access as a Student"
                +"\n3. About\n4. Why traveling?\n0. Exit"));
        switch(op){
            case 1:
                teacher.menu();
                break;
                
            case 2:
                student.menu();
                break;
                
            case 3: 
                JOptionPane.showMessageDialog(null, "Learn-Traveling is an educational company intended for people"+
            " who wants to learn \na language in another country. Where is taught by a professional native teacher."+
            "\nThese teachers have been previously registered in the platform with their respective personal information"+
            "\nand the student will decide which one to have classes with, depending on the country they've chosen."+
            "\nLearn-Traveling will provide basic services, being these hotel accommodation, food and transport"+
            "\nduring the stipulated time."+
            "\nThe student will graduate with an international certification taking the IELTS exam at the end of the course."
                        + "\nEach course has a maximum quota of five students.");
                break;
                
            case 4:
                enlace("https://www.trafalgar.com/real-word/learning-through-travel/");
                break;
        }
        }while(op!=0);
    }
    
    public static void enlace (String enlaceAAceder) throws IOException{
        Desktop enlace=Desktop.getDesktop();
        try {
                enlace.browse(new URI(enlaceAAceder));
        } catch (URISyntaxException e) {
            e.getMessage();
        }
    }
  
}