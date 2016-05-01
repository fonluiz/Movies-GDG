package br.edu.ufcg.harrypottermovies;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PostersActivity extends AppCompatActivity {

    private GridView postersGrid;
    {MoviesRepository.createMovies();}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posters);

        // Set the tittle of the action bar
        getSupportActionBar().setTitle(R.string.posters_activity_title);

        // Initialize the grid view and set its adapter
        postersGrid = (GridView) findViewById(R.id.posters_grid_view);
        postersGrid.setAdapter(new PostersAdapter(this));

        postersGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showMovieDetails = new Intent(view.getContext(), MovieDetailsActivity.class);
                showMovieDetails.putExtra("MOVIE", position);
                startActivity(showMovieDetails);
            }
        });
    }
}
