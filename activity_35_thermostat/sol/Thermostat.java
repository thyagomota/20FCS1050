/*
 * CS 1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 35 - Thermostat
 */

public class Thermostat {

    protected double  setPoint;
    protected double  temperature;
    protected boolean heating;
    protected static  final double MIN_HEATING_SET_POINT = 59;
    protected static  final double MAX_HEATING_SET_POINT = 90.5;
    protected static  final double TEMPERATURE_DELTA     = 2;

    public Thermostat(double setPoint) {
        if (setPoint < Thermostat.MIN_HEATING_SET_POINT)
            this.setPoint = Thermostat.MIN_HEATING_SET_POINT;
        else if (setPoint > Thermostat.MAX_HEATING_SET_POINT)
            this.setPoint = Thermostat.MAX_HEATING_SET_POINT;
        else
            this.setPoint = setPoint;
        heating = false;
        temperature = new java.util.Random().nextInt(100);
    }

    public void checkTemperature() {
        if (temperature - setPoint > Thermostat.TEMPERATURE_DELTA)
            heating = false;
        else if (setPoint - temperature > Thermostat.TEMPERATURE_DELTA)
            heating = true;
    }

    public double getSetPoint() { return setPoint; }

    public void setSetPoint(double setPoint) {
        if (setPoint >= Thermostat.MAX_HEATING_SET_POINT && setPoint <= Thermostat.MAX_HEATING_SET_POINT)
            this.setPoint = setPoint;
    }

    public double getTemperature() { return temperature; }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}