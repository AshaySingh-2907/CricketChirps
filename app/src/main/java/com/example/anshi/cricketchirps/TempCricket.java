package com.example.anshi.cricketchirps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TempCricket extends AppCompatActivity {


    EditText etChirps;
    Button btnCalculate;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_cricket);

      etChirps=findViewById(R.id.etChirps);
      btnCalculate=findViewById(R.id.btnCalculate);
      tvResults=findViewById(R.id.tvResults);

      tvResults.setVisibility(View.GONE);

      btnCalculate.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if(etChirps.getText().toString().isEmpty())
              {
                  Toast.makeText(TempCricket.this, "Fields are Empty", Toast.LENGTH_SHORT).show();
              }
             else
              {

                  int chirps=Integer.parseInt(etChirps.getText().toString().trim());


                  double temp=(chirps/3.0) +4;


                  String results="the approx temperature outside is"+temp+"degree celsius";

                  tvResults.setText(results);

                  tvResults.setVisibility(View.VISIBLE);

              }
          }
      });

    }
}
