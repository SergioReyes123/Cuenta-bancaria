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
public class opcionesBancarias {
    
    double Dinero = 100000;
    int vr;
    
    public void Retiro(){
        
        int OpcRetiro;
        
        String retirar = JOptionPane.showInputDialog("MENU DE RETIROS "
                + "1.  100.00 \n"
                + "2.  300.00 \n"
                + "3.  500.00 \n"
                + "4. 1000.00 \n"
                + "5. 2000.00 \n");
        
        OpcRetiro =Integer.parseInt(retirar);
            
        switch(OpcRetiro){
                
                case 1:
                    vr = 100;
                    Validar();
                    break;
                case 2:
                    vr = 300;
                    Validar();
                    break;
                case 3:
                    vr = 500;
                    Validar();
                    break;
                case 4:
                    vr = 1000;
                    Validar();
                    break;
                case 5:
                    vr = 2000;
                    Validar();
                    break;
                  
                default:
                    JOptionPane.showMessageDialog(null,"La opcion Digitada NO es valida"
                            + "POr favor Verifique E ingrese una opcion del MENU ",
                            "ENTRADA INVALIDA", JOptionPane.ERROR);
                    break;
            
            }     
         }
    public void Deposito(){
        JOptionPane.showMessageDialog(null,"Usted a seleccionado la Opcion de Deposito ");
        double Deposito = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero desea Depositar ? \n"));
        JOptionPane.showMessageDialog(null,"Usted acaba de depositar : " + Deposito);
        Dinero = Dinero + Deposito;
        JOptionPane.showMessageDialog(null,"Su saldo Actual es : " + Dinero);
        
    }
    
    public void Consultar(){
        JOptionPane.showMessageDialog(null,"Su saldo Actual es : " + Dinero);
        JOptionPane.showMessageDialog(null,"Gracias por utilizar Nuestro servicio " );
    }
    
    public void Validar(){
        if (Dinero>vr) {
            Dinero = Dinero = vr;
            JOptionPane.showMessageDialog(null,"Su saldo Actual es de : " + Dinero);
        } else {
            JOptionPane.showMessageDialog(null,"Su saldo es Insuficiente :","ERROR", JOptionPane.ERROR);
        }
    }
}


