package ch.samt.bosco.modulo335j.ui.baseviewselements;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ch.samt.bosco.modulo335j.AppSettings;
import ch.samt.bosco.modulo335j.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseViewsElementsFragment extends Fragment {


    public BaseViewsElementsFragment(AppSettings settings) {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base_views_elements, container, false);
    }

}
