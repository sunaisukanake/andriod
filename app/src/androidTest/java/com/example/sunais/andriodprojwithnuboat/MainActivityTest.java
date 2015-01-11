package com.example.sunais.andriodprojwithnuboat;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);

        mActivity = getActivity();
    }


    public void testHelloWorld() {

        final TextView t = (TextView) mActivity.findViewById(R.id.title);
        assertEquals("Currency Converter!",t.getText().toString());
    }

}