package toncheng;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.putilive.R;

/**
 * Created by Administrator on 2017/1/2.
 */

public class toncheng_Fragment extends Fragment {

    private FragmentActivity mRootActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootActivity = getActivity();
        View view = inflater.inflate(R.layout.fragment_tongcheng, container, false);
        return view;

    }
}
