package ch.samt.bosco.modulo335j.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ch.samt.bosco.modulo335j.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToastFragment extends Fragment {


    public ToastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_toast, container, false);
    }

}
