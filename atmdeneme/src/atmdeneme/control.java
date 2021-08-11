
package atmdeneme;

import java.util.Scanner;


public class control {
    
   public boolean cont(hesap hesap){
       
       System.out.println("username=");
       Scanner inp =new Scanner(System.in);
       String user=inp.nextLine();
 
       System.out.println("password");
       String pass=inp.nextLine();
       
       if(hesap.getUsername().equals(user) && hesap.getPassword().equals(pass)){
           return true;
       }
       else{
           return false;
       }
       
       
       
       
       
               
               
   }
   
       
  
    
    
    
    
}
