package com.example.sharecare.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sharecare.R;
import com.example.sharecare.databinding.FragmentAccountBinding;
import com.example.sharecare.databinding.FragmentCharityBinding;

public class CharityFragment extends Fragment {

    private FragmentCharityBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        binding = FragmentCharityBinding.inflate(inflater, container, false);
        View view = binding.getRoot();



        return view;
    }
}