package com.example.administrator.myapplication.activity;

import android.os.AsyncTask;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.myapplication.R;

public class ReadEmailActivity extends AppCompatActivity {
    private static final String TAG = ReadEmailActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_mail);
        //TODO: Khởi tạo các thành phần giao diện và tài nguyên cần thiết

    }

    protected void loadContent(final Message message) {
        AsyncTask<Void, Void, String> task = new AsyncTask<Void, Void, String>() {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                //TODO: Hiển thị progress bar
            }

            @Override
            protected String doInBackground(Void... voids) {
                //TODO: Xử lý load nội dung email cần đọc
                return null;
            }

            @Override
            protected void onPostExecute(String content) {
                super.onPostExecute(content);
                //TODO: Ẩn progress bar và xử lý load nội dụng mail trên webview
            }



        };
        task.execute();
    }

}