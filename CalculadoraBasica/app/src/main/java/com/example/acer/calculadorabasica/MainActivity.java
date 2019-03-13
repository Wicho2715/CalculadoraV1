package com.example.acer.calculadorabasica;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etValor1;
    private EditText etValor2;
    private EditText etResultado;
    private Button btSuma;
    private Button btResta;
    private Button btMultiplicar;
    private Button btDividir;
    private Button btModulo;
    private Button btBorrar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etValor1=(EditText)findViewById(R.id.etValor1);
        etValor2=(EditText)findViewById(R.id.etValor2);
        etResultado=(EditText)findViewById(R.id.etResultado);
        btSuma=(Button)findViewById(R.id.btSuma);
        btResta=(Button)findViewById(R.id.btResta);
        btMultiplicar=(Button)findViewById(R.id.btMultiplicar);
        btDividir=(Button)findViewById(R.id.btDividir);
        btModulo=(Button)findViewById(R.id.btModulo);
        btBorrar=(Button)findViewById(R.id.btBorrar);

    }
    public void Suma(View view){
        String valor1=etValor1.getText().toString();
        String valor2=etValor2.getText().toString();
        if (TextUtils.isEmpty(valor1)||TextUtils.isEmpty(valor2)){
            Toast.makeText(this, "Un campo esta vacio", Toast.LENGTH_LONG).show();
        }else{
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            Operacion(String.valueOf(nro1+nro2));
        }
    }
    public void Resta(View view){
        String valor1=etValor1.getText().toString();
        String valor2=etValor2.getText().toString();
        if (TextUtils.isEmpty(valor1)||TextUtils.isEmpty(valor2)){
            Toast.makeText(this, "Un campo esta vacio", Toast.LENGTH_LONG).show();
        }else{
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            Operacion(String.valueOf(nro1-nro2));
        }
    }
    public void Multiplicar(View view){
        String valor1=etValor1.getText().toString();
        String valor2=etValor2.getText().toString();
        if (TextUtils.isEmpty(valor1)||TextUtils.isEmpty(valor2)){
            Toast.makeText(this, "Un campo esta vacio", Toast.LENGTH_LONG).show();
        }else{
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            Operacion(String.valueOf(nro1*nro2));
        }
    }
    public void Modulo(View view){
        String valor1=etValor1.getText().toString();
        String valor2=etValor2.getText().toString();
        if (TextUtils.isEmpty(valor1)||TextUtils.isEmpty(valor2)){
            Toast.makeText(this, "Un campo esta vacio", Toast.LENGTH_LONG).show();
        }else{
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            Operacion(String.valueOf(nro1+nro2));
        }
    }

    public void Dividir(View view){
        String numero1=etValor1.getText().toString();
        String numero2=etValor2.getText().toString();
        if (TextUtils.isEmpty(numero1)||TextUtils.isEmpty(numero2)){
            Toast.makeText(this, "Un campo esta vacio", Toast.LENGTH_LONG).show();
        }else{
            double nro1=Double.parseDouble(numero1);
            double nro2=Double.parseDouble(numero2);
            if (nro2==0){
                Toast.makeText(this, "El valor debe ser diferente de 0",Toast.LENGTH_LONG).show();
            }else{
                Operacion(String.valueOf(nro1/nro2));
            }
        }

    }
    private void Operacion(String resu){
        etResultado.setText(resu);
        etValor1.setEnabled(false);
        etValor2.setEnabled(false);
        btSuma.setEnabled(false);
        btResta.setEnabled(false);
        btMultiplicar.setEnabled(false);
        btDividir.setEnabled(false);
        btModulo.setEnabled(false);
        btBorrar.setEnabled(true);
    }
    public void Borrar(View view){
        etResultado.setText("");
        etValor1.setText("");
        etValor2.setText("");
        etValor1.setEnabled(true);
        etValor2.setEnabled(true);
        btSuma.setEnabled(true);
        btResta.setEnabled(true);
        btMultiplicar.setEnabled(true);
        btDividir.setEnabled(true);
        btModulo.setEnabled(true);
        btBorrar.setEnabled(false);
    }
}