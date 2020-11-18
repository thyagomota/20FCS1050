public class HeatingAndCoolingThermostat extends Thermostat {

    private boolean coolingMode;
    private boolean cooling;
    private static  final double MIN_COOLING_SET_POINT = 41;
    private static  final double MAX_COOLING_SET_POINT = 59;

    public HeatingAndCoolingThermostat(double setPoint) {
        super(setPoint);
        coolingMode = false;
        cooling = false;
    }

    @Override
    public void setSetPoint(double setPoint) {
        if (!coolingMode)
            super.setSetPoint(setPoint);
        else {
            if (setPoint >= MIN_COOLING_SET_POINT && setPoint <= MAX_COOLING_SET_POINT)
                this.setPoint = setPoint;
        }
    }

    @Override
    public void checkTemperature() {
        if (!coolingMode)
            super.checkTemperature();
        else {
            if (temperature - setPoint > Thermostat.TEMPERATURE_DELTA)
                cooling = true;
            else if (setPoint - temperature > Thermostat.TEMPERATURE_DELTA)
                cooling = true;
        }
    }

    public void switchMode() {
        if (coolingMode) {
            cooling = false;
            coolingMode = false;
            setSetPoint(Thermostat.MAX_HEATING_SET_POINT);
        }
        else {
            heating = false;
            coolingMode = true;
            setSetPoint(HeatingAndCoolingThermostat.MIN_COOLING_SET_POINT);
        }
    }
}
