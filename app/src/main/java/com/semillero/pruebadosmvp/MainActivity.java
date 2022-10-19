package com.semillero.pruebadosmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etLeerNumero;
    TextView muestraSalida;
    Button btnOrganizar;
    String listaNumeros;
    String[] listaNumerosTetx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        etLeerNumero = findViewById( R.id.etLeerNumero );
        muestraSalida = findViewById( R.id.entradaMuestra );
        btnOrganizar = findViewById( R.id.btnOrganizar );


        btnOrganizar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listaNumeros = etLeerNumero.getText().toString();

                listaNumerosTetx = listaNumeros.split( " " );

                int temporal;

                for (int i = 0; i < listaNumerosTetx.length - 1; i++) { // CICLOS

                    for (int j = 0; j < listaNumerosTetx.length - 1; j++) { //METODO DE ORDENAMIENTO

                        if (Integer.parseInt( listaNumerosTetx[j] ) > Integer.parseInt( listaNumerosTetx[j + 1] )) { //   SI EL ACTUAL ES MAYOR QUE SEIGUIENTE, SE INTERCAMBIA

                            temporal = Integer.parseInt( listaNumerosTetx[j] ); // LA AUXILIAR SE IGUALA A LA ACTUAL

                            listaNumerosTetx[j] = listaNumerosTetx[j + 1]; //EL SIGUIENTE AHORA SERA EL ACTUAL

                            listaNumerosTetx[j + 1] = String.valueOf( temporal ); //  SIGUIENTE ES IGUAL AL ACTUAL QUE SE ASIGTNO EN EL AUXILIAR
                        }

                    }


                    //SALIDA DE ORDENAMIENTO

                    StringBuilder str = new StringBuilder();

                    for (int n = listaNumerosTetx.length -1; n>=0; n--) {
                        str.append( listaNumerosTetx[n]+("-"));

                    }
                    muestraSalida.setText( str );



                }

            }
        } );


    }

}