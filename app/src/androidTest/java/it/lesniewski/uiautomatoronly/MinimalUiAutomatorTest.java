package it.lesniewski.uiautomatoronly;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MinimalUiAutomatorTest {
    @Test
    public void checkContextsAndManipulateDevice() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("it.lesniewski.uiautomatoronly", appContext.getPackageName());

        Context testAppContext = InstrumentationRegistry.getContext();
        assertEquals("it.lesniewski.uiautomatoronly.test",  testAppContext.getPackageName());

        UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        uiDevice.wakeUp();
        uiDevice.pressMenu();
        uiDevice.pressHome();
        uiDevice.sleep();
    }
}
