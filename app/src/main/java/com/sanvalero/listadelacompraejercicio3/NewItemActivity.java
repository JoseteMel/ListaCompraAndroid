package com.sanvalero.listadelacompraejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.sanvalero.listadelacompraejercicio3.domain.Product;

import java.util.ArrayList;

public class NewItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);
    }

    public void add(View view) {
        EditText etName = findViewById(R.id.product_name);
        EditText etCategory = findViewById(R.id.product_category);
        EditText etQuantity = findViewById(R.id.product_quantity);
        EditText etPrice = findViewById(R.id.product_price);
        CheckBox checkImportant = findViewById(R.id.important_product);


        String name = etName.getText().toString();
        if (name.equals("")) {
            Toast.makeText(this, R.string.product_name_mandatory, Toast.LENGTH_SHORT).show();
            return;
        }

        String category = etCategory.getText().toString();

        String quantity = etQuantity.getText().toString();
        if (quantity.equals(""))
            quantity = "1";

        String price = etPrice.getText().toString();
        if (price.equals(""))
            price = "0";

        boolean important = checkImportant.isChecked();

        Product product = new Product(name, category, Integer.parseInt(quantity), Float.parseFloat(price), important);

        MainActivity.products.add(product);
        Toast.makeText(this, getString(R.string.product_added, name), Toast.LENGTH_SHORT).show();

        etName.setText("");
        etCategory.setText("");
        etQuantity.setText("");
        etPrice.setText("");
        checkImportant.setChecked(false);
        etName.requestFocus();
    }
}