/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor.monedas;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author tmarroquin
 */
public class ConversorMonedas extends JPanel {
    
    
    public static void main(String[] args) {
        
        FormConversor FormPrincipal = new FormConversor();
        Color color = new Color(229, 210, 131);
        
         String rutaIcono ="C:\\Users\\tmarroquin\\Documents\\NetBeansProjects\\Conversor-Monedas\\src\\img\\icono.ico";
         
         ImageIcon icono = new ImageIcon(rutaIcono);

        FormPrincipal.setIconImage(icono.getImage());
        FormPrincipal.setLocationRelativeTo(null);
        FormPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FormPrincipal.getContentPane().setBackground(color);
        FormPrincipal.setTitle("Conversor de Moneda");
        FormPrincipal.setVisible(true);
        
        
    }
   
   
   

}
