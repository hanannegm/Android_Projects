package android.section.listview;

import android.os.Bundle;
import android.app.Activity;

import android.app.ListActivity; import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.ListView; import android.view.View; import android.content.Intent;
import android.widget.Toast;

public class DrinkCategoryActivity extends ListActivity {
    public static Drink  drinks[] = {
            new Drink("Latte",R.drawable.latte),
            new Drink("Cappuccino",R.drawable.cupuccino),
            new Drink("Coffee", R.drawable.latte),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();

        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this,android.R.layout.simple_list_item_1,drinks);
        listDrinks.setAdapter(listAdapter);
    }
    @Override
    public void onListItemClick(ListView listView,View itemView,int position,long id)
    {
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        Toast.makeText(getApplicationContext(),"f"+id+position,Toast.LENGTH_LONG).show();
        intent.putExtra("drinkpos", position);
        startActivity(intent);    } }