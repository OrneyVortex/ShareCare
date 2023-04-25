package com.example.sharecare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.sharecare.databinding.ActivityAnalysisBinding;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.HashMap;
import java.util.Map;

public class AnalysisActivity extends AppCompatActivity {

    private ActivityAnalysisBinding binding;

    String cityName;
    String stateName;
    String countryName;
    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnalysisBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        cityName = getIntent().getStringExtra("cityName");
        stateName = getIntent().getStringExtra("stateName");
        countryName = getIntent().getStringExtra("countryName");

        binding.btnCity.setText(cityName);
        binding.btnState.setText(stateName);
        binding.btnCountry.setText(countryName);


//        FirebaseFirestore db = FirebaseFirestore.getInstance();
//        Map<String, Map<String, Integer>> cityDonations = new HashMap<>();
//
//        db.collection("DonationAds").get().addOnCompleteListener(task -> {
//            if (task.isSuccessful()) {
//                for (QueryDocumentSnapshot document : task.getResult()) {
//                    String city = document.getString("city");
//
//                    String category = document.getString("category").toString();
//                    switch (Integer.valueOf(category)){
//                        case 0: category= "Clothes";
//                            break;
//
//                        case 1: category= "Food";
//                            break;
//
//                        case 2: category= "Books";
//                            break;
//
//                        case 3: category= "Toys";
//                            break;
//
//                        case 4: category= "Stationary";
//                            break;
//
//                        case 5: category= "Electronics";
//                            break;
//
//                        case 6: category= "Medicine";
//                            break;
//
//                        case 7: category= "Others";
//                            break;
//
//                        default: break;
//                    }
//                    if (cityDonations.containsKey(city)) {
//                        Map<String, Integer> categoryDonations = cityDonations.get(city);
//                        categoryDonations.put(category, categoryDonations.getOrDefault(category, 0) + 1);
//                    } else {
//                        Map<String, Integer> categoryDonations = new HashMap<>();
//                        categoryDonations.put(category, 1);
//                        cityDonations.put(city, categoryDonations);
//                    }
//                }
//                // format the result
//                StringBuilder result = new StringBuilder();
//                for (Map.Entry<String, Map<String, Integer>> entry : cityDonations.entrySet()) {
//                    String city = entry.getKey();
//                    Map<String, Integer> categoryDonations = entry.getValue();
//                    StringBuilder donations = new StringBuilder();
//                    for (Map.Entry<String, Integer> categoryEntry : categoryDonations.entrySet()) {
//                        String category = categoryEntry.getKey();
//                        Integer count = categoryEntry.getValue();
//                        donations.append(category).append(" (").append(count).append("),");
//                    }
//                    donations.deleteCharAt(donations.length() - 1); // remove the last comma
//                    result.append(city).append(",").append(donations).append("\n");
//                }
//                // print the result
//                binding.chatgptOutput.setText(result.toString());
//            } else {
//                Log.d("Analysis", "Error getting documents: ", task.getException());
//            }
        };



    }
