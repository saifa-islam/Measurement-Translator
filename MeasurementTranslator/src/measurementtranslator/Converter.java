/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package measurementtranslator;

/**
 *
 * @author UAE LAPTOP BAZAR
 */
class Converter {
    public static double convertTemperature(double value, String fromUnit, String toUnit) {
    if (fromUnit.equals("Celsius") && toUnit.equals("Fahrenheit")) {
        return value * 9 / 5 + 32;
    } else if (fromUnit.equals("Fahrenheit") && toUnit.equals("Celsius")) {
        return (value - 32) * 5 / 9;
    } else if (fromUnit.equals("Celsius") && toUnit.equals("Kelvin")) {
        return value + 273.15;
    } else if (fromUnit.equals("Kelvin") && toUnit.equals("Celsius")) {
        return value - 273.15;
    }
    return value; // If no conversion, return the same value
}

    static double convertVolume(double inputValue, String fromUnit, String toUnit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static double convertSpeed(double inputValue, String fromUnit, String toUnit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static double convertTime(double inputValue, String fromUnit, String toUnit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static double convertArea(double inputValue, String fromUnit, String toUnit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static double convertPressure(double inputValue, String fromUnit, String toUnit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
