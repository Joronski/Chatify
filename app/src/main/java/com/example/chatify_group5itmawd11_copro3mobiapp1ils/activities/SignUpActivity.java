package com.example.chatify_group5itmawd11_copro3mobiapp1ils.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatify_group5itmawd11_copro3mobiapp1ils.R;
import com.example.chatify_group5itmawd11_copro3mobiapp1ils.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    /* Similarly, 'ActivitySignUpBinding' class is automatically generated from our layout file:
    * 'activity_sign_up' */
    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}