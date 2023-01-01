package com.example.experiment3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class change extends AppCompatActivity {
    ImageView img = null;
    Button but = null;
    int count = 0;
    int[] imgRes = {R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,R.drawable.photo5,R.drawable.photo6,R.drawable.photo7,R.drawable.photo8,R.drawable.photo9,R.drawable.photo10,R.drawable.photo11,R.drawable.photo12};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Bitmap bm = BitmapFactory.decodeResource(this.getResources(),imgRes[count]);
        img = (ImageView)findViewById(R.id.imageView);
        but = (Button)findViewById(R.id.but_next);
        img.setImageBitmap(bm);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (count == 13) {
                    count = 0;
                }
                BitmapFactory.Options opt = new BitmapFactory.Options();
                opt.inSampleSize = 2;   /*2倍缩放图片*/
                opt.inDither = false;   /*不进行图片抖动处理*/
                opt.inPreferredConfig = null;   /*设置让解码器以最佳方式解码*/
                Bitmap bm2 = BitmapFactory.decodeResource(change.this.getResources(), imgRes[count], opt);
                img.setImageBitmap(bm2);
            }
        });
    }
}
