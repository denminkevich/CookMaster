package com.example.cookmaster;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IngredientsActivity extends AppCompatActivity {

    private ImageButton ImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

        ImageButton = (ImageButton) findViewById(R.id.imageButtonShoppingList2);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShoppingListActivity();
            }
        });

        ImageButton = (ImageButton) findViewById(R.id.imageButtonFavorite2);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavoritesActivity();
            }
        });

        ImageButton = (ImageButton) findViewById(R.id.imageButtonMain2);
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

    public void openFavoritesActivity(){
        Intent intent = new Intent(this, FavoritesActivity.class);
        startActivity(intent);
    }

   public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
