package com.example.hololiveguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TalentProfil extends AppCompatActivity implements View.OnClickListener{
    public static final String TALENT_NAME = "talent_name";
    public static final String TALENT_QUOTES = "talent_quotes";
    public static final String TALENT_NICKNAME = "talent_nickname";
    public static final String TALENT_DESC = "talent_desc";
    public static final String TALENT_DEBUT = "talent_debut";
    public static final String TALENT_AFFLI = "talent_affli";
    public static final String TALENT_BIRTH = "talent_birth";
    public static final String TALENT_FAN = "talent_fan";
    public static final String TALENT_ILLUS = "talent_illus";
    public static final String TALENT_HEIGHT = "talent_height";
    public static final String TALENT_IMAGE = "talent_image";
    public static final String TALENT_CHANNEL = "talent_channel";
    public static final String TALENT_WEBIO = "talent_webio";
    public static final String TALENT_TWITTER = "taletn_twitter";

    private ArrayList<Talent> list = new ArrayList<>();


    ImageView talentImage;
    ImageButton talentChannel, talentWebio, talentTwitter;
    TextView talentName, talentGen, talentQuotes, talentDesc, talentNick,
            talentDebut, talentAffli, talentBirth, talentFan, talentIllus,
            talentHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talent_profil);

        talentImage = findViewById(R.id.rv_talentpic);
        talentChannel = findViewById(R.id.talent_youtubech);
        talentWebio = findViewById(R.id.talent_webio);
        talentTwitter = findViewById(R.id.talent_twitter);
        talentName = findViewById(R.id.rv_talentname);
        talentQuotes = findViewById(R.id.rv_quotes);
        talentDesc = findViewById(R.id.rv_talentDesc);
        talentNick = findViewById(R.id.rv_talent_nickname);
        talentDebut = findViewById(R.id.rv_debute_date);
        talentAffli = findViewById(R.id.rv_talent_affiliation);
        talentBirth = findViewById(R.id.rv_birthday);
        talentFan = findViewById(R.id.rv_talent_fanbase);
        talentIllus = findViewById(R.id.rv_talent_illustrator);
        talentHeight = findViewById(R.id.rv_talent_height);

        talentChannel.setOnClickListener(this);
        talentWebio.setOnClickListener(this);
        talentTwitter.setOnClickListener(this);

        list.addAll(TalentsData.getListData());
        getItem();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getIntent().getStringExtra(TALENT_NAME));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.share_youtubech, menu);
        return super.onCreateOptionsMenu(menu);
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setButton(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void getItem(){
        if (getIntent().hasExtra(TALENT_NAME) && getIntent().hasExtra(TALENT_IMAGE)){
            int Image = getIntent().getIntExtra(TALENT_IMAGE, 1);
            String Name = getIntent().getStringExtra(TALENT_NAME);
            String Quote = getIntent().getStringExtra(TALENT_QUOTES);
            String Desc = getIntent().getStringExtra(TALENT_DESC);
            String Debut = getIntent().getStringExtra(TALENT_DEBUT);
            String Birth = getIntent().getStringExtra(TALENT_BIRTH);
            String Nick = getIntent().getStringExtra(TALENT_NICKNAME);
            int Height = getIntent().getIntExtra(TALENT_HEIGHT, 1);
            String Fanbase = getIntent().getStringExtra(TALENT_FAN);
            String Illustrator = getIntent().getStringExtra(TALENT_ILLUS);
            String Affliation = getIntent().getStringExtra(TALENT_AFFLI);

            setItem(Image,Name, Quote, Desc, Nick, Debut, Birth, Height, Fanbase, Illustrator, Affliation);
        }
    }

    private void setItem(int Image, String Name, String Quote, String Desc, String Nick,String Debut, String Birth, int Height, String Fanbase, String Illustrator, String Affliation){
        Glide.with(this).asBitmap().load(Image).into(talentImage);
        talentName.setText(Name);
        talentQuotes.setText(Quote);
        talentDesc.setText(Desc);
        talentNick.setText(Nick);
        talentDebut.setText(Debut);
        talentBirth.setText(Birth);
        talentHeight.setText(Height + " cm");
        talentFan.setText(Fanbase);
        talentIllus.setText(Illustrator);
        talentAffli.setText(Affliation);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.talent_youtubech){
            Intent tChannel = new Intent(Intent.ACTION_VIEW, Uri.parse(getIntent().getStringExtra(TALENT_CHANNEL)));
            startActivity(tChannel);
        }else if (v.getId() == R.id.talent_webio){
            Intent tWebio = new Intent(Intent.ACTION_VIEW, Uri.parse(getIntent().getStringExtra(TALENT_WEBIO)));
            startActivity(tWebio);
        }else if (v.getId() == R.id.talent_twitter){
            Intent tTwitter = new Intent(Intent.ACTION_VIEW, Uri.parse(getIntent().getStringExtra(TALENT_TWITTER)));
            startActivity(tTwitter);
        }
    }

    private void setButton(int itemId) {
        Intent shareYT = new Intent(Intent.ACTION_SEND);
        shareYT.setType("text/plain");
        shareYT.putExtra(Intent.EXTRA_TEXT, getIntent().getStringExtra(TALENT_CHANNEL));
        startActivity(shareYT);
    }
}