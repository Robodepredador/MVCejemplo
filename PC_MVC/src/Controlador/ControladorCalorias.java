/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.UsuarioCalorias;
import Vista.VistaRegistro;
import Vista.VistaTotalCalorias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalorias {
    private VistaRegistro vistaRegistro;
    private VistaTotalCalorias vistaTotalCalorias;
    private UsuarioCalorias usuario;

    public ControladorCalorias(VistaRegistro vistaRegistro, VistaTotalCalorias vistaTotalCalorias) {
        this.vistaRegistro = vistaRegistro;
        this.vistaTotalCalorias = vistaTotalCalorias;

        // Inicializamos el usuario
        this.usuario = new UsuarioCalorias("Usuario Sin Nombre");

        // Configuramos los listeners
        this.vistaRegistro.addRegistrarListener(new RegistrarListener());
        this.vistaRegistro.addCambiarVistaListener(new CambiarVistaListener());
        actualizarVista();
    }

    private void actualizarVista() {
        vistaTotalCalorias.setNombre(usuario.getNombre());
        vistaTotalCalorias.setCaloriasDesayuno(usuario.getCaloriasDesayuno());
        vistaTotalCalorias.setCaloriasAlmuerzo(usuario.getCaloriasAlmuerzo());
        vistaTotalCalorias.setCaloriasCena(usuario.getCaloriasCena());
        vistaTotalCalorias.setEstadoConsumo(usuario.getEstadoConsumo());
        vistaTotalCalorias.setRecomendacion(usuario.getRecomendacion());

        // Limpiar tabla
        vistaTotalCalorias.limpiarTabla();
        for (String alimento : usuario.getAlimentosRegistrados()) {
            String[] datos = alimento.split(",");
            vistaTotalCalorias.agregarAlimentoATabla(datos);
        }
    }

    // Clase interna para manejar el evento de registrar
    class RegistrarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = vistaRegistro.getNombre();
            String tipoComida = vistaRegistro.getTipoComida();
            String alimento = vistaRegistro.getAlimento();
            int racion = Integer.parseInt(vistaRegistro.getRacion());
            int calorias = Integer.parseInt(vistaRegistro.getCalorias());

            // Configura los valores en el usuario
            usuario.setNombre(nombre);

            if (tipoComida.equals("Desayuno")) {
                usuario.setCaloriasDesayuno(calorias);
            } else if (tipoComida.equals("Almuerzo")) {
                usuario.setCaloriasAlmuerzo(calorias);
            } else if (tipoComida.equals("Cena")) {
                usuario.setCaloriasCena(calorias);
            }

            usuario.agregarAlimento(alimento + "," + tipoComida + "," + racion + "," + calorias);
            usuario.calcularTotalCalorias();

            // Actualiza la vista total de calorías
            actualizarVista();
        }
    }

    // Clase interna para manejar el cambio de vista
    class CambiarVistaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vistaRegistro.setVisible(false);
            vistaTotalCalorias.setVisible(true);
        }
    }
}



