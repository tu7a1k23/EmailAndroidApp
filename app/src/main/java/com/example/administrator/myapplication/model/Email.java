package com.example.administrator.myapplication.model;

import javax.mail.Message;

public class Email {
    private String mSubject;
    private String mSender;
    private String mTime;
    private Message mMessage;

    public Email(String subject, String sender, String time, Message message) {
        this.mSubject = subject;
        this.mSender = sender;
        this.mTime = time;
        this.mMessage = message;
    }


    public String getSubject() {
        return mSubject;
    }

    public String getSender() {
        return mSender;
    }

    public String getTime() {
        return mTime;
    }

    public Message getMessage() {
        return mMessage;
    }
}
