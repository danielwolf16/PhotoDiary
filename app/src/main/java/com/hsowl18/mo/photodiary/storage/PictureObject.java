package com.hsowl18.mo.photodiary.storage;

import android.app.AppComponentFactory;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.support.v7.app.AppCompatActivity;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PictureObject{

    private static int i = 0;
    private String datelast;

    private String name;
    private Date date;
    private double shutter;
    private String f;
    private String iso;
    private double gps1;
    private double gps2;
    private String[] tags;

    public PictureObject() {

    }

    public void initialize(Object systemService, String _aperture, double _exposure, String _iso) {

        DateFormat df = new SimpleDateFormat("yyyy MM dd");
        String date = df.format(Calendar.getInstance().getTime());
        datelast = date.toString();
        if(date.equals(datelast)) {
            i++;

        } else {
            i = 1;
        }

        name = date + "_" + i;
        shutter = _exposure;
        f = _aperture;
        iso = _iso;

    }
}
