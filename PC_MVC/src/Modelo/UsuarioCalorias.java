/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.List;

public class UsuarioCalorias {
    private String nombre;
    private int caloriasDesayuno;
    private int caloriasAlmuerzo;
    private int caloriasCena;
    private int totalCalorias;
    private String estadoConsumo;
    private String recomendacion;
    private List<String> alimentosRegistrados;

    // Constructor
    public UsuarioCalorias(String nombre) {
        this.nombre = nombre;
        this.caloriasDesayuno = 0;
        this.caloriasAlmuerzo = 0;
        this.caloriasCena = 0;
        this.totalCalorias = 0;
        this.estadoConsumo = "No definido";
        this.recomendacion = "";
        this.alimentosRegistrados = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCaloriasDesayuno() { return caloriasDesayuno; }
    public void setCaloriasDesayuno(int calorias) { this.caloriasDesayuno = calorias; }

    public int getCaloriasAlmuerzo() { return caloriasAlmuerzo; }
    public void setCaloriasAlmuerzo(int calorias) { this.caloriasAlmuerzo = calorias; }

    public int getCaloriasCena() { return caloriasCena; }
    public void setCaloriasCena(int calorias) { this.caloriasCena = calorias; }

    public int getTotalCalorias() { return totalCalorias; }
    
    public void calcularTotalCalorias() {
        totalCalorias = caloriasDesayuno + caloriasAlmuerzo + caloriasCena;
        actualizarEstadoConsumo();
    }

    public String getEstadoConsumo() { return estadoConsumo; }
    public String getRecomendacion() { return recomendacion; }

    private void actualizarEstadoConsumo() {
        if (totalCalorias < 1500) {
            estadoConsumo = "Bajo Consumo";
            recomendacion = "Sugerencia aumentar la ingesta de proteínas y carbohidratos";
        } else if (totalCalorias <= 2500) {
            estadoConsumo = "Consumo Adecuado";
            recomendacion = "Felicidades por mantener un balance adecuado";
        } else {
            estadoConsumo = "Exceso de Calorías";
            recomendacion = "Sugerencia reducir el consumo de grasas o realizar más actividad física";
        }
    }

    public List<String> getAlimentosRegistrados() { return alimentosRegistrados; }
    public void agregarAlimento(String alimento) { alimentosRegistrados.add(alimento); }
}
