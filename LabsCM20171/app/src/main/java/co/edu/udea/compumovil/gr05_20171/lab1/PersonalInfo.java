package co.edu.udea.compumovil.gr05_20171.lab1;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.Date;

public class PersonalInfo extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    Date fecha = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

    }
    public void fechadenacimiento(View v){
        DialogFragment datePickerFragment=new DataPickerFrangment();
        datePickerFragment.show(getFragmentManager(),"datePicker");

    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, ContactInfo.class);
        EditText name = (EditText) findViewById(R.id.name);
        EditText last_name = (EditText) findViewById(R.id.last_name);
        String message1 = last_name.getText().toString();
        String message = name.getText().toString();
        RadioButton hombre = (RadioButton) findViewById(R.id.male);
        RadioButton mujer = (RadioButton) findViewById(R.id.female);
        String validar = "";
        Spinner gradoEscolar=(Spinner) findViewById(R.id.spinner_schoolGrade);
        if (hombre.isChecked()) {
            validar = "masculino";
        }
        if (mujer.isChecked()) {
            validar = "femenino";
        }

        /*Bundle datos=new Bundle();
        datos.putString("nombre",name.getText().toString());
        datos.putString("apellido",last_name.getText().toString());
        datos.putString("sexo",validar);
        datos.putString("fechade",fecha.toString());
        datos.putString("grado",gradoEscolar.getSelectedItem().toString());


        intent.putExtra("name", message);*/
        startActivity(intent);



    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        fecha = new Date(year, month, dayOfMonth);


    }

    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        public void onNothingSelected(AdapterView<?> parent) {
            Spinner grado = (Spinner) findViewById(R.id.spinner_schoolGrade);
            grado.setOnItemSelectedListener(this);

        }


    }
}
