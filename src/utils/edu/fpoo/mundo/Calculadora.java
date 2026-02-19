/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utils.edu.fpoo.mundo;


/**
 *
 * @author Ayala
 */
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora {
    // Simulación de una calculadora
    private double m_operando1;
    private double m_operando2;
    private double m_resultado;

    public double getM_operando1() {
        return m_operando1;
    }

    public void setM_operando1(double m_operando1) {
        this.m_operando1 = m_operando1;
        
    }

    public double getM_operando2() {
        return m_operando2;
    }

    public void setM_operando2(double m_operando2) {
        this.m_operando2 = m_operando2;
    }

    public void EstablecerOperandos(double opl, double op2) {
        m_operando1 = opl;
        m_operando2 = op2;
    }

    public double Resultado() {
        return m_resultado;
    }

    public double Sumar() {
        m_resultado = m_operando1 + m_operando2;
        return m_resultado;
    }

    public double Restar() {
        m_resultado = m_operando1 - m_operando2;
        return m_resultado;
    }

    public double Multiplicar() {
        m_resultado = m_operando1 * m_operando2;
        return m_resultado;
    }

    public double Dividir() {
        m_resultado = m_operando1 / m_operando2;
        return m_resultado;
    }


    
    
    
    
    
    
}