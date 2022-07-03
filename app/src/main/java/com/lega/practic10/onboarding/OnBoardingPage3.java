package com.lega.practic10.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.lega.practic10.R;
import com.lega.practic10.databinding.FragmentOnBoardingPage3Binding;


public class OnBoardingPage3 extends Fragment {

    private FragmentOnBoardingPage3Binding binding;

    public OnBoardingPage3() {
        // Required empty public constructor
    }

    public static OnBoardingPage3 newInstance() {
        return new OnBoardingPage3();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentOnBoardingPage3Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listener();

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void listener(){
        binding.FOP3Login.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.to_loginFragment);
        });

    }


}