package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setTitle("Compose email");
        setSupportActionBar(toolbar);
        //TODO: Khởi tạo thành phần giao diện và tài nguyên cần thiết

    }


    private void sendEmail() {
        //TODO: Xử lý logic gửi mail
        String[] TO = {""};

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email", "");
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(SendEmailActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
}

    private class SendMail extends AsyncTask<Void, Void, Boolean> {
        Activity context;
        String receiver;
        String title;
        String content;
        String from;
        String password;

        public SendMail(Activity context, String receiver, String title, String content, String from, String password) {
            this.context = context;
            this.receiver = receiver;
            this.title = title;
            this.content = content;
            this.from = from;
            this.password = password;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //TODO: Hiển thị progress bar
        }

        @Override
        protected void onPostExecute(Boolean aVoid) {
            super.onPostExecute(aVoid);
            //TODO: Ẩn progress bar
        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            //TODO: Xử lý logic gửi mail

            return true;
        }

    }
}
