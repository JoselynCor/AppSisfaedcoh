

/*
 * Created by rogergcc 27/10/19 07:20 PM
 * Copyright Ⓒ 2019 . All rights reserved.
 * 27/10/19 07:19 PM
 */

package com.rogergcc.sisfaedcoh;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.rogergcc.sisfaedcoh", appContext.getPackageName());
    }
}
