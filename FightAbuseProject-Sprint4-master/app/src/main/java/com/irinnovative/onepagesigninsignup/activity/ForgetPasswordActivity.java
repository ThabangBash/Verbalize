package com.irinnovative.onepagesigninsignup.activity;



import com.irinnovative.onepagesigninsignup.R;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPasswordActivity extends AppCompatActivity {

  private EditText edtEmail;
  private Button btnResetPassword;
  private Button btnBack;
  private FirebaseAuth mAuth;
  ProgressDialog pd;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_forget_password);

    pd = new ProgressDialog(this);
    pd.setMessage("Loading....");

    edtEmail = (EditText) findViewById(R.id.edt_reset_email);
    btnResetPassword = (Button) findViewById(R.id.btn_reset_password);
    btnBack = (Button) findViewById(R.id.btn_back);

    mAuth = FirebaseAuth.getInstance();

    btnResetPassword.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        String email = edtEmail.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
          Toast.makeText(getApplicationContext(), "Please enter your email to reset your password!", Toast.LENGTH_SHORT).show();
          return;
        }

        mAuth.sendPasswordResetEmail(email)
          .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
              if (task.isSuccessful()) {
                Toast.makeText(ForgetPasswordActivity.this, "Email has been sent with a link to reset your password!", Toast.LENGTH_SHORT).show();
              } else {

                Toast.makeText(ForgetPasswordActivity.this, "Fail to send the email link to reset password!", Toast.LENGTH_SHORT).show();
              }
            }
          });
      }
    });

    btnBack.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        finish();
      }
    });
  }

}
