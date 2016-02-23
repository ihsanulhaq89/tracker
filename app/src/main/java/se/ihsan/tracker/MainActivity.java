package se.ihsan.tracker;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_client).setOnClickListener(this);
        findViewById(R.id.btn_server).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_client:
                Intent i = new Intent(MainActivity.this, Client.class);
                startActivity(i);
                break;
            case R.id.btn_server:

                Intent i2 = new Intent(MainActivity.this, Server.class);
                startActivity(i2);
                break;
        }
    }
}
