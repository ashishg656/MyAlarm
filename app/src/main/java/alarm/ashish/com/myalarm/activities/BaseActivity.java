package alarm.ashish.com.myalarm.activities;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import alarm.ashish.com.myalarm.R;

/**
 * Created by Ashish Goel on 1/21/2016.
 */
public class BaseActivity extends AppCompatActivity {

    Toast toast;
    Snackbar snackbar;
    Toolbar toolbar;
    int toolbarHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showToast(String text) {
        if (toast != null)
            toast.cancel();

        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showSnackBar(String text) {
        if (snackbar != null)
            snackbar.dismiss();

        snackbar = Snackbar.make(findViewById(R.id.coordinator_layout), text, Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}
