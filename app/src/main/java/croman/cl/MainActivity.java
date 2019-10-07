package croman.cl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView etUsuarioRef;
    TextView etPassRef;
    Button btnIngresarRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuarioRef = findViewById(R.id.etUsuario);
        etPassRef = findViewById(R.id.etPass);

        btnIngresarRef = findViewById(R.id.btnIngresar);

            btnIngresarRef.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(etUsuarioRef.getText().toString().equals("a") && etPassRef.getText().toString().equals("1")) {
                        Intent intent = new Intent(view.getContext(), ventana1.class);
                        startActivityForResult(intent, 0);
                        Toast.makeText(MainActivity.this, "Wena choro", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Ingresa Clave....", Toast.LENGTH_SHORT).show();
                    }
               }
            });

    }

}
