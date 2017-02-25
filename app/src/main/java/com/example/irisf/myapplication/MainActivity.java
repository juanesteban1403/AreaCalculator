package com.example.irisf.myapplication;

import android.media.Image;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup1;
    ImageView image1;
    EditText ancho,largo,alto,radio;
    double la1,an1,al1,r1,resul;
    String la="0";
    String an="0";
    String al="0";
    String r = "0";
    String aux;
    Button calcular;
    TextView resultado;

    int flag =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup1=(RadioGroup)findViewById(R.id.rg1);
        image1=(ImageView) findViewById(R.id.imagen1);
        ancho=(EditText)findViewById(R.id.ancho);
        largo=(EditText)findViewById(R.id.largo);
        alto=(EditText)findViewById(R.id.alto);
        radio=(EditText)findViewById(R.id.radio);
        resultado=(TextView)findViewById(R.id.resultado);
        calcular=(Button)findViewById(R.id.calcular);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();



        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rcirculo){
                    image1.setImageResource(R.drawable.circulo);
                    largo.setVisibility(View.INVISIBLE);
                    ancho.setVisibility(View.INVISIBLE);
                    alto.setVisibility(View.INVISIBLE);
                    radio.setVisibility(View.VISIBLE);

                    flag=1;

                }
                else if (checkedId == R.id.rtriangulo){
                    image1.setImageResource(R.drawable.triangulo);
                    largo.setVisibility(View.INVISIBLE);
                    ancho.setVisibility(View.VISIBLE);
                    alto.setVisibility(View.VISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    flag=2;
                }
                else if(checkedId == R.id.rcuadrado){
                    image1.setImageResource(R.drawable.cuadrado);

                    largo.setVisibility(View.INVISIBLE);
                    ancho.setVisibility(View.VISIBLE);
                    alto.setVisibility(View.VISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    flag=3;
                }
                else if(checkedId == R.id.rcubo){
                    image1.setImageResource(R.drawable.cubo);
                    largo.setVisibility(View.VISIBLE);
                    ancho.setVisibility(View.VISIBLE);
                    alto.setVisibility(View.VISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    flag=4;
                }
            }
        });
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1){
                    if(Double.parseDouble(radio.getText().toString())==0){
                        Toast.makeText(MainActivity.this, "Ingrese Números correspondiente", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        r = radio.getText().toString();
                        r1 = Double.parseDouble(r);
                        resul = r1 * r1*3.1415;
                        aux = Double.toString(resul);
                        resultado.setText(aux);
                    }
                }
                else if(flag==2){
                    if(Double.parseDouble(ancho.getText().toString())== 0||Double.parseDouble(alto.getText().toString())==0){
                        Toast.makeText(MainActivity.this, "Ingrese Números correspondiente", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        an = ancho.getText().toString();
                        an1 = Double.parseDouble(an);
                        al = alto.getText().toString();
                        al1 = Double.parseDouble(al);
                        resul = (an1 * al1) / 2;
                        aux = Double.toString(resul);
                        resultado.setText(aux);
                    }
                }
                else if(flag==3){
                    if(Double.parseDouble(ancho.getText().toString())== 0||Double.parseDouble(alto.getText().toString())==0){
                        Toast.makeText(MainActivity.this, "Ingrese Números correspondiente", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        an = ancho.getText().toString();
                        an1 = Double.parseDouble(an);
                        al = alto.getText().toString();
                        al1 = Double.parseDouble(al);
                        resul = an1 * al1;
                        aux = Double.toString(resul);
                        resultado.setText(aux);
                    }
                }
                else if(flag ==4){
                    if(Double.parseDouble(ancho.getText().toString())== 0||Double.parseDouble(alto.getText().toString())==0 || Double.parseDouble(largo.getText().toString())==0){
                        Toast.makeText(MainActivity.this, "Ingrese Números correspondiente", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        an = ancho.getText().toString();
                        an1 = Double.parseDouble(an);
                        al = alto.getText().toString();
                        al1 = Double.parseDouble(al);
                        la = largo.getText().toString();
                        la1 = Double.parseDouble(la);
                        resul = an1 * al1 * la1;
                        aux = Double.toString(resul);
                        resultado.setText(aux);
                    }
                }
                flag =0 ;

            }
        });


        }


    }







