package ch.samt.bosco.modulo335j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/**
 * Splash screen activity.
 *
 * @author giuliobosco
 * @author bryanbeffa
 * @version 1.1 (2019-11-11 - 2019-11-11)
 */
public class SplashScreenActivity extends AppCompatActivity {

    /**
     * Splash screen time, timer before start main activity (1000ms)
     */
    private final int SPLASH_SCREEN_TIME = 1000;

    /**
     * On create splash screen set timer of SPLASH_SCREEN_TIME, before start MainActivity.
     *
     * @param savedInstanceState Saved Instance State bundle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainContext = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(mainContext);
                finish();
            }
        }, SPLASH_SCREEN_TIME);
    }

    /**
     * On windows focus change, if has focus hide system UI.
     *
     * @param hasFocus True if the window has focus.
     */
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    /**
     * Hide system UI.
     * Enables regular immersive mode.
     * For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
     * Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
     *
     * Set the content to appear under the system bars so that the content doesn't resize when the
     * system bars hide and show.
     *
     * Hide the nav bar and status bar.
     */
    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
