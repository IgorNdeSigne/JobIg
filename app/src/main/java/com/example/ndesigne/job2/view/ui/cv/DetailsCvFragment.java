package com.example.ndesigne.job2.view.ui.cv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.ndesigne.job2.R;

import java.util.ArrayList;

public class DetailsCvFragment extends Fragment {

    EditText nom;
    EditText prenom;
    EditText adresse;
    EditText tel;
    EditText email;
    EditText birthday;
    EditText nationalite;

    public DetailsCvFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details_cv, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nom = view.findViewById(R.id.et_nom_detail_frag);
        prenom = view.findViewById(R.id.et_prenom_detail_frag);
        adresse = view.findViewById(R.id.et_adresse_detail_frag);
        tel = view.findViewById(R.id.et_tel_detail_frag);
        email = view.findViewById(R.id.et_email_detail_frag);
        birthday = view.findViewById(R.id.et_birthday_detail_frag);
        nationalite = view.findViewById(R.id.et_nationalite_detail_frag);

    }

    public ArrayList<String> retriveData(){

        ArrayList<String> data = new ArrayList<String>();
        data.add(nom.getText().toString()+" "+prenom.getText().toString() );
        data.add(adresse.getText().toString() );
        data.add(tel.getText().toString() );
        data.add(email.getText().toString() );
        data.add(birthday.getText().toString() );
        data.add(nationalite.getText().toString() );
        return data;
    }
}
