package ch.samt.bosco.modulo335j;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import ch.samt.bosco.modulo335j.ui.basetools.BaseToolsFragment;
import ch.samt.bosco.modulo335j.ui.baseviewselements.BaseViewsElementsFragment;
import ch.samt.bosco.modulo335j.ui.data.DataFragment;
import ch.samt.bosco.modulo335j.ui.layouts.LayoutFragment;
import ch.samt.bosco.modulo335j.ui.userinterfaces.UserInterfacesFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;


/**
 * A simple {@link Fragment} subclass.
 *
 * @author giuliobosco
 * @author bryanbeffa
 * @version 1.0.1 (2019-11-11 - 2019-11-11)
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    /**
     * App Settings.
     */
    private AppSettings settings;

    /**
     * Create home fragment with app settings.
     * @param settings App settings.
     */
    public HomeFragment(AppSettings settings) {
        this.settings = settings;
    }

    /**
     * On create view.
     *
     * @param inflater           Inflater.
     * @param container          Container.
     * @param savedInstanceState Saved Instance State.
     * @return View.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        setOnClickListeners(view);

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    /**
     * Replace fragment.
     *
     * @param f Fragment.
     */
    private void replace(Fragment f) {
        if (getActivity() != null) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.nav_host_fragment, f).addToBackStack(null);
            ft.commit();
        }
    }

    /**
     * On click in dash icons replace fragment.
     *
     * @param view View.
     */
    @Override
    public void onClick(View view) {
        if (getActivity() != null) {
            int id = view.getId();
            NavigationView navigationView = getActivity().findViewById(R.id.nav_view);


            switch (id) {
                case R.id.homeDashIcon:
                    replace(new HomeFragment(settings));
                    navigationView.setCheckedItem(R.id.nav_home);
                    break;
                case R.id.baseToolsDashIcon:
                    replace(new BaseToolsFragment(settings));
                    navigationView.setCheckedItem(R.id.nav_base_tools);
                    break;
                case R.id.baseViewsElementsDashIcon:
                    replace(new BaseViewsElementsFragment(settings));
                    navigationView.setCheckedItem(R.id.nav_base_views_elements);
                    break;
                case R.id.layoutsDashIcon:
                    replace(new LayoutFragment(settings));
                    navigationView.setCheckedItem(R.id.nav_layouts);
                    break;
                case R.id.userInterfacesDashIcon:
                    replace(new UserInterfacesFragment(settings));
                    navigationView.setCheckedItem(R.id.nav_user_interfaces);
                    break;
                case R.id.dataDashIcon:
                    replace(new DataFragment(settings));
                    navigationView.setCheckedItem(R.id.nav_data);
                    break;
            }
        }
    }

    /**
     * Set on click listeners for the view.
     *
     * @param view View.
     */
    private void setOnClickListeners(View view) {
        LinearLayout home = view.findViewById(R.id.homeDashIcon);
        home.setOnClickListener(this);

        LinearLayout baseTools = view.findViewById(R.id.baseToolsDashIcon);
        baseTools.setOnClickListener(this);

        LinearLayout baseViewsElements = view.findViewById(R.id.baseViewsElementsDashIcon);
        baseViewsElements.setOnClickListener(this);

        LinearLayout layouts = view.findViewById(R.id.layoutsDashIcon);
        layouts.setOnClickListener(this);

        LinearLayout userInterfaces = view.findViewById(R.id.userInterfacesDashIcon);
        layouts.setOnClickListener(this);

        LinearLayout data = view.findViewById(R.id.dataDashIcon);
        data.setOnClickListener(this);
    }
}
