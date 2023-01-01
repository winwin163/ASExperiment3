package com.example.experiment3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class MidiaPlayer extends AppCompatActivity {
    ImageView img = null;
    int count = 0;
    int[] imgRes = {R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,R.drawable.photo5,R.drawable.photo6,R.drawable.photo7,R.drawable.photo8,R.drawable.photo9,R.drawable.photo10,R.drawable.photo11,R.drawable.photo12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midiaplayer);
        Bitmap bm = BitmapFactory.decodeResource(this.getResources(),imgRes[count]);
        img = (ImageView)findViewById(R.id.imageView);
        img.setBackgroundResource(R.drawable.my_frameanimation);
        AnimationDrawable mAd = (AnimationDrawable) MidiaPlayer.this.img.getBackground();
        mAd.start();
        MediaPlayer mediaPlayer = MediaPlayer.create(MidiaPlayer.this, R.raw.music);
        mediaPlayer.start();

    }
}