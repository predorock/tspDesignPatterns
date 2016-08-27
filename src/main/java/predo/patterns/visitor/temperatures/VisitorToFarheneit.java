package predo.patterns.visitor.temperatures;

import predo.patterns.visitor.temperatures.sensors.*;

/**
 * Created by predo1 on 27/08/16.
 */
public class VisitorToFarheneit implements TemperatureVisitor {
    public float visit(SensorCelsius sensorCelsius) {
        return (float)(sensorCelsius.getTemperature() * 1.8 + 32);
    }

    public float visit(SensorFarheneit sensorFarheneit) {
        return sensorFarheneit.getTemperature();
    }

    public float visit(SensorKelvin sensorKelvin) {
        return (float)(sensorKelvin.getTemperature() * 1.8 - 459.67);
    }

    public float visit(SensorNewton sensorNewton) {
        return (float)(sensorNewton.getTemperature() * (60.0/11.0) + 32);
    }

    public float visit(SensorRankine sensorRankine) {
        return (float)(sensorRankine.getTemperature() - 459.67);
    }

    public float visit(SensorReaumur sensorReaumur) {
        return (float)(sensorReaumur.getTemperature() * 2.25 + 32);
    }

    public float visit(SensorRomer sensorRomer) {
        return (float)((sensorRomer.getTemperature() - 7.5) * (24.0/7.0) + 32);
    }
}
