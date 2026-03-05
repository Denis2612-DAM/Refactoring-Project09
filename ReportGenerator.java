package com.refactoring.projects.project09;

import java.util.List;

public class ReportGenerator {

    public void generarReporte(List datos, String formato) {
        System.out.println("=== REPORTE ===");
        int total = 0;
        for (Object dato : datos) {
            System.out.println(dato.toString());
            if (dato instanceof Integer) {
                total += (Integer) dato;
            }
        }
        System.out.println("Total: " + total);
        
        if (formato.equals("pdf")) {
            System.out.println("Generando PDF...");
        } else if (formato.equals("excel")) {
            System.out.println("Generando Excel...");
        }
    }
}
