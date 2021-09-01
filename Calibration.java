import java.util.Scanner;

public class Calibration {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in); 
        System.out.println ("Name student want to accomplish this semester"); 
        boolean valid = false; 
        String davidbee = "davidbee"; 
        String Evan = "Evancallaghan";
        String Josue = "Josuechigwira";
        String Morgan = "Morgangant";
        String maddiee = "maddiee";
        String grant = "grant";
        String jacobh = "jacobh";
        String nick = "nick";
        String giddy= "giddy_code";
        String nguyen = "nguyen";
        String craig = "craig"; 
        String danh1234 = "danh"; 
        String jacobt = "jacobt"; 
        
        String Exit = "Y"; 
        String userName = scanner.nextLine(); 
        while(!valid){ 
            if (userName.equals("davidbee"))
            {
                valid = false; 
                System.out.println("He is auditing this course to learn something he doesn't know, expand on, or enhance, some things he think he may know and get new perspectives by looking at things from other student's point of view.");
                System.out.println ("Would you like to continue? or Click Y to Exit"); 
                userName = scanner.nextLine();
            }
            
          else if (userName.equals("Evancallaghan"))
          {
                valid = false; 
                System.out.println("He want to gain a broad understanding of software development, learn how it is implemented in the real world, and learn how it can be applied in the field of data analytics. In addition to this, I aim to gain programming experience and improve upon soft skills such as communication and working as a member of a team"); 

                System.out.println ("Would you like to continue? or Click Y to exit"); 
                userName = scanner.nextLine();
                 
            }
            
            else if (userName.equals("Josuechigwira"))
            {
                valid = false; 
               
                System.out.println("He want to learn new things about software that he doesn't know before, and in this class help him with expanding his knowledge and helping decide what he want to do in the future");
                 userName = scanner.nextLine();
            }
            
            
            else if (userName.equals("Morgangant"))
            {
                valid = false; 
                System.out.println("want to gain a basic understanding of what Sofware development in, how software's differ from each other and when to use a certain software and be able to compare it to Data Science");
                 userName = scanner.nextLine();
            }
            else if (userName.equals("maddiee")) 
            { 
                valid = false; 
                System.out.println("want to build up my team working and communication skills. I also want to be able to use what I've learned from this class in interviews and future careers");
                 userName = scanner.nextLine();
            }
            else if (userName.equals("grant"))
            {
                valid = false; 
                System.out.println( "hope to understand all the topics that were covered in the class and expand my knowledge and skills in software development and coding so I can be prepared to be successful as I go on in my major and onto a career.");
                 userName = scanner.nextLine();
            }
             else if (userName.equals("jacobh"))
             {
             valid = false;
             System.out.println( "become more confident with the software development process. I want to gain proficiency in timing my tasks and better judging how to divide up my work. I want to develop good actionable tasks with clear success criteria.");
              userName = scanner.nextLine();
             
             
         }
         
             else if (userName.equals("nick"))
         { 
             valid = false; 
             System.out.println("want to be able to create, maintain, and improve personal projects that I will feel proud of.");
              userName = scanner.nextLine();
            }
            
            else if (userName.equals("giddy_code"))
            {
                valid = false; 
                System.out.println("learn a bunch of new skills and information and apply that knowledge into future circumstances");
                 userName = scanner.nextLine();
            }
            
            else if (userName.equals("nguyen"))
            {
                valid = false; 
                System.out.println ("able to write the most basic software, not giving up when solving problems especially when it come to writing code, improve teamwork and communication between each other and be able to define and breaking down tasks into subtasks to help me understand it better, to do it better. ");
                 userName = scanner.nextLine();
            }
    
            else if (userName.equals("craig"))
            {
                valid = false; 
                System.out.println("gain more confidence in my programming abilities. I would also like to continue to work on my problem-solving and time management skills. After this course, I want to be able to create, maintain, and improve personal projects that I will feel proud of");
                 userName = scanner.nextLine();
                
            }
             else if (userName.equals("danh"))
             { 
                 valid = false; 
                 System.out.println( "expect to learn about SDLC and the frameworks that support it and its phases and to improve my soft skills for software development process.");
                 userName = scanner.nextLine();
                }
                
               
                else if (userName.equals( "jacobt"))
                {
                    valid = false; 
                    System.out.println("want to gain proficiency in timing my tasks and better judging how to divide up my work"); 
                     userName = scanner.nextLine();
                }
            else if (userName.equals("Y"))
            {
                valid = false;
                System.out.println("Exit - Thank you ! " );
                System.exit(1);
            }
        
            else 
        {
            System.out.println("Sorry! Unknown student");
            System.out.println ("Would you like to continue? or Click Y to Exit"); 
            userName = scanner.nextLine();
            
        }
        }
            
           
            
            }
        }
    
     
            
        
   // }
            
            
    
    
       // System.out.println("Sorry! Unknown student");
        //System.exit(1);
            
        
        
    



        
    
        
                   
            

