package edu.sjsu.posturize.posturize.SexyData;

import java.util.Date;

/**
 * Created by Matthew on 8/28/2017.
 */

/**
 * PostureMeasurement stores a distant measurement (float) and with a timestamp.
 */
public class PostureMeasurement {
    private Date timestamp;
    private float distance;

    PostureMeasurement(Date date, float distance){
        this.timestamp = date;
        this.distance = distance;
    }
}
