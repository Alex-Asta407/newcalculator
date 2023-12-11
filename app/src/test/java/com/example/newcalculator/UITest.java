package com.example.newcalculator;

import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class UITest {

    private UiDevice device;

    @Before
    public void setUp() throws RemoteException {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        if (!device.isScreenOn()) {
            device.wakeUp();
        }

        try {
            device.executeShellCommand("input keyevent KEYCODE_WAKEUP");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            device.executeShellCommand("input keyevent KEYCODE_MENU");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCalculator() {
        clickButton("btnOne");
        clickButton("btnPlus");
        clickButton("btnTwo");
        clickButton("btnThree");
        clickButton("btnEqual");

        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("24");
    }

    @Test
    public void testCalculatorMultiplication() {
        // Perform multiplication calculation
        clickButton("btnFour");
        clickButton("btnMultiplication");
        clickButton("btnTwo");
        clickButton("btnEqual");

        // Verify the result
        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("8");
    }

    @Test
    public void testCalculatorDivision() {
        // Perform division calculation
        clickButton("btnEight");
        clickButton("btnDivision");
        clickButton("btnTwo");
        clickButton("btnEqual");

        // Verify the result
        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("4");
    }

    @Test
    public void testCalculatorDecimalPoint() {
        // Test decimal point input
        clickButton("btnFive");
        clickButton("btnDot");
        clickButton("btnTwo");

        // Verify the result
        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("5.2");
    }

    @Test
    public void testDigitButtons() {
        // Test pressing all digit buttons (0-9)
        clickButton("btnZero");
        clickButton("btnOne");
        clickButton("btnTwo");
        clickButton("btnThree");
        clickButton("btnFour");
        clickButton("btnFive");
        clickButton("btnSix");
        clickButton("btnSeven");
        clickButton("btnEight");
        clickButton("btnNine");

        // Verify the result
        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("0123456789");
    }
    @Test
    public void testCalculatorBack() {
        clickButton("btnOne");
        clickButton("btnPlus");
        clickButton("btnTwo");
        clickButton("btnBack");

        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("1");
    }
    @Test
    public void testCalculatorSignChange() {
        clickButton("btnOne");
        clickButton("btnPlus");
        clickButton("btnTwo");

        // Click on Sign Change button
        clickButton("btnSignChange");
        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("-1+2");
    }
    @Test
    public void testCalculatorSquareRoot() {
        // Perform a calculation
        clickButton("btnNine");
        clickButton("btnSquareRoot");

        // Verify the result EditText shows the square root
        UiObject2 resultEditText = device.findObject(By.res("com.example.newcalculator:id/results"));
        assert resultEditText != null;
        assert resultEditText.getText().equals("√9");
    }
    private void clickButton(String buttonId) {
        UiObject2 button = device.findObject(By.res("com.example.newcalculator:id/" + buttonId));
        assert button != null;
        button.click();
    }
}

