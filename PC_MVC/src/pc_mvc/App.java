/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc_mvc;

import Controlador.ControladorCalorias;
import Vista.VistaRegistro;
import Vista.VistaTotalCalorias;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VistaRegistro vistaRegistro = new VistaRegistro();
            VistaTotalCalorias vistaTotalCalorias = new VistaTotalCalorias();
            ControladorCalorias controlador = new ControladorCalorias(vistaRegistro, vistaTotalCalorias);

            vistaRegistro.setVisible(true);
            vistaTotalCalorias.setVisible(false);
        });
    }
}

