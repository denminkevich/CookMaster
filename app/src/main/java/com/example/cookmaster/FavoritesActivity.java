package com.example.cookmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FavoritesActivity extends AppCompatActivity {

    private ImageButton ImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

       ImageButton = (ImageButton) findViewById(R.id.imageButtonShoppingList3);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingListActivity();
            }
        });

        ImageButton = (ImageButton) findViewById(R.id.imageButtonIngredients3);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIngredientsActivity();
            }
        });

        ImageButton = (ImageButton) findViewById(R.id.imageButtonMain4);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openShoppingListActivity(){
        Intent intent = new Intent(this, ShoppingListActivity.class);
        startActivity(intent);
    }

    public void openIngredientsActivity(){
        Intent intent = new Intent(this, IngredientsActivity.class);
        startActivity(intent);
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
