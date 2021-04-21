package com.example.list;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView tvDetail, tvName;
    private ImageView ivPhoto;
    String detail, name;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPhoto = findViewById(R.id.iv_film);
        tvName = findViewById(R.id.tv_film_name);
        tvDetail = findViewById(R.id.tv_film_detail);

        name = getIntent().getStringExtra("Name");
        detail = getIntent().getStringExtra("Detail");
        image = getIntent().getIntExtra("Image", 0);
        ivPhoto.setImageResource(image);
        tvName.setText(name);
        tvDetail.setText(detail);
    }
}