package zzzomb.foodlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FoodDisplayActivity extends AppCompatActivity {

    private TextView foodName;
    private TextView foodDescription;
    private TextView foodPrice;
    private TextView foodCalories;

    public void goBack() {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.food_info);
        foodName = (TextView) findViewById(R.id.foodName);
        foodDescription = (TextView) findViewById(R.id.foodDescription);
        foodPrice = (TextView) findViewById(R.id.foodPrice);
        foodCalories = (TextView) findViewById(R.id.foodCalories);
        foodName.setText(intent.getStringExtra("Name"));
        foodDescription.setText(intent.getStringExtra("Description"));
        foodPrice.setText("Price: " + intent.getStringExtra("Price"));
        foodCalories.setText("Calories: " + intent.getStringExtra("Calories"));
    }
}
