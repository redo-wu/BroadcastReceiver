package com.example.redo.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    protected static final String action ="com.example.redo.broadcastreceiver.receiver.action.MyReceiver";
    
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("myreceiver接收到了消息");
        abortBroadcast();
    }
    
}
