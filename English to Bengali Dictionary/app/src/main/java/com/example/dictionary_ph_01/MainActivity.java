package com.example.dictionary_ph_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    EditText et_english;

    TextView tv_bengali,tv_details;

    Button btn_translate,btn_wrd_lst;

    String inserted_word;

    int[] key_freq_checker = new int[20];

    Vector<Vector<String>> hashTable2D = new Vector<Vector<String>>(20);

    int a = 1, b = 17, p =  982451653, m = 20;

    int a2 = 2, b2 = 37, nj;

    int h1,h2;

    String bengali_translated_word;

    int key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_english = findViewById(R.id.english_et_dsn);

        tv_bengali = findViewById(R.id.bengali_tv_dsn);

        tv_details = findViewById(R.id.details_tv_dsn);

        btn_translate = findViewById(R.id.translate_btn_dsn);

        btn_wrd_lst = findViewById(R.id.wrd_lst_btn_dsn);

        //Initialization.....

        for(int i=0; i<20 ;i++){

            hashTable2D.add(i, new Vector<String>(30));

            Vector<String> rowVectorInit = hashTable2D.get(i);

            for(int j=0;j<30;j++)rowVectorInit.add(j,"Word not found !!!");

        }

        for(int i=0;i<20;i++)key_freq_checker[i] = 5;


        Vector<String> rowVector_0 = hashTable2D.get(0);
        rowVector_0.add(3,"ঘর");
        rowVector_0.add(8,"বরফ");
        rowVector_0.add(18,"ধুয়ে ফেলুন");
        rowVector_0.add(23,"রাজা");


        Vector<String> rowVector_1 = hashTable2D.get(1);
        rowVector_1.add(5,"প্রমাণ");
        rowVector_1.add(10,"দুই");


        Vector<String> rowVector_2 = hashTable2D.get(2);
        rowVector_2.add(2,"বীজ");
        rowVector_2.add(7,"সুন্দর");
        rowVector_2.add(12,"বই");
        rowVector_2.add(17,"দশ");

        key_freq_checker[3]=3;
        Vector<String> rowVector_3 = hashTable2D.get(3);
        rowVector_3.add(0,"দড়ি");
        rowVector_3.add(3,"খেলনা");
        rowVector_3.add(4,"ছেঁড়া");


        Vector<String> rowVector_4 = hashTable2D.get(4);
        rowVector_4.add(6,"পরিদর্শন করা");
        rowVector_4.add(11,"বাক্স");
        rowVector_4.add(16,"ঘুড়ি");
        rowVector_4.add(21,"পুরাতন");


        Vector<String> rowVector_5 = hashTable2D.get(5);
        rowVector_5.add(3,"নতুন");
        rowVector_5.add(8,"এখানে");
        rowVector_5.add(13,"ছেলে");
        rowVector_5.add(23,"নিখোঁজ");


        Vector<String> rowVector_6 = hashTable2D.get(6);
        rowVector_6.add(5,"শিলা");
        rowVector_6.add(10,"বাদুড়");
        rowVector_6.add(20,"দ্রুত");


        Vector<String> rowVector_7 = hashTable2D.get(7);
        rowVector_7.add(2,"কালি");
        rowVector_7.add(7,"বিড়াল");
        rowVector_7.add(17,"প্রাচীর");
        rowVector_7.add(22,"পড়া");


        Vector<String> rowVector_8 = hashTable2D.get(8);
        rowVector_8.add(4,"গান করা");
        rowVector_8.add(9,"সেইটি");
        rowVector_8.add(14,"মিলন");
        rowVector_8.add(19,"প্রান্ত");
        rowVector_8.add(24,"শিয়াল");


        Vector<String> rowVector_9 = hashTable2D.get(9);
        rowVector_9.add(1,"শ্রেণী");
        rowVector_9.add(6,"জয় করা");
        rowVector_9.add(11,"যাওয়া");
        rowVector_9.add(16,"ডুব");
        rowVector_9.add(21,"কুকুর");


        Vector<String> rowVector_10 = hashTable2D.get(10);
        rowVector_10.add(3,"নতুবা");
        rowVector_10.add(8,"সুন্দর");
        rowVector_10.add(13,"অধিক");
        rowVector_10.add(18,"চাকরী");


        Vector<String> rowVector_11 = hashTable2D.get(11);
        rowVector_11.add(0,"ভার");
        rowVector_11.add(5,"ভাল");
        rowVector_11.add(15,"নয়");
        rowVector_11.add(20,"উচ্চ");


        Vector<String> rowVector_12 = hashTable2D.get(12);
        rowVector_12.add(2,"পরবর্তী");
        rowVector_12.add(7,"ঘড়া");
        rowVector_12.add(12,"পানি");
        rowVector_12.add(17,"পুতুল");


        Vector<String> rowVector_13 = hashTable2D.get(13);
        rowVector_13.add(4,"আশা");
        rowVector_13.add(9,"থলে");
        rowVector_13.add(14,"আনন্দ");
        rowVector_13.add(19,"মানচিত্র");

        key_freq_checker[14]=1;
        Vector<String> rowVector_14 = hashTable2D.get(14);
        rowVector_14.add(0,"বিছানা");


        Vector<String> rowVector_15 = hashTable2D.get(15);
        rowVector_15.add(3,"শান্তি");
        rowVector_15.add(13,"আপেল");
        rowVector_15.add(23,"টেবিল");


        Vector<String> rowVector_16 = hashTable2D.get(16);
        rowVector_16.add(0,"বিক্রয়");
        rowVector_16.add(5,"পশ্চিম");
        rowVector_16.add(15,"ধাবিত হত্তয়া");
        rowVector_16.add(20,"চেষ্টা করা");

        key_freq_checker[17]=1;
        Vector<String> rowVector_17 = hashTable2D.get(17);
        rowVector_17.add(0,"নৌকা");


        Vector<String> rowVector_18 = hashTable2D.get(18);
        rowVector_18.add(4,"কলম");
        rowVector_18.add(9,"পুকুর");
        rowVector_18.add(14,"ধীর");
        rowVector_18.add(24,"প্রস্তাবিত মূল্য");


        Vector<String> rowVector_19 = hashTable2D.get(19);
        rowVector_19.add(1,"সহজ");
        rowVector_19.add(11,"খোলা");
        rowVector_19.add(16,"কখন");


        btn_translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inserted_word = et_english.getText().toString();

                key = stringToInt(inserted_word);

                h1 = (((a*key) + b)%p)%m;

                h2 = 0;

                if(key_freq_checker[h1] == 1){  // in case of insertion use " if(key_freq_checker[h1] == 0){ "

                    // No collision

                    // in case of insertion use " key_freq_checker[h1] = key_freq_checker[h1] + 1; "

                    Vector<String> rowVector = hashTable2D.get(h1);

                    // in case of insertion use " rowVector.add(0,"_______________bengali_translation__________________"); "

                    bengali_translated_word = rowVector.get(0);// Searching translation.....


                }

                else if(key_freq_checker[h1] == 0){ // only used in searching....

                    bengali_translated_word = "Word not found !!!";
                }

                else{

                    // Collisions + 2D Array findings....

                    // in case of insertion use " key_freq_checker[h1] = key_freq_checker[h1] + 1; "

                    nj = key_freq_checker[h1] * key_freq_checker[h1];

                    h2 = (((a2 * key) + b2)%p)%nj;

                    Vector<String> rowVector = hashTable2D.get(h1);

                    // in case of insertion use " rowVector.add(h2,"_______________bengali_translation__________________"); "

                    bengali_translated_word = rowVector.get(h2);// Searching translation.....



                }

                tv_bengali.setText(bengali_translated_word);

                if(key_freq_checker[h1]>1) tv_details.setText("h1 = " + String.valueOf(h1) + " h2 = " + String.valueOf(h2));

                else if(key_freq_checker[h1]==1) tv_details.setText("h1 = " + String.valueOf(h1) + " h2 = " + String.valueOf(h2) + " No Collision");
            }
        });

        btn_wrd_lst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,WordList.class);
                startActivity(intent);

            }
        });

    }

    public static int stringToInt(String s) {

        int g = 31;

        int tmp;

        int hash_val = 0;

        for(int i=0;i<s.length();i++){

            tmp = (int) s.charAt(i);

            hash_val = (g*hash_val)+tmp;

        }

        return hash_val;

    }
}
