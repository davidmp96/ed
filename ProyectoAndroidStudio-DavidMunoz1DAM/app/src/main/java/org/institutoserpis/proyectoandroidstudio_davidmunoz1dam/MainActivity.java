package org.institutoserpis.proyectoandroidstudio_davidmunoz1dam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtNombre.setTextSize(40);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        btnAceptar.setTextSize(40);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(MainActivity.this, Saludo_Activity.class);
                Bundle b = new Bundle();
                b.putString("NOMBRE", txtNombre.getText().toString());

                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }
}
