package co.uk.gopcpitstop.agoto;

import androidx.appcompat.app.AppCompatActivity;
import co.uk.gopcpitstop.agoto.ui.login.EmailPasswordActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button SighnupPasswordButton;

    public void SighnupWithPassword(View SighnupWithPassword) {
        Log.i("Button","Pressed");
        Intent intent=new Intent(this, EmailPasswordActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SighnupPasswordButton=findViewById(R.id.passwordSighnupButton);
    }
}