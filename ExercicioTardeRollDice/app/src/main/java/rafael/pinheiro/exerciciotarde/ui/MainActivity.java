package rafael.pinheiro.exerciciotarde.ui;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import rafael.pinheiro.exerciciotarde.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }

    private void alert(){
        AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Critical!");
        alert.setMessage("Double Damage!");
        alert.setIcon(ContextCompat.getDrawable(MainActivity.this,R.mipmap.ic_launcher));
        alert.setNeutralButton("OK",null);
    }
}
