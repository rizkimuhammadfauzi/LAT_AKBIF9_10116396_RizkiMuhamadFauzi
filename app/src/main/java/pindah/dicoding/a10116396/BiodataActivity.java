package pindah.dicoding.a10116396;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class BiodataActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void slanjutnya (View view){
        Intent intent = new Intent(this, SayActivity.class);
        EditText nama = (EditText)findViewById(R.id.edt1);
        String title = nama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,title);
        startActivity(intent);
    }

}
