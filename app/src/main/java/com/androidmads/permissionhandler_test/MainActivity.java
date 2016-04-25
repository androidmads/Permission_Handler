package com.androidmads.permissionhandler_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidmads.permissionhandler.library.PermissionHandler;
import com.androidmads.permissionhandler.library.Permissions;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer[] perms = {Permissions.ACCESS_COARSE_LOCATION, Permissions.CALL_PHONE, Permissions.SEND_SMS, Permissions.CAMERA};
        PermissionHandler permissionHandler = new PermissionHandler(MainActivity.this);
        Log.v("DATA", Arrays.toString(perms));
        permissionHandler.isPermissionGranted(perms);

    }
}
