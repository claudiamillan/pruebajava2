/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Matematicas
/**
 * Claudia Millan Lopez
 * @author lab12
 * Fecha: 06 de Noviembre de  2017
 * Programa: Pruebajava2
 * Responsabilidad: Aplicaciones de Escritorio en Java
 */
public class Pruebajava2 
{
 
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     float numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
     //El metodo round es para redondear una decimal
     switch(Math.round(numero))
     {  
      case 1://Caso 1 - si el valor es 12
         JOptionPane.showMessageDialog(null,"ENERO");
      break;
      case 2://Caso 2 - si el valor es 12
         JOptionPane.showMessageDialog(null,"FEBRERO");
      break;
      case 3://Caso 3 - si el valor es 12
         JOptionPane.showMessageDialog(null,"MARZO");
      break;
      case 4://Caso 4 - si el valor es 12
         JOptionPane.showMessageDialog(null,"ABRIL");
      break;
      case 5://Caso 5 - si el valor es 12
         JOptionPane.showMessageDialog(null,"MAYO");   
      break;
      case 6://Caso 6 - si el valor es 12
         JOptionPane.showMessageDialog(null,"JUNIO"); 
      break;
      case 7://Caso 7 - si el valor es 12
         JOptionPane.showMessageDialog(null,"JULIO");   
      break;
      case 8://Caso 8 - si el valor es 12
         JOptionPane.showMessageDialog(null,"AGOSTO"); 
      break;
      case 9://Caso 9 - si el valor es 12
         JOptionPane.showMessageDialog(null,"SEPTIEMBRE");
      break;
      case 10://Caso 10 - si el valor es 12
         JOptionPane.showMessageDialog(null,"OCTUBRE");   
      break;
      case 11://Caso 11 - si el valor es 12
         JOptionPane.showMessageDialog(null,"NOVIEMBRE");   
      break;
      case 12://Caso 12 - si el valor es 12
         JOptionPane.showMessageDialog(null,"DICIEMBRE");   
      
      
    }
 
     
}
}
