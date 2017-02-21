package co.edu.udea.compumovil.gr05_20171.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShowInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
    }


    public void setNewIntent(View view) {
        Bundle datos4 = getIntent().getBundleExtra("datos");


        /*datos3.putString("direccion", address.getText().toString());
        datos3.putString("telefono", telephone.getText().toString());
        datos3.putString("correo", mail.getText().toString());
        datos3.putString("ciudad", autoCompleteCiudades.getText().toString());
        datos3.putString("pais", autoCompletePaises.toString());
        datos3.putString("direccion", address.toString());
*/

        Intent otherInfo = new Intent(view.getContext(), OtherInfo.class);
        otherInfo.putExtra("datos", datos4);
        startActivity(otherInfo);
    }

}
