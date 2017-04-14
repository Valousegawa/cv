package com.a2017.dev.insta.cv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Telest on 13/04/2017.
 */

public class CptActivity extends Activity {

    ImageView java, php, s, css, html, js, an, angular, git, fr, uk, ch, de;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpt_layout);

        java = (ImageView) findViewById(R.id.java);
        php = (ImageView) findViewById(R.id.php);
        s = (ImageView) findViewById(R.id.s);
        css = (ImageView) findViewById(R.id.css);
        html = (ImageView) findViewById(R.id.html);
        js = (ImageView) findViewById(R.id.js);
        an = (ImageView) findViewById(R.id.an);
        angular = (ImageView) findViewById(R.id.angular);
        git = (ImageView) findViewById(R.id.git);

        fr = (ImageView) findViewById(R.id.fr);
        uk = (ImageView) findViewById(R.id.uk);
        ch = (ImageView) findViewById(R.id.ch);
        de = (ImageView) findViewById(R.id.de);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        if(hasFocus){
            java.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            php.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            s.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            css.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            html.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            js.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            an.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            angular.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            git.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));

            fr.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            uk.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            ch.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));
            de.startAnimation(AnimationUtils.loadAnimation(CptActivity.this,
                    android.R.anim.slide_in_left|android.R.anim.fade_in));


        }
    }
}
