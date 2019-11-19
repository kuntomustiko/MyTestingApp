package com.mustiko.belajar.mytestingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // todo 2
    // null pointer exception
    // Eror NullPointerException muncul karena kita mencoba menekan button yang belum diinisiasi (masih bernilai null).

    // Kode di atas akan memunculkan IndexOutOfBoundsException. Collection names memiliki 3 item.
    // Karena sebuah collection dimulai dari 0, maka item terakhirnya berada pada indeks ke 2.
    // Ketika kita hendak mengambil data ke-3, maka IndexOutOfBoundsException akan dibangkitkan.

    private Button btnSetValue;
    private TextView tvText;

    private ArrayList<String> names;

//    todo 4

    ImageView imgPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvText = findViewById(R.id.tv_text);
        btnSetValue = findViewById(R.id.btn_set_value);
        btnSetValue.setOnClickListener(this);

        names = new ArrayList<>();
        names.add("Narenda Wicaksono");
        names.add("Kevin");
        names.add("Yoza");

        imgPreview = findViewById(R.id.img_preview);
        Glide.with(this).load(R.drawable.fronalpstock_big).into(imgPreview);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_set_value) {
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < 3; i++){
                name.append(names.get(i)).append("\n");
            }
            tvText.setText(name.toString());
        }
    }
}
