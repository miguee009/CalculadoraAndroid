package com.example.a0migue.calculadora1.mycalculadora;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.xpath.XPathExpression;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.mXparser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView texto;
    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,punto
            ,cero,mas,menos,igual,mult,div,ca,mod,del,potn,salir;
    int anterior=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView)findViewById(R.id.mitexto);
        uno = (Button)findViewById(R.id.boton1);
        dos = (Button)findViewById(R.id.boton2);
        tres = (Button)findViewById(R.id.boton3);
        cuatro = (Button)findViewById(R.id.boton4);
        cinco = (Button)findViewById(R.id.boton5);
        seis = (Button)findViewById(R.id.boton6);
        siete = (Button)findViewById(R.id.boton7);
        ocho = (Button)findViewById(R.id.boton8);
        nueve = (Button)findViewById(R.id.boton9);
        cero = (Button)findViewById(R.id.boton0);
        punto = (Button)findViewById(R.id.botonpunto);
        igual = (Button)findViewById(R.id.botonigual);
        mult = (Button)findViewById(R.id.botonmult);
        div = (Button)findViewById(R.id.botondiv);
        mas = (Button)findViewById(R.id.botonsuma);
        menos = (Button)findViewById(R.id.botonmenos);
        ca = (Button)findViewById(R.id.ca);
        mod = (Button)findViewById(R.id.mod);
        del = (Button)findViewById(R.id.delete);
        potn = (Button)findViewById(R.id.potn);
        salir = (Button)findViewById(R.id.salir);

        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        cero.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        igual.setOnClickListener(this);
        punto.setOnClickListener(this);
        mas.setOnClickListener(this);
        menos.setOnClickListener(this);
        ca.setOnClickListener(this);
        mod.setOnClickListener(this);
        del.setOnClickListener(this);
        potn.setOnClickListener(this);
        salir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String result;
        String cola;

        if(anterior==R.id.botonigual){
            texto.setText("");
        }

        switch (v.getId()){
            case R.id.boton1:
                result = uno.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton2:
                result = dos.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton3:
                result = tres.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton4:
                result = cuatro.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton5:
                result = cinco.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton6:
                result = seis.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton7:
                result = siete.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton8:
                result = ocho.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton9:
                result = nueve.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.boton0:
                result = cero.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.botonpunto:
                result = punto.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.botonigual:
                Expression e = new Expression(texto.getText().toString());
                texto.setText(String.valueOf(e.calculate()));
                break;
            case R.id.botonmult:
                result = mult.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.botondiv:
                result = div.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.botonsuma:
                result = mas.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.botonmenos:
                result = menos.getText().toString();
                cola = texto.getText().toString();
                texto.setText(cola+result);
                break;
            case R.id.delete:
                cola = texto.getText().toString();
                int length = cola.length();
                if(length>0) {
                    cola = cola.substring(0, length - 1);
                    texto.setText(cola);
                }
                break;
            case R.id.potn:
                cola = texto.getText().toString();
                texto.setText(cola+"^");
                break;
            case R.id.mod:
                cola = texto.getText().toString();
                texto.setText(cola+"#");
                break;
            case R.id.ca:
                texto.setText("");
                break;
            case R.id.salir:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setMessage("Seguro que desea cerrar la aplicacion?")
                .setCancelable(false)
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();
                break;
        }
        anterior = v.getId();
    }
}
