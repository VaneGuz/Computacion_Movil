package co.edu.udea.compumovil.gr05_20171.lab1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import java.util.Calendar;
/**
 * Created by root on 20/02/17.
 */

public class DataPickerFrangment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
@Override

    public Dialog onCreateDialog(Bundle savedInstanceState){
    final Calendar c=Calendar.getInstance();
    int year=c.get(Calendar.YEAR);
    int month=c.get(Calendar.MONTH);
    int day=c.get(Calendar.DAY_OF_MONTH);

    return new DatePickerDialog(getActivity(),this,year,month,day);


}

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        ((DatePickerDialog.OnDateSetListener)getActivity()).onDateSet(view,year,monthOfYear,dayOfMonth);
    }
}
