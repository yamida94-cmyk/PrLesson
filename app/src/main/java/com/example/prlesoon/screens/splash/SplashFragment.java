package com.example.prlesoon.screens.splash;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.prlesoon.R;
import com.example.prlesoon.core.BaseFragment;

public class SplashFragment extends BaseFragment<SplashViewModel>
{

    public static SplashFragment newInstance() {
     return new SplashFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_spalsh, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view , @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view , savedInstanceState);
        viewModel = getViewModel(SplashViewModel.class);
        // TODO: Use the ViewModel
    }

    @NonNull
    @Override
    protected String getTitle() {
        return "Splash";
    }

    @Override
    protected boolean shouldShowBackButton() {
        return false;
    }
}