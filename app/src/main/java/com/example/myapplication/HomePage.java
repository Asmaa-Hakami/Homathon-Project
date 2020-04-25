package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

   // private RecyclerView recyclerView;
//    private RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<Item> items;
    RecyclerViewAdapter recyclerViewAdapter;
   // ArrayList<Supermarket> supermarkets;
    //int []arr = {R.drawable.eggs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        items = new ArrayList<>();
        items.add(new Item("أرز صنوايت", 7, R.drawable.rice, 10, "مواد غذائية"));
        items.add(new Item("أرز الشعلان", 10, R.drawable.rice2, 12, "مواد غذائية"));
        items.add(new Item("بيض", 22, R.drawable.eggs, 12, "مواد غذائية"));
        items.add(new Item("دجاج ساديا", 12, R.drawable.checken, 3, "مواد غذائية"));
        items.add(new Item("دجاج الوطنية", 10, R.drawable.checken2, 5, "مواد غذائية"));
        items.add(new Item("دقيق أبيض فوم", 10, R.drawable.flour, 11, "مواد غذائية"));
        //items.add(new Item());
       // items.add(new Item());
     //   items.add(new Item());
      //  items.add(new Item());
      //  items.add(new Item());
       // items.add(new Item());



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(this, items);
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

        /*
        supermarkets = new ArrayList<>();
        supermarkets.add(new Supermarket("الدكان", "1.0كم"));
        supermarkets.add(new Supermarket("كارفور", "1.2كم"));
        supermarkets.add(new Supermarket("الدانوب", "1.3كم"));
        supermarkets.add(new Supermarket("هايبر بنده", "1.9كم"));
*/

        EditText editText = findViewById(R.id.search);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }
    private void filter (String text){
        ArrayList<Item> filteredList= new ArrayList<>();
        for (Item item : items){
            if(item.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        recyclerViewAdapter.filterList(filteredList);
    }
}
