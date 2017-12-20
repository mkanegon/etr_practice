package sample;

import jp.ac.kagawa_u.infoexpr.Sensor.LightSensor;
import jp.ac.kagawa_u.infoexpr.Sensor.TouchSensor;
import lejos.hardware.Sound;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.RegulatedMotor;

public class Main {
    static TouchSensor touch = new TouchSensor(SensorPort.S1);
    static LightSensor rightLight = new LightSensor(SensorPort.S2);
    static LightSensor leftLight = new LightSensor(SensorPort.S3);
    static RegulatedMotor rightMotor  = Motor.B;
    static RegulatedMotor leftMotor  = Motor.C;

    public static void main(String[] args) {
        float middleValue = 0.40F;
        int lowSpeed = 600;
        int highSpeed = 1000;

        while ( ! touch.isPressed() ) {
        	// 黒&黒
            if (leftLight.getLight() < middleValue && rightLight.getLight() < middleValue) {

            }
            // 黒&白
            else if (leftLight.getLight() < middleValue && rightLight.getLight() >= middleValue) {
                motorSetSpeed(lowSpeed/6, highSpeed/2);
                motorForward();
            }
            // 白&黒
            else if (leftLight.getLight() >= middleValue && rightLight.getLight() < middleValue) {
                motorSetSpeed(highSpeed/2, lowSpeed/10);
                motorForward();
            }
            // 白&白
            else if (leftLight.getLight() >= middleValue && rightLight.getLight() >= middleValue) {
                motorSetSpeed(highSpeed, highSpeed);
                motorForward();
            }
            else {
                Sound.beep();
            }
        }
    }

    // Valueクラスに保存
    private static void motorSetSpeed(int leftMotorSpeed, int rightMotorSpeed){
        leftMotor.setSpeed(leftMotorSpeed);
        rightMotor.setSpeed(rightMotorSpeed);
    }

    private static void motorForward(){
        leftMotor.forward();
        rightMotor.forward();
    }
}
