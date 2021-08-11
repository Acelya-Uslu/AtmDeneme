/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmdeneme;


public class Atmdeneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
    atm obj=new atm();
    hesap obj2=new hesap("Ace", "123", 50);
    obj.run(obj2);
    
        System.out.println("çıkış yapıldı");
 
    
    
    
    }
    
}
