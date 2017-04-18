package nefersky.settingsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showSettings(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void showRingtoneSettings(){
        Intent intent = new Intent(this, RingtonePreferenceActivity.class);
        startActivity(intent);
    }

    public void onClickSettings(View view) {
        showSettings();
    }

    public void onClickRingtoneSettings(View view) {
       showRingtoneSettings();
    }
}
