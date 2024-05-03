/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author keiver
 */

public class Operaciones {
    private double num1, num2;
    
   public Operaciones() {

    }
    
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    
    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double calcularPorcentaje(double num, double porcentaje) {
        return (num * porcentaje) / 100;
    }
    
    @Override
    public String toString() {
        return "Operaciones{" + "num1=" + num1 + ", num2=" + num2 + "}";
    }
}
