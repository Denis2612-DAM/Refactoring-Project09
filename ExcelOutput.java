package com.refactoring.projects.project09;

public class ExcelOutput implements ReportOutput {
    @Override
    public void generar(int total) {
        System.out.println("Generando Excel con total: " + total);
    }
}
