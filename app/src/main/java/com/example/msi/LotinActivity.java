package com.example.msi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import mehdi.sakout.fancybuttons.FancyButton;

public class LotinActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String ALLOH_ISMI = "ALLOH_ISMI";
    public static final String JAMI_BALL = "JAMI_BALL";
    private TextInputEditText editText;
    int count = 1;
    private TextView textCount;
    private FancyButton checkButton;
    private FancyButton presentButton;
    private AddName names;
    String word;
    private boolean bor = false;
    private String tabrik = "Barakallah Davom Eting";
    private String ogohlik = "Ism mavjud emas yoki qaytarilmoqda!!!";
    private String sovga = "Sovg'a Tugmasini Bosishingiz Mumkin";
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotin);
        Toast.makeText(this,"Xush Kelibsiz Aziz Musulmon Qardosh",Toast.LENGTH_LONG).show();
        editText = findViewById(R.id.editText);
        textCount = findViewById(R.id.textView);
        checkButton = findViewById(R.id.checkButton);
        presentButton = findViewById(R.id.presentButton);

        presentButton.setEnabled(false);
        checkButton.setOnClickListener(this);

        progressBar = findViewById(R.id.progressBar);
    }

    public void addNames() {
        names = new AddName();
        names.add("Alloh");
        names.add("Ar Rohman");
        names.add("Ar Rohiym");
        names.add("Al Malik");
        names.add("Al Quddus");
        names.add("As Salam");
        names.add("Al Mo'min");
        names.add("Al Muhaymin");
        names.add("Al Aziz");
        names.add("Al Jabbar");
        names.add("Al Mutakkabir");
        names.add("Al Holiq");
        names.add("Al Bari'");
        names.add("Al Musovvir");
        names.add("Al G'offar");
        names.add("Al Qohhar");
        names.add("Al Vahhab");
        names.add("Al Rozzaq");
        names.add("Al Fattah");
        names.add("Al Aliym");
        names.add("Al Qobiz");
        names.add("Al Basit");
        names.add("Al Hofiz");
        names.add("Al Rofi'");
        names.add("Al Mu'izz");
        names.add("Al Muzill");
        names.add("Al Sami'");
        names.add("Al Basir");
        names.add("Al Hakam");
        names.add("Al Adl");
        names.add("Al Latiyf");
        names.add("Al Hobiyr");
        names.add("Al Haliym");
        names.add("Al Aziym");
        names.add("Al G'ofur");
        names.add("Ash Shakur");
        names.add("Al Aliyy");
        names.add("Al Kabiyr");
        names.add("Al Hafiz");
        names.add("Al Muqiyt");
        names.add("Al Hasib ");
        names.add("Al Jaliyl");
        names.add("Al Kariym");
        names.add("Ar Roqiyb");
        names.add("Al Mujiyb");
        names.add("Al Vasi'");
        names.add("Al Hakiym");
        names.add("Al Vadud");
        names.add("Al Majiyd");
        names.add("Al Ba'is");
        names.add("Ash Shahiyd");
        names.add("Al Haqq");
        names.add("Al Vakiylu");
        names.add("Al Qoviyyu");
        names.add("Al Matiynu");
        names.add("Al Valiyy");
        names.add("Al Hamiyd");
        names.add("Al Muhsiy");
        names.add("Al Mubdiu");
        names.add("Al Mu'iyd");
        names.add("Al Muhyi");
        names.add("Al Mumiyt");
        names.add("Al Hayyu");
        names.add("Al Qoyyumu");
        names.add("Al Vajidu");
        names.add("Al Majidu");
        names.add("Al Vahidu");
        names.add("As Somadu");
        names.add("Al Qodiru");
        names.add("Al Muqtadir");
        names.add("Al Muqoddim");
        names.add("Al Muaxirr");
        names.add("Al Avval");
        names.add("Al Axiru");
        names.add("Az Zohiru");
        names.add("Al Batin");
        names.add("Al Vali");
        names.add("Al Muta'aliy");
        names.add("Al Barr");
        names.add("At Tavvab");
        names.add("Al Muntaqim");
        names.add("Al Afuvv");
        names.add("Ar Rouf");
        names.add("Malikul Mulk");
        names.add("Zul Jalali Val Ikrom");
        names.add("Al Muqsitu");
        names.add("Al Jami'u");
        names.add("Al G'oniyyu");
        names.add("Al Mug'niy");
        names.add("Al Mani'u");
        names.add("Az Zorru");
        names.add("An Nafi'y");
        names.add("An Nur");
        names.add("Al Hadiy");
        names.add("Al Badi'");
        names.add("Al Baqiy");
        names.add("Al Varis");
        names.add("Ar Roshiyd");
        names.add("As Sobur");



    }

    @Override
    public void onClick(View view) {

        if(count == 1)
            addNames();

        if(validate() && count <= 99) {

            word = editText.getText().toString();

            save(word,count);
            progressBar.setVisibility(View.VISIBLE);
            if (names.checkName(word) == true) {

                Integer num = count;
                if(count != 99) {
                    textCount.setText("Jami: " + num.toString());
                    Toast.makeText(this, tabrik.toUpperCase(), Toast.LENGTH_LONG).show();
                    count++;
                    editText.setText("");
                }
                else if(count == 99){
                    textCount.setText("Jami: " + num.toString());
                    Toast.makeText(this, sovga.toUpperCase(), Toast.LENGTH_LONG).show();
                    editText.setText("99ta sifatga ega Allohga hamd bo'lsin");
                    checkButton.setEnabled(false);
                    presentButton.setEnabled(true);
                }

            } else {
                Toast.makeText(this, ogohlik.toUpperCase(), Toast.LENGTH_LONG).show();

                progressBar.setVisibility(View.GONE);
            } progressBar.setVisibility(View.GONE);
        }

    }


    public void callForPresent(View view) {

        Uri uri = Uri.parse("tel:+998982709430");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }
    }

    public boolean  validate(){

        if(editText.getText().toString().trim().isEmpty()){
            editText.setError("Ism kiritilmadi!");
            return false;
        }
        return true;
    }

    public void save(String word, int count){

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

//        SharedPreferences.Editor editor = prefs.edit();
//
//        editor.putString(ALLOH_ISMI,word);
//        editor.putInt(JAMI_BALL,count);
//        editor.apply();
        prefs.edit().putString(ALLOH_ISMI,word).putInt(JAMI_BALL,count).apply();
    }

    @Override
    protected void onStop() {
        super.onStop();
        save(word,count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        save(word,count);
    }

    // new Class
    public class Box {
        private String name;
        private Map<String,String> nams = new HashMap<>();

        Box(String name) {
            this.name = name;
            nams.put(name,name);
        }


        String getName() {

            return name;
        }


        public void delete(String name) {
            if (nams.containsKey(name)) {
                this.name = nams.get(name);
                this.name = "";
                nams.get(name).replace(name,"");
            }
        }
    }

    //new Class
    public class AddName{

        List<Box> AllahNames = new LinkedList<>();

        public void add(String name) {
            Box box = new Box(name);
            AllahNames.add(box);
        }

        public boolean checkName(String name) {
            for (Box b : AllahNames) {
                if (b.getName().equals(name)) {

                    bor = true;
                    b.delete(name);
                    return bor;
                }

            }
            return bor = false;
        }
    }
}
