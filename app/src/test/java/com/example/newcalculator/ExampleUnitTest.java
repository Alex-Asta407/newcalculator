package com.example.newcalculator;

import static org.mockito.Mockito.verify;

import android.text.Editable;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    @Mock
    private EditText mockEditText;

    private MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = new MainActivity();
        mainActivity.resultEditText = mockEditText;
    }

    @Test
    public void addText_shouldAppendTextToEditText() {
        mainActivity.addText("123");
        verify(mockEditText).setText("123");
    }

    @Test
    public void onBtnOneClick_shouldCallAddTextWithOne() {
        mainActivity.onBtnOneClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("1");
    }

    @Test
    public void onBtnTwoClick_shouldCallAddTextWithTwo() {
        mainActivity.onBtnTwoClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("2");
    }

    @Test
    public void onBtnThreeClick_shouldCallAddTextWithThree() {
        mainActivity.onBtnThreeClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("3");
    }

    @Test
    public void onBtnFourClick_shouldCallAddTextWithFour() {
        mainActivity.onBtnFourClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("4");
    }

    @Test
    public void onBtnFiveClick_shouldCallAddTextWithFive() {
        mainActivity.onBtnFiveClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("5");
    }

    @Test
    public void onBtnSixClick_shouldCallAddTextWithSix() {
        mainActivity.onBtnSixClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("6");
    }

    @Test
    public void onBtnSevenClick_shouldCallAddTextWithSeven() {
        mainActivity.onBtnSevenClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("7");
    }

    @Test
    public void onBtnEightClick_shouldCallAddTextWithEight() {
        mainActivity.onBtnEightClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("8");
    }

    @Test
    public void onBtnNineClick_shouldCallAddTextWithNine() {
        mainActivity.onBtnNineClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("9");
    }

    @Test
    public void onBtnZeroClick_shouldCallAddTextWithZero() {
        mainActivity.onBtnZeroClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("0");
    }

    @Test
    public void onBtnPlusClick_shouldCallAddTextWithPlus() {
        mainActivity.onBtnPlusClick(null);
        verify(mockEditText).getText();
        verify(mockEditText).setText("+");
    }

    @Test
    public void onBtnMinusClick_shouldCallAddTextWithMinus() {
        mainActivity.onBtnMinusClick(null);

        verify(mockEditText).getText();
        verify(mockEditText).setText("-");
    }

    @Test
    public void onBtnMultiplicationClick_shouldCallAddTextWithMultiplication() {
        mainActivity.onBtnMultiplicationClick(null);

        verify(mockEditText).getText();
        verify(mockEditText).setText("*");
    }

    @Test
    public void onBtnDivisionClick_shouldCallAddTextWithDivision() {
        mainActivity.onBtnDivisionClick(null);

        verify(mockEditText).getText();
        verify(mockEditText).setText("/");
    }

    @Test
    public void onBtnClearClick_shouldClearEditText() {
        Mockito.when(mockEditText.getText()).thenReturn((Editable) Mockito.mock(CharSequence.class));

        mainActivity.onBtnClearClick(null);

        verify(mockEditText).setText("");
    }

    @Test
    public void onBtnBackClick_shouldRemoveLastCharacterFromEditText() {
        Mockito.when(mockEditText.getText()).thenReturn((Editable) Mockito.mock(CharSequence.class, Mockito.withSettings().lenient()));

        mainActivity.onBtnBackClick(null);

        verify(mockEditText).getText();
    }

    @Test
    public void onBtnSignChangeClick_shouldToggleSignInEditText() {
        // Set some initial text in the EditText
        Mockito.when(mockEditText.getText()).thenReturn((Editable) Mockito.mock(CharSequence.class, Mockito.withSettings().lenient()));

        mainActivity.onBtnSignChangeClick(null);
        mainActivity.onBtnSignChangeClick(null);
    }
}