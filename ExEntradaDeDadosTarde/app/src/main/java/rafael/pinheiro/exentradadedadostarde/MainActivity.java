package rafael.pinheiro.exentradadedadostarde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import rafael.pinheiro.exentradadedadostarde.model.Pessoa;

public class MainActivity extends AppCompatActivity  implements View.OnLongClickListener, View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        bt1.setOnClickListener(this);
        bt1.setOnLongClickListener(this);
        bt2.setOnClickListener(this);
        bt2.setOnLongClickListener(this);
        bt3.setOnClickListener(this);
        bt3.setOnLongClickListener(this);
        bt4.setOnClickListener(this);
        bt4.setOnLongClickListener(this);
        bt5.setOnClickListener(this);
        bt5.setOnLongClickListener(this);
        bt6.setOnClickListener(this);
        bt6.setOnLongClickListener(this);
        bt7.setOnClickListener(this);
        bt7.setOnLongClickListener(this);
        bt8.setOnClickListener(this);
        bt8.setOnLongClickListener(this);
        bt9.setOnClickListener(this);
        bt9.setOnLongClickListener(this);

    }

    @Override
    public boolean onLongClick(View v) {
        switch (v.getId()){
            case R.id.bt_1:
                bt1.setText("O");
                break;
            case R.id.bt_2:
                bt2.setText("O");
                break;
            case R.id.bt_3:
                bt3.setText("O");
                break;
            case R.id.bt_4:
                bt4.setText("O");
                break;
            case R.id.bt_5:
                bt5.setText("O");
                break;
            case R.id.bt_6:
                bt6.setText("O");
                break;
            case R.id.bt_7:
                bt7.setText("O");
                break;
            case R.id.bt_8:
                bt8.setText("O");
                break;
            case R.id.bt_9:
                bt9.setText("O");
                break;

        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_1:
                bt1.setText("X");
                break;
            case R.id.bt_2:
                bt2.setText("X");
                break;
            case R.id.bt_3:
                bt3.setText("X");
                break;
            case R.id.bt_4:
                bt4.setText("X");
                break;
            case R.id.bt_5:
                bt5.setText("X");
                break;
            case R.id.bt_6:
                bt6.setText("X");
                break;
            case R.id.bt_7:
                bt7.setText("X");
                break;
            case R.id.bt_8:
                bt8.setText("X");
                break;
            case R.id.bt_9:
                bt9.setText("X");
                break;
        }
    }
    private void toast(String msg){

    }

    private void initialize(){
        bt1=findViewById(R.id.bt_1);
        bt2=findViewById(R.id.bt_2);
        bt3=findViewById(R.id.bt_3);
        bt4=findViewById(R.id.bt_4);
        bt5=findViewById(R.id.bt_5);
        bt6=findViewById(R.id.bt_6);
        bt7=findViewById(R.id.bt_7);
        bt8=findViewById(R.id.bt_8);
        bt9=findViewById(R.id.bt_9);
    }
}
