package br.edu.ufcg.harrypottermovies;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MovieDetailsActivity extends AppCompatActivity {

    private Movie mMovie;
    private TextView movieTitleField;
    private ImageView posterField;
    private TextView yearField;
    private TextView timeField;
    private TextView ratingField;
    private Button markAsFavoriteeBtn;
    private ImageView favoriteIcon;
    private TextView descriptionField;
    private LinearLayout trailer1;
    private LinearLayout trailer2;

    private SharedPreferences favoritePref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        // receive the movie index that came with the intent
        int movieIndex = (int) getIntent().getExtras().get("MOVIE");
        mMovie = MoviesRepository.getMoviesList().get(movieIndex);

        favoritePref = this.getPreferences(Context.MODE_PRIVATE);


        // Set the tittle of the action bar
        getSupportActionBar().setTitle(R.string.movie_details_activity_title);

        // Initialize the fields according to the movie selected
        movieTitleField = (TextView) findViewById(R.id.movie_title_field);
        posterField = (ImageView) findViewById(R.id.poster_field);
        yearField = (TextView) findViewById(R.id.year_field);
        timeField = (TextView) findViewById(R.id.time_field);
        ratingField = (TextView) findViewById(R.id.rating_field);
        markAsFavoriteeBtn = (Button) findViewById(R.id.mark_as_favorite_btn);
        favoriteIcon = (ImageView) findViewById(R.id.favorite_icon);
        descriptionField = (TextView) findViewById(R.id.description_field);
        trailer1 = (LinearLayout) findViewById(R.id.trailer1);
        trailer2 = (LinearLayout) findViewById(R.id.trailer2);

        movieTitleField.setText(mMovie.getTitle());
        posterField.setImageResource(mMovie.getPoster());
        yearField.setText(String.valueOf(mMovie.getYear()));
        timeField.setText(mMovie.getTime());
        ratingField.setText(mMovie.getRating() + "/10");
        descriptionField.setText(mMovie.getDescription());

        onClickTrailers();
        onClickMarkAsFavoriteBtn();
        checkIfMovieIsFavorite();
    }

    private void checkIfMovieIsFavorite() {
        boolean defaultValue = false;
        boolean isFavorite = favoritePref.getBoolean("isFavorite", defaultValue);

        if (isFavorite) {
            favoriteIcon.setVisibility(View.VISIBLE);
            markAsFavoriteeBtn.setText(R.string.unmark_as_favorite_btn);
        } else {
            favoriteIcon.setVisibility(View.INVISIBLE);
            markAsFavoriteeBtn.setText(R.string.mark_as_favorite_btn);
        }
    }

    private void onClickMarkAsFavoriteBtn() {
        markAsFavoriteeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mMovie.isFavorite())
                    mMovie.setIsFavorite(true);
                else
                    mMovie.setIsFavorite(false);
                saveFavoritePreferences();
                checkIfMovieIsFavorite();
            }
        });
    }

    private void saveFavoritePreferences() {
        SharedPreferences.Editor editor = favoritePref.edit();
        editor.putBoolean("isFavorite", mMovie.isFavorite());
        editor.commit();
    }

    private void onClickTrailers() {
        trailer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent watchTrailer = new Intent(Intent.ACTION_VIEW, Uri.parse(mMovie.getTrailers()[0]));
                startActivity(watchTrailer);
            }
        });

        trailer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent watchTrailer = new Intent(Intent.ACTION_VIEW, Uri.parse(mMovie.getTrailers()[1]));
                startActivity(watchTrailer);
            }
        });
    }


}
