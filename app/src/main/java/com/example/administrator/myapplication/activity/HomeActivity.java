package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.model.Email;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //TODO Khởi tạo tài nguyên, các thành phần giao diện và cài đặt sự kiện

    }

    @Override
    protected void onResume() {
        super.onResume();
        //TODO: Kiểm tra điều kiện network và trạng thái đăng nhập
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //TODO: Xử lý hành vi cho menu đăng xuất
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //TODO: Nhận kết quả xử lý từ activity
    }

    private void loadEmail() {

        AsyncTask<Object, Object, ArrayList<Email>[]> task = new AsyncTask<Object, Object, ArrayList<Email>[]>() {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                //TODO: Hiển thị progress bar
            }

            @Override
            protected ArrayList<Email>[] doInBackground(Object... voids) {

                ArrayList<Email> emails = new ArrayList<>();
                //TODO: Lấy danh sách mail từ server mail
                return new ArrayList[]{emails};
            }

            @Override
            protected void onPostExecute(ArrayList<Email>[] emailData) {
                //TODO: Xử lý kết quả trả về từ server mail
            }
        };
        task.execute();
    }

    private void loginDialog() {
        //TODO: Sử dụng dialog để tạo màn hình MH-1. Xử lý logic cho chức năng đăng nhập
    }

    private void saveConfig(String email, String password) {
        //TODO: Lưu thông tin đăng nhập
    }

    private void logout() {
        //TODO: Xử lý logic đăng xuất
    }

    private void notifyUpdateData(List<Email> emails) {
        //TODO: Xử lý logic cập nhập danh sách email trên màn hình MH-1 khi có thay đổi
    }
}