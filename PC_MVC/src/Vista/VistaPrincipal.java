/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {
    private JButton irRegistroButton;

    public VistaPrincipal() {
        setTitle("Gestión de Calorías Diaria");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        irRegistroButton = new JButton("Ir a Registro");
        add(irRegistroButton);
    }

    public void addRegistroListener(ActionListener listener) {
        irRegistroButton.addActionListener(listener);
    }
}
