package saberapplications.pawpads.databinding;

import android.databinding.BindingConversion;

import java.util.Date;


public class BindingConverters {
    @BindingConversion
    public static String convertDateToString(Date date) {
        if (date != null) {
            return String.format("%tF", date);
        } else {
            return "-";
        }

    }

}
