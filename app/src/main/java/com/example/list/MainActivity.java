package com.example.list;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Film> films = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_film);
        recyclerView.setHasFixedSize(true);
        films.addAll(FilmDataSource.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(films);
        recyclerView.setAdapter(listFilmAdapter);

        listFilmAdapter.setOnItemClickCallback(new ListFilmAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Film data) {
                showSelectedFood(data);
            }
        });
    }
    private void showSelectedFood(Film film) {
        Toast.makeText(this, "Kamu memilih " + film.getName(), Toast.LENGTH_SHORT).show();
    }
}