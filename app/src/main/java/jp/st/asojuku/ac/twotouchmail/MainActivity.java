package jp.st.asojuku.ac.twotouchmail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPickUp = (Button) this.findViewById(R.id.button);
        btnPickUp.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PickUpActivity.class);
                startActivity(intent);
            }
        });
        Button btnNodinner = (Button) this.findViewById(R.id.button2);
        btnNodinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoDinnerActivity.class);
                startActivity(intent);
            }
        });
    }
}
