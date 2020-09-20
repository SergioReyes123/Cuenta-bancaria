/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta_bancaria;
import javax.swing.JOptionPane;
/**
 *
 * @author Romario
 */
public class transacciones {
    int opc;

opcionesBancarias per1 = new opcionesBancarias();

public void Menu(){

        do {  
            
            String bancario = JOptionPane.showInputDialog("Cuenta Bancaria \n MENU PRINCIPAL \n "
                + "1. Deposito \n"
                + "2. Retiro \n"
                + "3. Saldo \n"
                + "4. Salir \n ");
            
            opc = Integer.parseInt(bancario);
            
            switch(opc){
                
                case 1:
                    per1.Deposito();
                    break;
                case 2:
                    per1.Retiro();
                    break;
                case 3:
                    per1.Consultar();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"GRACIAS... ");
                    System.exit(0);
                    break;
            
            }
            
        } while (true);


}

}
