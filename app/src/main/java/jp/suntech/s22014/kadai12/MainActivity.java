package jp.suntech.s22014.kadai12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.btsend);
        button1.setOnClickListener(new ButtonClickListener());
        Button button2 = findViewById(R.id.btclear);
        button2.setOnClickListener(new ButtonClickListener());
        Button button3 = findViewById(R.id.btconfirm);
        button3.setOnClickListener(new ButtonClickListener());
    }
    private class ButtonClickListener implements View.OnClickListener{


        @Override
        public void onClick(View view){
            EditText input1 = findViewById(R.id.etname);
            EditText input2 = findViewById(R.id.etmail);
            EditText input3 = findViewById(R.id.etmailtitle);
            EditText input4 = findViewById(R.id.etcommnet);

            int id = view.getId();

            if(id == R.id.btsend){
                String inputStr1 = input1.getText().toString();
                String inputStr2 = input2.getText().toString();
                String inputStr3 = input3.getText().toString();
                String inputStr4 = input4.getText().toString();
                String inputStr5 = "名前は"+inputStr1+"、メールアドレスは"+inputStr2+"、タイトルは"+inputStr3+"、内容は"+inputStr4;
                Toast.makeText(MainActivity.this,inputStr5,Toast.LENGTH_LONG).show();
            }
            else if(id == R.id.btclear){
                input1.setText("");
                input2.setText("");
                input3.setText("");
                input4.setText("");
            }
            else if (id == R.id.btconfirm) {
                ConfirmDialog dialogFragment = new ConfirmDialog();
                dialogFragment.show(getSupportFragmentManager(),"ConfirmDialogFragment");
            }


        }

    }
}