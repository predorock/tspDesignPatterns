package predo.patterns.visitor.temperatures;

import predo.patterns.visitor.temperatures.sensors.*;

/**
 * Created by predo1 on 27/08/16.
 */
public class VisitorToKelvin implements TemperatureVisitor {

    public float visit(SensorCelsius sensorCelsius) {
        return (float)(sensorCelsius.getTemperature() + 273.15);
    }

    public float visit(SensorFarheneit sensorFarheneit) {
        return (float)((sensorFarheneit.getTemperature() + 459.67) * (5.0/9.0));
    }

    public float visit(SensorKelvin sensorKelvin) {
        return (float)(sensorKelvin.getTemperature());
    }

    public float visit(SensorNewton sensorNewton) {
        return (float)(sensorNewton.getTemperature() * (100.0/33.0) + 273.15);
    }

    public float visit(SensorRankine sensorRankine) {
        return (float)(sensorRankine.getTemperature() * (5.0/9.0));
    }

    public float visit(SensorReaumur sensorReaumur) {
        return (float)(sensorReaumur.getTemperature() * 1.25 + 273.15);
    }

    public float visit(SensorRomer sensorRomer) {
        return (float)((sensorRomer.getTemperature() - 7.5) * (40.0/21.0) + 273.15);
    }
}
