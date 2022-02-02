package Aplimovil.womancare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link quienesSomosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class quienesSomosFragment extends Fragment {

    public quienesSomosFragment() {
        // Required empty public constructor
    }

    public static quienesSomosFragment newInstance(String param1, String param2) {
        quienesSomosFragment fragment = new quienesSomosFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quienes_somos, container, false);
    }
}