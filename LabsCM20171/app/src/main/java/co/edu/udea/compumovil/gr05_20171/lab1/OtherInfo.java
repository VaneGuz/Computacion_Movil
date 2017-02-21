package co.edu.udea.compumovil.gr05_20171.lab1;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;

public class OtherInfo extends AppCompatActivity {

    Bundle datos3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_info);

        datos3= getIntent().getBundleExtra("datos");

        /*Intent intent = getIntent();

        String name = intent.getExtras().getString("name");
        String last_name = intent.getExtras().getString("name");
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(name);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_other_info);
        layout.addView(textView);
*/
        CheckBox leer = (CheckBox) findViewById(R.id.checkBoxLeer);
        CheckBox cantar= (CheckBox) findViewById(R.id.checkBoxCantar);
        CheckBox bailar= (CheckBox) findViewById(R.id.checkBoxBailar);
        CheckBox nadar= (CheckBox) findViewById(R.id.checkBoxNadar);
        CheckBox verTv= (CheckBox) findViewById(R.id.checkBoxVerTv);

        RatingBar rateLeer = (RatingBar) findViewById(R.id.ratingBarleer);

        rateLeer.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

            }
        });


        if(leer.isChecked()){
            datos3.putString("leer", "leer");

        }
        if(cantar.isChecked()){
            datos3.putString("cantar", "cantar");
        }
        if(bailar.isChecked()){
            datos3.putString("bailar", "bailar");
        }
        if(nadar.isChecked()){
            datos3.putString("nadar", "nadar");
        }
        if(verTv.isChecked()){
            datos3.putString("verTv", "ver Tv");
        }
    }

    public void setNewIntent(View view) {


        /*datos3.putString("direccion", address.getText().toString());
        datos3.putString("telefono", telephone.getText().toString());
        datos3.putString("correo", mail.getText().toString());
        datos3.putString("ciudad", autoCompleteCiudades.getText().toString());
        datos3.putString("pais", autoCompletePaises.toString());
        datos3.putString("direccion", address.toString());
*/

        Intent otherInfo = new Intent(view.getContext(), OtherInfo.class);
        otherInfo.putExtra("datos", datos3);
        startActivity(otherInfo);
    }



}
