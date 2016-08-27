package predo.patterns.visitor.temperatures.sensors;

import predo.patterns.visitor.temperatures.TemperatureVisitor;

/**
 * Created by predo1 on 27/08/16.
 */
public abstract class AbstractSensor {

    private float temperature;

    public AbstractSensor(float temperature){
        this.temperature = temperature;
    }

    public float getTemperature(){
        return this.temperature;
    }

    public abstract float accept(TemperatureVisitor visitor);
}
