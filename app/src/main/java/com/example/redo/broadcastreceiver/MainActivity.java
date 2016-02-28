package com.example.redo.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MyReceiver receiver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSendMsg).setOnClickListener(this);
        findViewById(R.id.btnReg).setOnClickListener(this);
        findViewById(R.id.btnUnreg).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSendMsg:
                Intent i = new Intent(MyReceiver.action);
//                i.putExtra("data", "massege");
//                sendBroadcast(i);
                sendOrderedBroadcast(i, null);
                break;
            case R.id.btnReg:
                if (receiver == null) {
                    receiver = new MyReceiver();
                    registerReceiver(receiver, new IntentFilter(MyReceiver.action));
                }
                break;
            case R.id.btnUnreg:
                if (receiver != null) {
                    unregisterReceiver(receiver);
                    receiver = null;
                }
                break;
        }
    }
}
