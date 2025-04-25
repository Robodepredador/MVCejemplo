/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaRegistro extends JFrame {
    private JTextField nombreField;
    private JComboBox<String> tipoComidaCombo;
    private JTextField alimentoField;
    private JTextField racionField;
    private JTextField caloriasField;
    private JButton registrarButton;
    private JButton cambiarVistaButton;

    public VistaRegistro() {
        setTitle("Registro de Calorías");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Inicialización de componentes
        nombreField = new JTextField();
        tipoComidaCombo = new JComboBox<>(new String[]{"Desayuno", "Almuerzo", "Cena"});
        alimentoField = new JTextField();
        racionField = new JTextField();
        caloriasField = new JTextField();
        registrarButton = new JButton("Registrar");
        cambiarVistaButton = new JButton("Ver Total Calorías");

        // Añadir componentes al JFrame
        add(new JLabel("Nombre:"));
        add(nombreField);
        add(new JLabel("Tipo de Comida:"));
        add(tipoComidaCombo);
        add(new JLabel("Alimento:"));
        add(alimentoField);
        add(new JLabel("Ración:"));
        add(racionField);
        add(new JLabel("Calorías:"));
        add(caloriasField);
        add(registrarButton);
        add(cambiarVistaButton);
    }

    public String getNombre() { return nombreField.getText(); }
    public String getTipoComida() { return (String) tipoComidaCombo.getSelectedItem(); }
    public String getAlimento() { return alimentoField.getText(); }
    public String getRacion() { return racionField.getText(); }
    public String getCalorias() { return caloriasField.getText(); }

    public void addRegistrarListener(ActionListener listenForRegistrarButton) {
        registrarButton.addActionListener(listenForRegistrarButton);
    }

    public void addCambiarVistaListener(ActionListener listenForCambiarVistaButton) {
        cambiarVistaButton.addActionListener(listenForCambiarVistaButton);
    }
}
