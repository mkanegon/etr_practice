package sample;
import jp.ac.kagawa_u.infoexpr.Sensor.ColorSensor;
import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;

public class LightSample {

    static ColorSensor color = new ColorSensor(SensorPort.S2);
    static float value;

    public static void main(String[] args) {
        while ( ! Button.ESCAPE.isDown() ) {
            LCD.clear();
            value = color.getLight();
            LCD.drawString(String.valueOf(value), 0, 0);
            LCD.refresh();
        }
        LCD.clear();
        LCD.refresh();
    }
}

