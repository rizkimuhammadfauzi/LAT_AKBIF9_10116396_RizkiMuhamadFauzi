package pindah.dicoding.a10116396;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhai);

        Intent intent = getIntent();

        String title = intent.getStringExtra(BiodataActivity.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.txt2);
        textView.setText(title);
    }

    public void oke(View view){
        Intent intent = new Intent(SayActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
