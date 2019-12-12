package android.section.listview;

import android.os.Bundle;
import android.app.Activity;
import android.app.Activity; import android.os.Bundle; import android.widget.ImageView; import android.widget.TextView;
public class DrinkActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = getIntent().getExtras().getInt("drinkpos");
        Drink drink = DrinkCategoryActivity.drinks[drinkNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
//
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());


    }
}