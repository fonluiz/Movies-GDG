package br.edu.ufcg.harrypottermovies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Adapter for the GridView that shows the movies's posters
 */
 public class PostersAdapter extends BaseAdapter{

    private Context mContext;
    private ImageView poster;
    // references to the movie's posters
    private int[] postersIds = MoviesRepository.getMoviesPosters();

    public PostersAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return postersIds.length;
    }

    @Override
    public Object getItem(int position) {
        return MoviesRepository.getMoviesList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return MoviesRepository.getMoviesList().get(position).hashCode();
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            poster = new ImageView(mContext);
            poster.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            poster.setAdjustViewBounds(true);
        } else {
            poster = (ImageView) convertView;
        }

        poster.setImageResource(postersIds[position]);
        return poster;
    }
}
