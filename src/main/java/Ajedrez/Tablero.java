/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajedrez;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Tablero extends JPanel {
    public Tablero(int capacidad, int[][] resultado) {
        JButton[][] botones;
        botones = new JButton[capacidad][capacidad];

        // SE CREA UN OYENTE DE ACCIONES Y SE LE PASA EL
        // PANEL COMO ARGUMENTO
        //OyenteAcciones oyenteAcciones = new OyenteAcciones(this);
        Color color1 = new Color(250, 233, 190);
        Color color2 = new Color(145, 101, 66);
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                // SE CREAN LOS BOTONES Y SE ESTABLECE SU TAMAÑO PREFERIDO
                botones[i][j].setPreferredSize(new Dimension(50, 50));
                if ((i + j + 1) % 2 == 0)
                    botones[i][j].setBackground(color1);
                else
                    botones[i][j].setBackground(color2);
                //botones[i][j].addActionListener(oyenteAcciones);
                add(botones[i][j]);
                botones[i][j].setText(String.valueOf(resultado[i][j]));
                botones[i][j].setBorderPainted(false);
            }
            setLayout(new GridLayout(capacidad, capacidad));

        }

    }
}
