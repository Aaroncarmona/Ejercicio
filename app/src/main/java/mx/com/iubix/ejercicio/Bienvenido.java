package mx.com.iubix.ejercicio;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mx.com.iubix.ejercicio.util.Util;

public class Bienvenido extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);


    }

    public void onClick(View view) {

        Util.Toast(this, getResources().getString(R.string.snackBarBienvenido));

        Intent intent = new Intent(this,My_music.class);
        startActivity(intent);

    }

}
