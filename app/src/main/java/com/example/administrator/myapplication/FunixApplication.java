package com.example.administrator.myapplication;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.myapplication.configuration.EmailConfiguration;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Store;

public class FunixApplication extends Application {

    private static final String TAG = FunixApplication.class.getSimpleName();

    private Message mMessage;

    private Store mStore;

    public FunixApplication() {
        super();
        EmailConfiguration receiver = new EmailConfiguration();
        Store store = null;
        try {
            store = receiver.getStore();
        } catch (MessagingException e) {
            Log.e(TAG, "store error!");
        }
        mStore = store;
    }


    public Message getMessage() {
        return mMessage;
    }

    public void setMessage(Message message) {
        this.mMessage = message;
    }

    public Store getStore() {
        return mStore;
    }
}