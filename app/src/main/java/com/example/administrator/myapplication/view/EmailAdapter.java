package com.example.administrator.myapplication.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.model.Email;

import java.util.ArrayList;

public class EmailAdapter extends ArrayAdapter<Email> {

    public EmailAdapter(Context context, ArrayList<Email> emails) {
        super(context, 0, emails);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //TODO Xử lý logic cho view hiển thị
        final Email email = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.email_row, parent, false);
        }
        TextView senderView = convertView.findViewById(R.id.sender_text);
        senderView.setText(email.getSender());

        TextView subjectView = convertView.findViewById(R.id.subject_text);
        subjectView.setText(email.getSubject());

        TextView timeView = convertView.findViewById(R.id.time_text);
        timeView.setText(email.getTime());

        return convertView;
    }
}