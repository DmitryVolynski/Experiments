package com.example.android.experiments;

/**
 * Created by DmitryVolynski on 05.04.2017.
 */

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LocationStatusTest {
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({LOCATION_STATUS_OK, LOCATION_STATUS_SERVER_DOWN, LOCATION_STATUS_SERVER_INVALID, LOCATION_STATUS_UNKNOWN})
    public @interface LocationStatus {
    }

    public static final int LOCATION_STATUS_OK = 0;
    public static final int LOCATION_STATUS_SERVER_DOWN = 1;
    public static final int LOCATION_STATUS_SERVER_INVALID = 2;
    public static final int LOCATION_STATUS_UNKNOWN = 3;

    //public abstract void setLocationStatus(@LocationStatus int status);
    //@LocationStatus
    //public abstract int getLocationStatus();
}


