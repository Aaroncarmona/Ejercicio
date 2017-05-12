package mx.com.iubix.ejercicio.util;

//import android.support.design.widget.Snackbar;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by raily on 11/05/2017.
 */

public class Util {

    public static void Toast(Context context , String text){
        Toast.makeText( context, text, Toast.LENGTH_SHORT ).show();
    }
    /*
        dependencia
            compile 'com.android.support:design:23.4.0'

    public static void Snack( View view, String text ){
        Snackbar.make(view, text, Snackbar.LENGTH_SHORT ).show();
    }

    public static void Snack(View view , String text , final String ALERTA , final String NOTIFICACION){
        Snackbar.make(view,text,Snackbar.LENGTH_SHORT)
        .setAction("Accion", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(ALERTA,NOTIFICACION);
            }
        })
        .show();
    }

    public static void Snack(View view, String text , int color){
        Snackbar.make(view, text , Snackbar.LENGTH_SHORT)
                .setActionTextColor(color)
                .show();
    }

    public static void Snack(View view, String text , int color , final String ALERTA ){
        Snackbar.make(view, text , Snackbar.LENGTH_SHORT)
                .setActionTextColor(color)
                .setAction(ALERTA, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                }).show();
    }*/
}
