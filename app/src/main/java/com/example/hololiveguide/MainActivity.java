package com.example.hololiveguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTalents;
    private ArrayList<Talent> list = new ArrayList<>();
    private Talent data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTalents = findViewById(R.id.rv_talent);
        rvTalents.setHasFixedSize(true);

        list.addAll(TalentsData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.official_site, menu);
        return super.onCreateOptionsMenu(menu);
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        if (itemId == R.id.official_en){
            String officialEN = "https://en.hololive.tv/";
            Intent officilaWebEN = new Intent(Intent.ACTION_VIEW, Uri.parse(officialEN));
            startActivity(officilaWebEN);
        }else if(itemId == R.id.official_jp){
            String officialJP = "https://www.hololive.tv/";
            Intent officilaWebJP = new Intent(Intent.ACTION_VIEW, Uri.parse(officialJP));
            startActivity(officilaWebJP);
        }else if (itemId == R.id.profil){
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }
    }

    private void showSelectedTalentName(Talent talent) {
        Toast.makeText(this, talent.getName(), Toast.LENGTH_SHORT).show();
    }


    private void showRecyclerList(){
        rvTalents.setLayoutManager(new LinearLayoutManager(this));
        ListTalentAdapter listTalentAdapter = new ListTalentAdapter(list);
        rvTalents.setAdapter(listTalentAdapter);

        listTalentAdapter.setOnItemClickCallback(new ListTalentAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Talent data) {

                showSelectedTalentName(data);
            }
        });
    }
}