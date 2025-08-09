package com.example;

public class Profesor {
    private String nombre;
    private String numeroIdentificacion;
    private double salarioMensual;
    private int horasSemanales;
    private boolean esTiempoCompleto;

    public Profesor(String nombre, String numeroIdentificacion, double salarioMensual, int horasSemanales,
            boolean esTiempoCompleto) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.salarioMensual = salarioMensual;
        this.horasSemanales = horasSemanales;
        this.esTiempoCompleto = esTiempoCompleto;
    }

    public Profesor(String nombre, String numeroIdentificacion, double salarioMensual) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.salarioMensual = salarioMensual;
        this.horasSemanales = 20;
        this.esTiempoCompleto = false;
    }

    public Profesor() {
        this.nombre = "Sin nombre";
        this.numeroIdentificacion = "Sin identificación";
        this.salarioMensual = 0.0;
        this.horasSemanales = 0;
        this.esTiempoCompleto = false;
    }

    public Profesor(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.salarioMensual = 0.0;
        this.horasSemanales = 10;
        this.esTiempoCompleto = false;
    }

public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Número de identificación: " + numeroIdentificacion);
    System.out.println("Salario mensual: " + salarioMensual);
    System.out.println("Horas semanales: " + horasSemanales);
    System.out.println("Es tiempo completo: " + esTiempoCompleto);
}
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    public double calcularSalarioAnual(double bonoAnual) {
        return (salarioMensual * 12) + bonoAnual;
    }

    public double calcularSalarioAnual(int meses) {
        return salarioMensual * meses;
    }

    public int asignarHorasSemanales(int horas) {
        if (horas < 0 || horas > 40) {
            throw new IllegalArgumentException("Las horas semanales deben estar entre 0 y 40.");
        }
        this.horasSemanales = horas;
        return this.horasSemanales;
    }

    public String evaluarCargaHoraria() {
        if (this.horasSemanales <= 20) {
            return "Carga normal";
        } else {
            return "Carga alta";
        }
    }

    public String evaluarCargaHoraria(int limiteHoras) {
        if (this.horasSemanales <= limiteHoras) {
            return "Carga normal";
        } else {
            return "Carga alta";
        }
    }

    public void asignarCurso(Curso curso) {
        curso.asignarProfesor(this);
    }

    public int calcularHorasAnuales() {
        return horasSemanales * 40;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        if (numeroIdentificacion == null) {
            throw new IllegalArgumentException("El número de identificación no puede estar vacío");
        }
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual < 0) {
            throw new IllegalArgumentException("El salario mensual no puede ser negativo");
        }
        this.salarioMensual = salarioMensual;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        if (horasSemanales < 0 || horasSemanales > 40) {
            throw new IllegalArgumentException("Las horas semanales deben estar entre 0 y 40");
        }
        this.horasSemanales = horasSemanales;
    }
}
