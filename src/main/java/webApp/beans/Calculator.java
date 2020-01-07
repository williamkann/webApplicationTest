/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webApp.beans;

/**
 *
 * @author willi
 */
public class Calculator {
    
    private double number1;
    private double number2;
    private String symbole;
    private double result;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public double addition(double a, double b) {
        return a+b;
    }
    
    public double substraction(double a, double b) {
        return a-b;
    }
    
    public double multiplication(double a, double b) {
        return a*b;
    }
    
    public double division(double a, double b) {
        return a/b;
    }
}
