package pindah.dicoding.a10116396;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void masuknya (View view){
        Intent intent = new Intent(LoginActivity.this , BiodataActivity.class);
        startActivity(intent);
    }
}
