package com.refactoring.projects.project09;

public class PdfOutput implements ReportOutput {
    @Override
    public void generar(int total) {
        System.out.println("Generando PDF con total: " + total);
    }
}
