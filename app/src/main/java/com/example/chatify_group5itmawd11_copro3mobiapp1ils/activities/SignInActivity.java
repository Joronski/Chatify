package com.example.chatify_group5itmawd11_copro3mobiapp1ils.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.chatify_group5itmawd11_copro3mobiapp1ils.R;
import com.example.chatify_group5itmawd11_copro3mobiapp1ils.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    /* As we've enabled viewBinding for this project, the binding class for each XML layout will be
     generated automatically

    This class is automatically generated from our layout file: 'activity_sign_in' */
    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    /* As you can see, an instance of a binding class contains direct references to all views that
    * have an ID in the corresponding layout */
    private void setListeners() {
        binding.textCreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));
    }
}