package com.dominicodev.advancedreboot;


import android.content.Context;
import android.content.DialogInterface;
import android.os.PowerManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclickReboot(View view) {

        AlertDialog.Builder reboot = new AlertDialog.Builder(this);
        reboot.setTitle(R.string.reboot);
        reboot.setMessage(R.string.rebootMessage);

        reboot.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
                powerManager.reboot(null);

            }
        });

        reboot.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = reboot.create();
        dialog.show();
    }


    public void onclickRecovery(View view) {
        AlertDialog.Builder reboot = new AlertDialog.Builder(this);
        reboot.setTitle(R.string.reboot_to_recovery);
        reboot.setMessage(R.string.rebootToRecoveryMessage);

        reboot.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
                powerManager.reboot("recovery");
            }
        });

        reboot.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = reboot.create();
        dialog.show();
    }

    public void onclickBootloader(View view) {
        AlertDialog.Builder reboot = new AlertDialog.Builder(this);
        reboot.setTitle(R.string.reboot_to_bootloader);
        reboot.setMessage(R.string.rebootToBootloaderMessage);

        reboot.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
                powerManager.reboot("bootloader");
            }
        });

        reboot.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = reboot.create();
        dialog.show();
    }
}