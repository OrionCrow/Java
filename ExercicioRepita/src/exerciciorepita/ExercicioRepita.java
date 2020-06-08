/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Computador
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int nD = -1;
        int nP = -1;
        int nI = 0;
        int aC = 0;
        int media = 0;
        do{
            nD++;
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um numero"
                    + "<br><em>(Digite 0 para finalizar)</em></html>"));
                        
            if (n%2==0)
                nP++;
            else
                nI++;
            if (n>100)
                aC++;
            
        } while (n!=0);
        JOptionPane.showMessageDialog(null,"<html>Resultado Final<br><hr>"
                +"<br>Números digitados: "+ nD +"<br>Números pares: " + nP
                + "<br>Números ímpares: "+ nI+ "<br>Acima de 100: "+aC+"</html>");
        
        
    }
    
}
