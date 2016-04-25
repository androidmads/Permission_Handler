package com.androidmads.permissionhandler.library;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;

import java.util.ArrayList;

/**
 * Created by MUSHTAQ M A on 03-02-2016.
 */
public class PermissionHandler {

    Activity activity;
    String[] perms;

    public PermissionHandler(Activity activity) {
        this.activity = activity;
    }

    public boolean isPermissionGranted(Integer[] permissions) {

        ArrayList<String> permsList = addPermissions(permissions);
        perms = permsList.toArray(new String[permsList.size()]);
        boolean granted = false;

        if(isMarshmallow()) {
            for (String perm : perms) {
                int result = ActivityCompat.checkSelfPermission(activity, perm);

                if (result == PackageManager.PERMISSION_GRANTED) {
                    granted = true;
                } else if (result == PackageManager.PERMISSION_DENIED) {
                    ActivityCompat.requestPermissions(activity, new String[]{perm}, 1);
                }

            }
        } else{
            granted = false;
        }

        return granted;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
    public ArrayList<String> addPermissions(Integer[] permissions) {

        ArrayList<String> permsList = new ArrayList<>();
        for (Integer permission : permissions) {
            if (permission == 0)
                permsList.add(Manifest.permission.READ_CALENDAR);
            if (permission == 1)
                permsList.add(Manifest.permission.WRITE_CALENDAR);
            if (permission == 2)
                permsList.add(Manifest.permission.CAMERA);
            if (permission == 3)
                permsList.add(Manifest.permission.READ_CONTACTS);
            if (permission == 4)
                permsList.add(Manifest.permission.WRITE_CONTACTS);
            if (permission == 5)
                permsList.add(Manifest.permission.GET_ACCOUNTS);
            if (permission == 6)
                permsList.add(Manifest.permission.ACCESS_COARSE_LOCATION);
            if (permission == 7)
                permsList.add(Manifest.permission.ACCESS_FINE_LOCATION);
            if (permission == 8)
                permsList.add(Manifest.permission.RECORD_AUDIO);
            if (permission == 9)
                permsList.add(Manifest.permission.CALL_PHONE);
            if (permission == 10)
                permsList.add(Manifest.permission.READ_PHONE_STATE);
            if (permission == 11)
                permsList.add(Manifest.permission.READ_CALL_LOG);
            if (permission == 12)
                permsList.add(Manifest.permission.WRITE_CALL_LOG);
            if (permission == 13)
                permsList.add(Manifest.permission.ADD_VOICEMAIL);
            if (permission == 14)
                permsList.add(Manifest.permission.USE_SIP);
            if (permission == 15)
                permsList.add(Manifest.permission.PROCESS_OUTGOING_CALLS);
            if (permission == 16)
                permsList.add(Manifest.permission.BODY_SENSORS);
            if (permission == 17)
                permsList.add(Manifest.permission.SEND_SMS);
            if (permission == 18)
                permsList.add(Manifest.permission.RECEIVE_SMS);
            if (permission == 19)
                permsList.add(Manifest.permission.READ_SMS);
            if (permission == 20)
                permsList.add(Manifest.permission.RECEIVE_WAP_PUSH);
            if (permission == 21)
                permsList.add(Manifest.permission.RECEIVE_MMS);
            if (permission == 22)
                permsList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
            if (permission == 23)
                permsList.add(Manifest.permission.READ_EXTERNAL_STORAGE);
        }

        return permsList;
    }

    public boolean isMarshmallow() {

        return (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1);

    }

}
