package com.example.luisa.myappportfolio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View v) {
        int textResourceId = -1;
        switch (v.getId()) {
            case R.id.media_streamer:
                textResourceId = R.string.main_activity_spotify_app_name;
                break;
            case R.id.super_do1:
                textResourceId = R.string.main_activity_super_dou_app_name;
                break;
            case R.id.super_do2:
                textResourceId = R.string.main_activity_build_app_name;
                break;
            case R.id.ant_terminator:
                textResourceId = R.string.main_activity_build_app_name;
                break;
            case R.id.materialize:
                textResourceId = R.string.main_activity_xyz_app_name;
                break;
            case R.id.capstone:
                textResourceId = R.string.main_activity_capstone_app_name;
                break;
            default:
                break;
        }
        Resources resources = getResources();
        showToast(resources.getString(R.string.main_activity_button_toast_description) + " " + getResources().getString(textResourceId));
    }

    private void showToast(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
}
