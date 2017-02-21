package co.edu.udea.compumovil.gr05_20171.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.view.ViewGroup;

public class ContactInfo extends AppCompatActivity {

    EditText address, telephone, mail;
    AutoCompleteTextView autoCompletePaises, autoCompleteCiudades;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);


        address = (EditText) findViewById(R.id.address);

        telephone = (EditText)findViewById(R.id.telefono);

        mail = (EditText)findViewById(R.id.mail);

/*
        AutoCompleteTextView pais = (AutoCompleteTextView) findViewById(R.id.pais);
        autoCompletePaises = (AutoCompleteTextView) findViewById(R.id.pais);


        String[] paises = getResources().getStringArray(R.array.paises_arrays);

        ArrayAdapter<String> adapterPais = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        autoCompletePaises.setAdapter(adapterPais);

        autoCompleteCiudades = (AutoCompleteTextView) findViewById(R.id.ciudad);
        String[] ciudades = getResources().getStringArray(R.array.ciudades_arrays);

        ArrayAdapter<String> adapterCiudad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ciudades);
        autoCompleteCiudades.setAdapter(adapterCiudad);
*/

    }

    public void setNewIntent2(View view) {
        Bundle datos = getIntent().getBundleExtra("datos");
/*
        datos.putString("direccion", address.getText().toString());
        datos.putString("telefono", telephone.getText().toString());
        datos.putString("correo", mail.getText().toString());
        datos2.putString("ciudad", autoCompleteCiudades.getText().toString());
        datos2.putString("pais", autoCompletePaises.toString());*/


        Intent otherInfo = new Intent(view.getContext(), OtherInfo.class);
        otherInfo.putExtra("datos", datos);
        startActivity(otherInfo);


        Log.d("EJECUTO METODO", "EJECUTO METODO");
    }


   public void showNextActivity(View view){

        Bundle datos = getIntent().getBundleExtra("datos");
       datos.putString("ciudad", autoCompleteCiudades.getText().toString());
       datos.putString("correo", mail.getText().toString());
       datos.putString("pais", autoCompletePaises.toString());
       datos.putString("direccion", address.getText().toString());
       datos.putString("telefono", telephone.getText().toString());

        Intent otherInfo = new Intent(view.getContext(),OtherInfo.class);
        otherInfo.putExtra("datos",datos);
        startActivity(otherInfo);

    }


}

