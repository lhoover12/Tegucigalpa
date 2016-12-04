package com.example.zr8636gk.tegucigalpa;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton button = (ImageButton) findViewById(R.id.Button2);
        final ImageButton button2 = (ImageButton) findViewById(R.id.Button);
        final ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView imageView3= (ImageView) findViewById(R.id.imageView3);
        final ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        final ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        final ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        final ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                final TextView text = (TextView) findViewById(R.id.textView2);
                text.setText("Michael Smells");
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);


                new CountDownTimer(7000, 200) {
                    public void onFinish() {
                        text.setText("Tegucigalpa");
                        text.setTextSize(24);
                        button.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);


                    }

                    public void onTick(long millisUntilFinished) {
                        // millisUntilFinished    The amount of time until finished.

                        Random rand = new Random();
                        int n = rand.nextInt(50);
                        text.setTextSize(n);
                        text.setTextColor(Color.rgb(getN(), getN(), getN()));

                    }
                }.start();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                final TextView text = (TextView) findViewById(R.id.textView2);

                text.setText("How Smelly is Michael?");
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                progressBar.setVisibility(View.VISIBLE);


                new CountDownTimer(10000, 100) {
                    int c = 0;
                    boolean b;
                    public void onFinish() {
                        text.setTextColor(Color.BLACK);
                        text.setText("Smelliness Overload");
                        text.setTextSize(24);
                        button.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.INVISIBLE);


                    }

                    public void onTick(long millisUntilFinished) {
                        // millisUntilFinished    The amount of time until finished.
                        c++;

                        if (c < 50) {
                            text.setText("How Smelly is Michael? " + c + " %");
                        } else if (c > 50 && c < 75) {
                            text.setText("Critical Smelliness " + c + " %");
                        } else if (c > 75) {
                            text.setText("Danger! " + c + " %");
                            if (b == true) {
                                text.setTextColor(Color.WHITE);
                                b = false;
                            } else {
                                text.setTextColor(Color.RED);
                                b = true;
                            }
                        }
                        progressBar.setProgress(c);

                    }
                }.start();

            }


        });

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {
                final TextView text = (TextView) findViewById(R.id.textView2);

                text.setText("How Smelly is Michael?");
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.VISIBLE);
                imageView7.setVisibility(View.VISIBLE);

                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
                imageView5.setVisibility(View.VISIBLE);
                imageView6.setVisibility(View.VISIBLE);
                imageView2.setScaleY(500);



                new CountDownTimer(5000, 5) {
                    int c = 0;

                    public void onFinish() {
                        text.setText("Tegucigalpa");
                        text.setTextSize(24);
                        button.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.INVISIBLE);
                        imageView3.setVisibility(View.INVISIBLE);
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView6.setVisibility(View.INVISIBLE);
                        imageView7.setVisibility(View.INVISIBLE);
                        imageView.setVisibility(View.INVISIBLE);
                        imageView2.setY(500);

                        imageView3.setY(500);

                        imageView4.setY(500);
                        imageView5.setY(500);
                        imageView6.setY(500);


                    }

                    public void onTick(long millisUntilFinished) {
                        // millisUntilFinished    The amount of time until finished.
                       float ro = imageView.getRotationX();
                        ro= ro +10;
                        imageView.setRotationX(ro);
                        imageView2.setY(imageView2.getY() -2);

                        imageView3.setY(imageView3.getY() -4);

                        imageView4.setY(imageView4.getY() -3);
                        imageView5.setY(imageView5.getY() -8);
                        imageView6.setY(imageView6.getY() -10);



                    }
                }.start();

            }


        });



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    private int getN() {
        Random rand = new Random();
        int n = rand.nextInt(255);
        return n;
    }




    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2.connect();
        AppIndex.AppIndexApi.start(client2, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client2, getIndexApiAction());
        client2.disconnect();
    }
}
