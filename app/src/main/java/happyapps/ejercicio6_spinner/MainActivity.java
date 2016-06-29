package happyapps.ejercicio6_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv3=(TextView) findViewById(R.id.tv3);

        spinner1=(Spinner) findViewById(R.id.spinner);
        String []opciones={"sumar","restar","multiplicar","dividir"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);

    }

    //Este metodo se ejecutara cuando se presiono el boton
    public void operar(View view){
        int nro1=Integer.parseInt(et1.getText().toString());
        int nro2=Integer.parseInt(et2.getText().toString());

        String selec=spinner1.getSelectedItem().toString();

        if (selec.equals("sumar")){
            int suma=nro1+nro2;
            String res=String.valueOf(suma);
            tv3.setText(res);
        }else
        if (selec.equals("restar")){
            int resta=nro1-nro2;
            String res=String.valueOf(resta);
            tv3.setText(res);
    }else
        if (selec.equals("dividir")){
            int dividir=nro1/nro2;
            String res=String.valueOf(dividir);
            tv3.setText(res);
}else
        if (selec.equals("multiplicar")) {
            int multiplicar = nro1 * nro2;
            String res = String.valueOf(multiplicar);
            tv3.setText(res);

        }}}