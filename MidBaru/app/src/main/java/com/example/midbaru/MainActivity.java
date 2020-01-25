package com.example.midbaru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

     ArrayList<Model> models = new ArrayList<>();

     Model model = new Model();
     model.setTitle("SMA N 1 Semarang");
     model.setDescription("SMA Negeri (SMA N) 1 Semarang atau lebih dikenal dengan SMANSA Semarang, merupakan salah satu sekolah menengah atas negeri favorit yang ada di Provinsi Jawa Tengah, Indonesia. Terletak di Jalan Taman Menteri Supeno No. 1 Semarang. Bangunan sekolah ini didirikan tahun 1936 di lahan seluas 4,2 Ha dan pernah menjadi sekolah non-asrama terluas di Asia Tenggara, serta mendapat predikat sebagai Sekolah Adiwiyata atau Sekolah Berwawasan Lingkungan.");
     model.setImg(R.drawable.sma1);
     models.add(model);

     model = new Model();
     model.setTitle("SMA N 2 Semarang");
     model.setDescription("SMA Negeri 2 Semarang, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Semarang, yang beralamat di Jl. Sendangguwo Baru No. 1 Pedurungan - Semarang. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 2 Semarang ditempuh dalam waktu tiga tahun pelajaran, mulai dari kelas X sampai kelas XII.");
     model.setImg(R.drawable.sma2);
     models.add(model);

     model = new Model();
     model.setTitle("SMA N 3 Semarang");
     model.setDescription("SMA Negeri 3 Semarang adalah sebuah SMA Negeri yang terletak di Jalan Pemuda No. 149, Kota Semarang. Dahulu jalan ini dikenal sebagai Jalan Bodjong sehingga SMA Negeri 3 Semarang juga dikenal sebagai SMA Bodjong. Sekolah ini berdiri pada tanggal 1 November 1877.");
     model.setImg(R.drawable.sma3);
     models.add(model);

     model = new Model();
     model.setTitle("SMA N 4 Semarang");
     model.setDescription("SMA Negeri 4 Semarang, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Semarang, yang beralamat di Jl. Karangrejo Raya 12A Banyumanik - Semarang. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 4 Semarang ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.");
     model.setImg(R.drawable.sma4);
     models.add(model);

     model = new Model();
     model.setTitle("SMA N 5 Semarang");
     model.setDescription("SMA Negeri 5 Semarang adalah salah satu Sekolah Menengah Atas Negeri yang ada di Semarang, yang beralamat di Jl. Pemuda 143 Semarang. Sama dengan SMA pada umumnya di Indonesia, masa pendidikan sekolah di SMA Negeri 5 Semarang ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII. SMA 5 Semarang memiliki 36 kelas rombongan belajar. Kelas X (10 kelas IPA, 2 kelas IPS), kelas XI (10 kelas IPA, 2 kelas IPS), kelas XII (10 kelas IPA, 2 kelas IPS)");
     model.setImg(R.drawable.sma5);
     models.add(model);

        model = new Model();
        model.setTitle("SMA N 6 Semarang");
        model.setDescription("SMA Negeri 6 Semarang, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Semarang, yang beralamat di Jalan Ronggolawe No. 4 - Semarang. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 6 Semarang ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.");
        model.setImg(R.drawable.sma6);
        models.add(model);
     return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
