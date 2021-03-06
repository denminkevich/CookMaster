package com.example.cookmaster;

import android.os.Bundle;
import android.content.Intent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

        private ImageButton ImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton = (ImageButton) findViewById(R.id.imageButtonShoppingList);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingListActivity();
            }
        });

        ImageButton = (ImageButton) findViewById(R.id.imageButtonFavorite);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavoritesActivity();
            }
        });

        ImageButton = (ImageButton) findViewById(R.id.imageButtonIngredients);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientsActivity();
            }
        });
    }

    public void openShoppingListActivity(){
        Intent intent = new Intent(this, ShoppingListActivity.class);
        startActivity(intent);
    }

    public void openFavoritesActivity(){
        Intent intent = new Intent(this, FavoritesActivity.class);
        startActivity(intent);
    }

    public void openIngredientsActivity(){
        Intent intent = new Intent(this, IngredientsActivity.class);
        startActivity(intent);
    }
}