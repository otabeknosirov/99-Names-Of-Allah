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

public class KirilActivity extends AppCompatActivity implements View.OnClickListener{

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
    private String tabrik = "Баракалло давом этинг";
    private String ogohlik = "Исм мавжуд эмас ёки кайтарилмокда!!!";
    private String sovga = "SСовга тугмасини босишингиз мумкин";
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiril);
        Toast.makeText(this,"Хуш келибсиз азиз мусулмон кардош",Toast.LENGTH_LONG).show();
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
        names.add("Аллох");
        names.add("Ар Рохман");
        names.add("Ар Рохийм");
        names.add("Ал Малик");
        names.add("Ал Куддус");
        names.add("Ас Салам");
        names.add("Ал Му'мин");
        names.add("Ал Мухаймин");
        names.add("Ал Азиз");
        names.add("Ал Жаббар");
        names.add("Ал Мутаккабир");
        names.add("Ал Холик");
        names.add("Ал Бари'");
        names.add("Ал Мусоввир");
        names.add("Ал Г'оффар");
        names.add("Ал Коххар");
        names.add("Ал Ваххаб");
        names.add("Ар Роззак");
        names.add("Ал Фаттах");
        names.add("Ал Алийм");
        names.add("Ал Кобиз");
        names.add("Ал Басит");
        names.add("Ал Хофиз");
        names.add("Ар Рофи'");
        names.add("Ал Му'изз");
        names.add("Ал Музилл");
        names.add("Ас Сами'");
        names.add("Ал Басир");
        names.add("Ал Хакам");
        names.add("Ал Адл");
        names.add("Ал Латийф");
        names.add("Ал Хобийр");
        names.add("Ал Халийм");
        names.add("Ал Азийм");
        names.add("Ал Г'офур");
        names.add("Аш Шакур");
        names.add("Ал Алийй");
        names.add("Ал Кабийр");
        names.add("Ал Хафиз");
        names.add("Ал Мукийт");
        names.add("Ал Хасиб");
        names.add("Ал Жалийл");
        names.add("Ал Карийм");
        names.add("Ар Рокийб");
        names.add("Ал Мужийб");
        names.add("Ал Васи'");
        names.add("Ал Хакийм");
        names.add("Ал Вадуд");
        names.add("Ал Мажийд");
        names.add("Ал Ба'ис");
        names.add("Аш Шахийд");
        names.add("Ал Хакк");
        names.add("Ал Вакийлу");
        names.add("Ал Ковийю");
        names.add("Ал Матийну");
        names.add("Ал Валийй");
        names.add("Ал Хамийд");
        names.add("Ал Мухсий");
        names.add("Ал Мубдиу");
        names.add("Ал Му'ийд");
        names.add("Ал Мухйи");
        names.add("Ал Мумийт");
        names.add("Ал Хайю");
        names.add("Ал Койюму");
        names.add("Ал Важиду");
        names.add("Ал Мажиду");
        names.add("Ал Вахиду");
        names.add("Ас Сомаду");
        names.add("Ал Кодиру");
        names.add("Ал Муктадир");
        names.add("Ал Мукоддим");
        names.add("Ал Муахирр");
        names.add("Ал Аввал");
        names.add("Ал Ахиру");
        names.add("Аз Зохиру");
        names.add("Ал Батин");
        names.add("Ал Вали");
        names.add("Ал Мута'алий");
        names.add("Ал Барр");
        names.add("Ат Тавваб");
        names.add("Ал Мунтаким");
        names.add("Ал Афувв");
        names.add("Ар Роуф");
        names.add("Маликул Мулк");
        names.add("Зул Жалали Вал Икром");
        names.add("Ал Мукситу");
        names.add("Ал Жами'у");
        names.add("Ал Г'онийю");
        names.add("Ал Муг'ний");
        names.add("Ал Мани'у");
        names.add("Аз Зорру");
        names.add("Ан Нафи'у");
        names.add("Ан Нур");
        names.add("Ал Хадий");
        names.add("Ал Бади'");
        names.add("Ал Бакий");
        names.add("Ал Варис");
        names.add("Ар Рошийд");
        names.add("Ас Собур");
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
                    textCount.setText("Жами: " + num.toString());
                    Toast.makeText(this, tabrik.toUpperCase(), Toast.LENGTH_LONG).show();
                    count++;
                    editText.setText("");
                }
                else if(count == 99){
                    textCount.setText("Жами: " + num.toString());
                    Toast.makeText(this, sovga.toUpperCase(), Toast.LENGTH_LONG).show();
                    editText.setText("99та сифатга эга Aллохга хамд булсин.");
                    checkButton.setEnabled(false);
                    presentButton.setEnabled(true);
                }
            } else {
                Toast.makeText(this, ogohlik.toUpperCase(), Toast.LENGTH_LONG).show();

            }
            progressBar.setVisibility(View.GONE);
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
            editText.setError("Исм киритилмади!");
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

