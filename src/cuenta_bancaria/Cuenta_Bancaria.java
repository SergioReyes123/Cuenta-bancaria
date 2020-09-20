/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta_bancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author sergio reyes
 */
public class Cuenta_Bancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
    int op;

transacciones OPCB = new transacciones();
        
        
        
        do {  
            
            String bancario = JOptionPane.showInputDialog("Cuenta Bancaria \n MENU PRINCIPAL \n "
                + "1. Juan \n"
                + "2. Mario \n"
                + "3. Maria \n"
                + "4. Salir \n ");
            
            op = Integer.parseInt(bancario);
            
            switch(op){
                
                case 1:
                    OPCB.Menu();
                    break;
                case 2:
                    OPCB.Menu();
                    break;
                case 3:
                    OPCB.Menu();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"GRACIAS... ");
                    System.exit(0);
                    break;
            
            }
            
        } while (true);
        
        }
    
}
