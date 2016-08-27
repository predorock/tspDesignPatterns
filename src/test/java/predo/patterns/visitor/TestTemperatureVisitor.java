package predo.patterns.visitor;
import static org.junit.Assert.*;

import org.junit.Test;
import predo.patterns.visitor.temperatures.*;
import predo.patterns.visitor.temperatures.sensors.*;

/**
 * Created by predo1 on 27/08/16.
 */
public class TestTemperatureVisitor {

    @Test
    public void test() {
        AbstractSensor sensor = new SensorCelsius(20);
        assertEquals(68.0, sensor.accept(new VisitorToFarheneit()), 0.0);
        assertEquals(293.15, sensor.accept(new VisitorToKelvin()), 0.1);

        sensor = new SensorFarheneit(32);
        assertEquals(32.0, sensor.accept(new VisitorToFarheneit()), 0.0);
        assertEquals(273.15, sensor.accept(new VisitorToKelvin()), 0.1);

        sensor = new SensorKelvin(20);
        assertEquals(-423.67, sensor.accept(new VisitorToFarheneit()), 0.1);
        assertEquals(20.0, sensor.accept(new VisitorToKelvin()), 0.1);

        sensor = new SensorNewton(20);
        assertEquals(141.09, sensor.accept(new VisitorToFarheneit()), 0.1);
        assertEquals(333.75, sensor.accept(new VisitorToKelvin()), 0.1);

        sensor = new SensorRankine(20);
        assertEquals(-439.67, sensor.accept(new VisitorToFarheneit()), 0.1);
        assertEquals(11.11, sensor.accept(new VisitorToKelvin()), 0.1);

        sensor = new SensorReaumur(20);
        assertEquals(77, sensor.accept(new VisitorToFarheneit()), 0.1);
        assertEquals(298.15, sensor.accept(new VisitorToKelvin()), 0.1);

        sensor = new SensorRomer(20);
        assertEquals(74.85, sensor.accept(new VisitorToFarheneit()), 0.1);
        assertEquals(296.95, sensor.accept(new VisitorToKelvin()), 0.1);
    }
}
