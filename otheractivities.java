//starters activity


package com.Karthikdevadiga.udupihotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters2);

        ListView  startersList=findViewById(R.id.Starters_list_view);

        Dishes[] Dishes={
                new Dishes("hi", "we say hi to the customer",20),
                new Dishes("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new Dishes("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new Dishes("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new Dishes("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dishes("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new Dishes("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dishes("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new Dishes("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        ArrayAdapter<Dishes> starterDishAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Dishes);

        startersList.setAdapter(starterDishAdapter);



    }
}


// main course activity




package com.Karthikdevadiga.udupihotel;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MaincourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincourse);

        ListView maincourseList= findViewById(R.id.maincourse_listview);

        Dishes[] mainDish={
                new Dishes("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new Dishes("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
                new Dishes("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
                new Dishes("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
                new Dishes("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
                new Dishes("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
                new Dishes("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
                new Dishes("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)

        };

        ArrayAdapter<Dishes> maincourseAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainDish);

        maincourseList.setAdapter(maincourseAdapter);



    }
}


// dessert activity




package com.Karthikdevadiga.udupihotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DesertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        ListView desertList = findViewById(R.id.desert_listview);

        Dishes[] desertDish = {
                new Dishes("Gulab Jamun", "Deep-fried milk dumplings soaked in a sugary syrup.", 70),
                new Dishes("Kesari", "Semolina (sooji) sweetened with sugar, ghee, and flavored with saffron and cardamom.", 70),
                new Dishes("Jalebi ", "Deep-fried batter soaked in saffron-infused sugar syrup, forming a coiled, pretzel-like shape.", 90),
                new Dishes("Paysam/Kheer", "Rice or vermicelli pudding made with milk, sugar, and garnished with nuts and raisins.", 100),
                new Dishes(" Adhirasam Sweet", "deep-fried rice flour dough, often flavored with jaggery and cardamom.", 110),
                new Dishes("Badam Halwa", "A rich and delicious sweet made from almond paste, ghee, and sugar.", 120),
                new Dishes("Rava Laddu ", "weet balls made with semolina, ghee, sugar, and garnished with cashews and raisins.", 85),
                new Dishes("Coconut Barfi", "Sweet confection made from grated coconut, sugar, and condensed milk.", 95),
                new Dishes("Mysore Pak ", "A rich and dense sweet made from gram flour, ghee, and sugar.", 110)
        };

        ArrayAdapter<Dishes> desertAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,desertDish);
        desertList.setAdapter(desertAdapter);
    }
}



