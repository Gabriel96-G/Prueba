package semana02;

import utilitarios.Utils;

public class Ejercicio12 {

    public static void main(String[] args) {

        double montoSalario = Utils.leerDoble("Ingrese el monto del salario por hora");
        double marcaEntrada = Utils.leerDoble("Ingrese la hora de entrada");
        double marcaSalida = Utils.leerDoble("Ingrese la hora de salida");

        double horasTrabajadas = marcaSalida - marcaEntrada;
        double salario = horasTrabajadas * montoSalario;

        System.out.println("Horas trabajadas corresponden a: " + horasTrabajadas + " horas. Salario correspondiente: " + salario);
    }
}