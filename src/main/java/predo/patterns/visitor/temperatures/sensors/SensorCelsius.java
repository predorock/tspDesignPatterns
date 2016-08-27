package predo.patterns.visitor.temperatures.sensors;

import predo.patterns.visitor.temperatures.TemperatureVisitor;

/**
 * Created by predo1 on 27/08/16.
 */
public class SensorCelsius extends AbstractSensor {

    public SensorCelsius(float  temp) {
        super(temp);
    }

    public float accept(TemperatureVisitor visitor) {
        return visitor.visit(this);
    }
}
