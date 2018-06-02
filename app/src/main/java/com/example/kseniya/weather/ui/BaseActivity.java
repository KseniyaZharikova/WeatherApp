package com.example.kseniya.weather.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    private ProgressDialog mDialog;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected void showProgressBar() {
        if (mDialog == null) {
            mDialog = new ProgressDialog(this);
            mDialog.setMessage(" Загрузка погоды ");
            mDialog.show();
        }
    }

    protected void dismissProgressBar() {
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.dismiss();

        }
        mDialog = null;
    }

}