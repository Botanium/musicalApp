package com.example.android.musical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class AlbumsActivity extends AppCompatActivity {

    Button subscribe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        subscribe = (Button) findViewById(R.id.subscribe_button);

        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent subscribeIntent = new Intent(view.getContext(),PaymentActivity.class);
                startActivity(subscribeIntent);
            }
        });

    }
}
