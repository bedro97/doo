package com.example.e_finance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

public class SignUp extends AppCompatActivity implements View.OnClickListener {


    private Button btnsave;
    private EditText edtName, edtPp, edtPs, edtKp, edtKs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnsave = findViewById(R.id.btnsave);
        btnsave.setOnClickListener(SignUp.this);

        edtName = findViewById(R.id.edtName);
        edtPp = findViewById(R.id.edtPp);
        edtPs = findViewById(R.id.edtPs);
        edtKp = findViewById(R.id.edtKp);
        edtKs = findViewById(R.id.edtKs);

    }

    @Override
    public void onClick(View v) {

        try {

            final ParseObject Kickboxer = new ParseObject("Kickboxer");
            Kickboxer.put("name", edtName.getText().toString());
            Kickboxer.put("PunchPower", Integer.parseInt(edtPp.getText().toString()));
            Kickboxer.put("PunchSpeed", Integer.parseInt(edtPs.getText().toString()));
            Kickboxer.put("Kickpower", Integer.parseInt(edtKp.getText().toString()));
            Kickboxer.put("KickSpeed", Integer.parseInt(edtKs.getText().toString()));
            Kickboxer.saveInBackground(new SaveCallback() {
                @Override
                public void done(ParseException e) {
                    if (e == null) {
                        FancyToast.makeText(SignUp.this, Kickboxer.get("name") + "is saved to the Database", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, true).show();


                    }
                }

            });
        } catch (Exception e) {

            FancyToast.makeText(SignUp.this, e.getMessage(), FancyToast.LENGTH_LONG, FancyToast.ERROR, true).show();




        }
    }
}
