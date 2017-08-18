package Fragment;

/**
 * Created by DongHyen on 2017-08-18.
 */

/**
 * Created by DongHyen on 2017-07-25.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Routine extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_routine, container, false);
        return rootView;
    }
}
