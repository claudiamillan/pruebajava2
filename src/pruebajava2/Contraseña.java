/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;

/**
 * Claudia Millan Lopez
 * @author lab12
 * Fecha: 06 de Noviembre de  2017
 * Programa: Pruebajava2
 * Responsabilidad: Contraseña
 */
public class Contraseña 
{
public static void main(String[] args) 
{
 int numero;
 
 numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
 if (numero==220)
 {
 JOptionPane.showMessageDialog(null,"clave correcta");  
  }
    else
{
 JOptionPane.showMessageDialog(null,"clave incorrecta");
 numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));
 JOptionPane.showMessageDialog(null,"clave incorrecta");
 numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese tercer numero"));
}
 while(numero==220)
{
JOptionPane.showMessageDialog(null,"clave bloqueada, comuniquese con soporte tecnico");
}   
 }
}
