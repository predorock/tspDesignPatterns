package predo.patterns;

import jdk.nashorn.internal.runtime.ECMAErrors;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import predo.patterns.state.phones.Employee;
import predo.patterns.state.phones.Nokia3310;
import predo.patterns.state.phones.iPhone;
import predo.patterns.state.simple.Context;
import predo.patterns.state.simple.EndState;
import predo.patterns.state.simple.StartState;
import predo.patterns.state.simple.WorkingState;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by predo1 on 18/08/16.
 */
public class TestStatePattern {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testSimpleState(){
        Context context = new Context();
        assertNull(context.getState());
        context.setState(new StartState());
        assertTrue(context.getState().getClass().getSimpleName().compareTo(StartState.class.getSimpleName())==0);
        context.setState(new WorkingState());
        assertTrue(context.getState().getClass().getSimpleName().compareTo(WorkingState.class.getSimpleName())==0);
        context.setState(new EndState());
        assertTrue(context.getState().getClass().getSimpleName().compareTo(EndState.class.getSimpleName())==0);
    }

    @Test
    public void testPhoneStatePattern(){
        Employee employee = new Employee();
        assertNull(employee.getPhone());

        employee.setPhone(new iPhone());
        assertTrue(employee.takePhoto() != null);

        employee.sms();
        assertTrue(outContent.toString().length() != 0);
        employee.lte();
        assertTrue(outContent.toString().length() != 0);
        employee.call();
        assertTrue(outContent.toString().length() != 0);
        employee.ggg();
        assertTrue(outContent.toString().length() != 0);

        outContent.reset();

        employee.setPhone(new Nokia3310());
        employee.call();
        assertTrue(outContent.toString().length() != 0);
        employee.sms();
        assertTrue(outContent.toString().length() != 0);

        outContent.reset();

        employee.mms();
        assertTrue(outContent.toString().length() == 0);
        employee.ggg();
        assertTrue(outContent.toString().length() == 0);
        employee.lte();
        assertTrue(outContent.toString().length() == 0);
        assertNull(employee.takePhoto());

    }
}
