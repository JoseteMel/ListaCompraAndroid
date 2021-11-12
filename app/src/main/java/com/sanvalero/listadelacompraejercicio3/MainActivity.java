package com.sanvalero.listadelacompraejercicio3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.sanvalero.listadelacompraejercicio3.domain.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static ArrayList<Product> products;
    private ArrayAdapter<Product> productsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products = new ArrayList<>();

        ListView lvProducts = findViewById(R.id.product_list);
        productsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, products);
        lvProducts.setAdapter(productsAdapter);

        lvProducts.setOnItemClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        productsAdapter.notifyDataSetChanged();
        makeSummary();
    }

    private void makeSummary() {
        int productCount = products.size();
        double totalPrice = products.stream()
                .map(Product::getPrice)
                .mapToDouble(price -> price)
                .sum();

        TextView tvSummary = findViewById(R.id.summary);
        tvSummary.setText(getString(R.string.summary, productCount, totalPrice));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.new_item) {
            Intent intent = new Intent(this, NewItemActivity.class);
            startActivity(intent);
            return true;
        }

        return false;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Product product = products.get(position);

        Intent intent = new Intent(this, ProductDetail.class);
        intent.putExtra("name", product.getName());

        startActivity(intent);
    }
}