/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmdeneme;

import java.util.Scanner;


public class atm {
    control nesne=new control();
    
    
    public void run(hesap hesap){
         int hak=3;
         while(hak!=0){
             if(nesne.cont(hesap)){
                 System.out.println("başarılııııı..");
                 break;
                       
             }
             else {
                 hak-=1;
                 System.out.println("başarısııııııııızz.."+hak);
                
             }
              if(hak==0){
              return;
             
         }
              
              
         }
         System.out.println("işlemler"+"\n"+"1-para yatırma"+"\n"+"2-para çekme"+"\n"+"3-Bakiye görüntüleme"+"\n"+"4-çıkış");
         
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        
        switch(a){
            case 1:
                System.out.println("yatırılacak tutar =");
                int tutar=input.nextInt();
                
                 double sum=hesap.getMoney()+tutar;
                System.out.println("yeni bakiye "+sum);
                break;
                
            case 2:
                System.out.println("çekilecek tutar=");
                int tutarr=input.nextInt();
                double summ=hesap.getMoney()-tutarr;
             
                System.out.println("yeni bakiye="+summ);
                
                break;
            case 3:
                System.out.println("Bakiyenizzz.."+hesap.getMoney());
                
                break;
                case 4:
                    return;
                
                
                
                
        }
                
        
         
         
         
         
         
        
    }
    
    
    
    
    
    
}
