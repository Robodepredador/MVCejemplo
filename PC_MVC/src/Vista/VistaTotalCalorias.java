
package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VistaTotalCalorias extends JFrame {
    private JLabel nombreLabel;
    private JLabel caloriasDesayunoLabel;
    private JLabel caloriasAlmuerzoLabel;
    private JLabel caloriasCenaLabel;
    private JLabel estadoConsumoLabel;
    private JLabel recomendacionLabel;
    private JTable alimentosTable;
    private DefaultTableModel tableModel;

    public VistaTotalCalorias() {
        setTitle("Total de Calorías");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));

        // Inicialización de componentes
        nombreLabel = new JLabel("Nombre: ");
        caloriasDesayunoLabel = new JLabel("Calorías Desayuno: ");
        caloriasAlmuerzoLabel = new JLabel("Calorías Almuerzo: ");
        caloriasCenaLabel = new JLabel("Calorías Cena: ");
        estadoConsumoLabel = new JLabel("Estado de Consumo: ");
        recomendacionLabel = new JLabel("Recomendación: ");
        
        // Tabla para mostrar alimentos
        String[] columnNames = {"Alimento", "Tipo", "Ración", "Calorías"};
        tableModel = new DefaultTableModel(columnNames, 0);
        alimentosTable = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(alimentosTable);
        
        // Añadir componentes al JFrame
        add(nombreLabel);
        add(caloriasDesayunoLabel);
        add(caloriasAlmuerzoLabel);
        add(caloriasCenaLabel);
        add(estadoConsumoLabel);
        add(recomendacionLabel);
        add(scrollPane);
    }

    public void setNombre(String nombre) { nombreLabel.setText("Nombre: " + nombre); }
    public void setCaloriasDesayuno(int calorias) { caloriasDesayunoLabel.setText("Calorías Desayuno: " + calorias); }
    public void setCaloriasAlmuerzo(int calorias) { caloriasAlmuerzoLabel.setText("Calorías Almuerzo: " + calorias); }
    public void setCaloriasCena(int calorias) { caloriasCenaLabel.setText("Calorías Cena: " + calorias); }
    public void setEstadoConsumo(String estado) { estadoConsumoLabel.setText("Estado de Consumo: " + estado); }
    public void setRecomendacion(String recomendacion) { recomendacionLabel.setText("Recomendación: " + recomendacion); }

    public void limpiarTabla() {
        tableModel.setRowCount(0);
    }

    public void agregarAlimentoATabla(String[] datos) {
        tableModel.addRow(datos);
    }
}

