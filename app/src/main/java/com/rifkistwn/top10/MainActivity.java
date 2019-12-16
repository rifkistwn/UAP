package com.rifkistwn.top10;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private UnivAdapter adapter;
    private String[] Nama = {"AboutMe","InstitutTeknologiBandung","UniversitasGadjahMada","InstitutPertanianBogor","InstitutTeknologiSepuluhNopember","UniversitasIndonesia","UniversitasDiponegoro","UniversitasAirlangga","UniversitasHasanuddin","UniversitasBrawijaya", "UniversitasPadjadjaran"};
    private ArrayList<Univ> Unives;
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new UnivAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        data = new ArrayList<>();
        getData();
        listView.setAdapter(adapter);
        prepare();
        addItem();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String getName = data.get(i);
                Intent sendData = new Intent(MainActivity.this, DataUniv.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
                Toast.makeText(MainActivity.this, Unives.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addItem() {
        Unives = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            Univ Univ = new Univ();
            Univ.setPhoto(dataPhoto.getResourceId(i, -1));
            Univ.setName(dataName[i]);
            Univ.setDescription(dataDescription[i]);
            Unives.add(Univ);
        }
        adapter.setUnives(Unives);
    }
    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }
    private void getData(){
        Collections.addAll(data, Nama);
    }
}
