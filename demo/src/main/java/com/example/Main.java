package com.example;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Juan Pérez", "PROF001", 2500.0, 30, true);
        Profesor profesor2 = new Profesor("María García", "PROF002", 3000.0);
        Profesor profesor3 = new Profesor();
        Profesor profesor4 = new Profesor("Carlos López", "PROF004");

        System.out.println("\n=== Información de Profesores ===");
        System.out.println("\nProfesor 1:");
        profesor1.mostrarInformacion();
        
        System.out.println("\nProfesor 2:");
        profesor2.mostrarInformacion();
        
        System.out.println("\nProfesor 3 (constructor vacío):");
        profesor3.mostrarInformacion();
        
        System.out.println("\nProfesor 4:");
        profesor4.mostrarInformacion();

        System.out.println("\n=== Cálculos de Salario Anual ===");
        System.out.println("Salario anual básico: " + profesor1.calcularSalarioAnual());
        System.out.println("Salario anual con bono de 1000: " + profesor1.calcularSalarioAnual(1000.0));
        System.out.println("Salario por 6 meses: " + profesor1.calcularSalarioAnual(6));

        System.out.println("\n=== Evaluación de Carga Horaria ===");
        System.out.println("Evaluación estándar: " + profesor1.evaluarCargaHoraria());
        System.out.println("Evaluación con límite de 25 horas: " + profesor1.evaluarCargaHoraria(25));

        System.out.println("\n=== Cálculo de Horas Anuales ===");
        System.out.println("Horas anuales del profesor 1: " + profesor1.calcularHorasAnuales());

        System.out.println("\n=== Asignación de Curso ===");
        Curso cursoMatematicas = new Curso();
        cursoMatematicas.setNombreCurso("Matemáticas Avanzadas");
        profesor1.asignarCurso(cursoMatematicas);
        cursoMatematicas.mostrarInformacionCurso();

        System.out.println("\n=== Modificación de Horas Semanales ===");
        try {
            System.out.println("Horas semanales actuales: " + profesor2.getHorasSemanales());
            profesor2.asignarHorasSemanales(35);
            System.out.println("Nuevas horas semanales: " + profesor2.getHorasSemanales());
            System.out.println("Información actualizada del profesor 2:");
            profesor2.mostrarInformacion();   
        } catch (IllegalArgumentException e) {
            System.out.println("Error al asignar horas: " + e.getMessage());
        }
    }
}

