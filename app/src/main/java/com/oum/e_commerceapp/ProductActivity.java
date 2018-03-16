package com.oum.e_commerceapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.oum.e_commerceapp.adapter.CategoryAdapter;
import com.oum.e_commerceapp.adapter.ProductAdapter;

public class ProductActivity extends Activity {
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        int position = getIntent().getIntExtra("position", 0);

        gridView = findViewById(R.id.grid_product);

        Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_LONG).show();

        switch (position) {
            case 0:
                String[] categoryList = {"SAMSUNG", "LG", "PIXEL", "SAMSUNG", "LG", "PIXEL", "SAMSUNG"};
                int[] imageList = {R.drawable.samsung_galaxy, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j};

                String[] priceList = {"200 MYR", "250 MYR", "100 MYR", "300 MYR", "250 MYR", "200 MYR", "300 MYR"};
                gridView.setAdapter(new ProductAdapter(categoryList, imageList, priceList, getApplicationContext()));

                break;

                default:

                    break;

           /* case 1:
                String[] categoryList = {"SAMSUNG", "LG", "PIXEL", "SAMSUNG", "LG", "PIXEL", "SAMSUNG"};
                int[] imageList = {R.drawable.samsung_galaxy, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j};

                String[] priceList = {"200 MYR", "250 MYR", "100 MYR", "300 MYR", "250 MYR", "200 MYR", "300 MYR"};
                gridView.setAdapter(new ProductAdapter(categoryList, imageList, priceList, getApplicationContext()));

                break;

            case 2:
                String[] categoryList = {"SAMSUNG", "LG", "PIXEL", "SAMSUNG", "LG", "PIXEL", "SAMSUNG"};
                int[] imageList = {R.drawable.samsung_galaxy, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j};

                String[] priceList = {"200 MYR", "250 MYR", "100 MYR", "300 MYR", "250 MYR", "200 MYR", "300 MYR"};
                gridView.setAdapter(new ProductAdapter(categoryList, imageList, priceList, getApplicationContext()));

                break;

            case 3:
                String[] categoryList = {"SAMSUNG", "LG", "PIXEL", "SAMSUNG", "LG", "PIXEL", "SAMSUNG"};
                int[] imageList = {R.drawable.samsung_galaxy, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j};

                String[] priceList = {"200 MYR", "250 MYR", "100 MYR", "300 MYR", "250 MYR", "200 MYR", "300 MYR"};
                gridView.setAdapter(new ProductAdapter(categoryList, imageList, priceList, getApplicationContext()));

                break;*/
        }
    }

}
