package edu.sjsu.posturize.posturize.SexyData;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Matthew on 8/28/2017.
 *
 * TODO:
 * DONE - Create Object to manage daily posture activity
 * DONE - Create method to add measurement with timestamp.
 * Create method to get date
 *
 */

/**
 * DailyPosture tracks the posture measurements for a given day.
 */
public class DailyPosture {
    private Date date;
    private ArrayList<PostureMeasurement> measurements;

    DailyPosture(){
        measurements = new ArrayList<PostureMeasurement>();
    }

    public void addMeasurement(float distance){
        if((new Date()).compareTo(date) != 0){ //different day, reset daily object
            date = new Date();
            measurements.clear();
        }
        measurements.add(new PostureMeasurement(new Date(), distance));
    }

    public Date getDate(){
        return date;
    }
}
