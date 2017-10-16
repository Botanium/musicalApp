package com.example.android.musical;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;





public class MainActivity extends AppCompatActivity {

    CardView songs;
    CardView artist;
    CardView albums;
    CardView genre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songs = (CardView) findViewById(R.id.tracks_card_view);
        albums = (CardView) findViewById(R.id.albums_card_view);
        artist = (CardView) findViewById(R.id.artists_card_view);
        genre = (CardView) findViewById(R.id.genres_card_view);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(view.getContext(), SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(view.getContext(), ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(view.getContext(), AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(view.getContext(), CategoryActivity.class);
                startActivity(categoryIntent);
            }
        });

    }
}
