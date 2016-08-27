package predo.patterns.visitor.temperatures;

import predo.patterns.visitor.temperatures.sensors.*;

/**
 * Created by predo1 on 27/08/16.
 */
public interface TemperatureVisitor {

    float visit(SensorCelsius sensorCelsius);

    float visit(SensorFarheneit sensorFarheneit);

    float visit(SensorKelvin sensorKelvin);

    float visit(SensorNewton sensorNewton);

    float visit(SensorRankine sensorRankine);

    float visit(SensorReaumur sensorReaumur);

    float visit(SensorRomer sensorRomer);
}
