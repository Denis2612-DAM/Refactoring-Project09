package com.refactoring.projects.project09;

import java.util.List;

public class ReportGenerator {

    public void generarReporte(List<Object> datos, ReportOutput salida) {
        imprimirCabecera();
        int total = calcularTotal(datos);
        
        // Delegamos la generación a la estrategia elegida
        if (salida != null) {
            salida.generar(total);
        }
    }

    private void imprimirCabecera() {
        System.out.println("=== REPORTE ===");
    }

    private int calcularTotal(List<Object> datos) {
        int total = 0;
        for (Object dato : datos) {
            System.out.println(dato.toString());
            if (dato instanceof Integer) {
                total += (Integer) dato;
            }
        }
        System.out.println("Total calculado: " + total);
        return total;
    }
}
