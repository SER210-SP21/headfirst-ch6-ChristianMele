package edu.quinnipiac.ser120.coffeeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int drinkId;
        drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}