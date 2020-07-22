package com.example.advancesearchbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> names;
    private String list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);
        names.add("Anamika");
        names.add("Ansh");
        names.add("Arihant");
        names.add("Arvind");
        names.add("Anaayah");
        names.add("Anah");
        names.add("Arpan");
        names.add("Anahit");
        names.add("Anaia");
        names.add("Anais");
        names.add("Anaiya");
        names.add("Anala");
        names.add("Anand");
        names.add("Akshat");
        names.add("Ayushi");
        names.add("Akshat");
        names.add("Bhavesh");
        names.add("Chavvi");
        names.add("Chitra");
        names.add("Cavery");
        names.add("Chetan");
        names.add("Chaaru");
        names.add("Chaitali");
        names.add("Chaitanya");
        names.add("Chaitra");
        names.add("Chaman");
        names.add("Chaksan");
        names.add("Chameli");
        names.add("Champa");
        names.add("Chanakya");
        names.add("Chanchal");
        names.add("Chanda");
        names.add("Danish");
        names.add("Deepak");
        names.add("Daksh");
        names.add("Dahana");
        names.add("Daiwik");
        names.add("Dakshi");
        names.add("Dakshin");
        names.add("Daljeet");
        names.add("Daman");
        names.add("Damini");
        names.add("Dainel");
        names.add("Darpan");
        names.add("Darsha");
        names.add("Ekani");
        names.add("Ekaaksh");
        names.add("Ekanath");
        names.add("Ekapad");
        names.add("Elaina");
        names.add("Eilin");
        names.add("Emica");
        names.add("Eimen");
        names.add("Eshika");
        names.add("Eevan");
        names.add("Ecchita");
        names.add("Eladevi");
        names.add("Eka");
        names.add("Ekisha");
        names.add("Ekaa");
        names.add("Ekta");
        names.add("Esha");
        names.add("Ekisha");
        names.add("Eshita");
        names.add("Eshana");
        names.add("Elisha");
        names.add("Fanah");
        names.add("Falak");
        names.add("Foolan");
        names.add("Faguni");
        names.add("Feeza");
        names.add("Fiza");
        names.add("Farishta");
        names.add("Firaki");
        names.add("Guika");
        names.add("Gavya");
        names.add("Geeti");
        names.add("Ghani");
        names.add("Gangi");
        names.add("Gauravi");
        names.add("Gitansh");
        names.add("Gira");

        names.add("Gitali");
        names.add("Garvita");
        names.add("Gitansh");
        names.add("Gaura");
        names.add("Gomini");
        names.add("Geya");
        names.add("Gunika");
        names.add("Gunjan");
        names.add("Gandhika");
        names.add("Gitali");
        names.add("Gauri");
        names.add("Galina");
        names.add("Hirsha");
        names.add("Haimi");
        names.add("Hirva");
        names.add("Hana");
        names.add("Hanima");
        names.add("Harini");
        names.add("Haryana");


        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);


        MenuItem searchViewItem
                = menu.findItem(R.id.search_bar);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(searchViewItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                    @Override
                    public boolean onQueryTextSubmit(String query)
                    {
                        
                        if (list.contains(query)) {
                            adapter.getFilter().filter(query);
                        }
                        else {
                            
                            Toast.makeText(MainActivity.this, "Not found", Toast.LENGTH_LONG).show();
                        }
                        return false;
                    }

                  
                    @Override
                    public boolean onQueryTextChange(String newText)
                    {
                        adapter.getFilter().filter(newText);
                        return false;
                    }
                });

        return super.onCreateOptionsMenu(menu);
    }
}
