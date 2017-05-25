package org.institutoserpis.proyectoandroidstudio_davidmunoz1dam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Saludo_Activity extends AppCompatActivity {
    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        txtSaludo = (TextView)findViewById(R.id.txtSaludo);

        Bundle bundle = this.getIntent().getExtras();

        txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
        txtSaludo.setTextSize(40);
    }
}
