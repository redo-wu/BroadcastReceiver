package com.example.redo.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver1 extends BroadcastReceiver {
    protected static final String action1 = "com.example.redo.broadcastreceiver.receiver.action.MyReceiver1";

    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        System.out.println("myreceiver1接收到了消息");
    }
}
