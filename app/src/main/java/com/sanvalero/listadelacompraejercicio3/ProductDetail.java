package com.sanvalero.listadelacompraejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ProductDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        TextView etProductDetailName = findViewById(R.id.product_detail_name);
        etProductDetailName.setText(name);
    }
}