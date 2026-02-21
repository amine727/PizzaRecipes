package com.example.pizzarecipe.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipe.R;
import com.example.pizzarecipe.classes.Produit;
import com.example.pizzarecipe.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_pizza_detail);

        long id = getIntent().getLongExtra("pizza_id", -1);
        Produit p = ProduitService.getInstance().findById(id);

        if (p == null) {
            finish();
            return;
        }

        ImageView img = findViewById(R.id.img);
        TextView title = findViewById(R.id.title);
        TextView meta = findViewById(R.id.meta);
        TextView ingredients = findViewById(R.id.ingredients);
        TextView desc = findViewById(R.id.desc);
        TextView steps = findViewById(R.id.steps);

        img.setImageResource(p.getImageRes());
        title.setText(p.getNom());
        meta.setText(p.getPrix() + " DH • " + p.getDuree());
        ingredients.setText(p.getIngredients());
        desc.setText(p.getDescription());
        steps.setText(p.getEtapes());
    }
}