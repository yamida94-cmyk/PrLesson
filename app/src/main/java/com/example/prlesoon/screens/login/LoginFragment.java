package com.example.prlesoon.screens.login;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prlesoon.R;
import com.example.prlesoon.core.BaseFragment;
import com.example.prlesoon.screens.splash.SplashViewModel;

public class LoginFragment extends BaseFragment<LoginViewModel> {



    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view , savedInstanceState);
        viewModel = getViewModel(LoginViewModel.class);
        // TODO: Use the ViewModel
    }

    @NonNull
    @Override
    protected String getTitle() {
        return "Login";
    }


}
