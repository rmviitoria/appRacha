package br.ulbra.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3;
    Button btnCalcular;
    TextView txtResultado;
    double v1, v2, divisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.edit1);
        ed2 = (EditText) findViewById(R.id.edit2);
        ed3 = (EditText) findViewById(R.id.edit3);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ed2.getText().toString());
                v2 = Double.parseDouble(ed3.getText().toString());
                divisao = v1 / v2;
                txtResultado.setText("Resultado: " + divisao);
            }
        });
    }
}