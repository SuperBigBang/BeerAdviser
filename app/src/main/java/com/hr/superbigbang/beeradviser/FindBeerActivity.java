package com.hr.superbigbang.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView)findViewById(R.id.Brands);
        Spinner typesofdrinks = (Spinner) findViewById(R.id.spinner);
        String selectedcolor = String.valueOf(typesofdrinks.getSelectedItem());
        List<String> fromexpert = expert.getBrands(selectedcolor);
        brands.setText("");
        for (int i = 0; i <fromexpert.size() ; i++) {
            if (i>0) {brands.append('\n'+fromexpert.get(i));}
            else brands.append(fromexpert.get(i));
        }

    }

}
