package remen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.putilive.R;

import remen.Adapter.Adapter_Remen_RecyCleView;

/**
 * Created by Administrator on 2017/1/2.
 */

public class Remen_Fragment extends Fragment {

    private FragmentActivity mRootActivity;
    private RecyclerView mRecycle_main;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootActivity = getActivity();
        View view = inflater.inflate(R.layout.fragment_remen, container, false);
        findView(view);
        init();
        return view;

    }

    private void init() {
        String[] names = {"最新功德","法物流通","念经计数","上师著作","超度众生"};
        int[] mImageResource  = {R.drawable.gongde_icon,R.drawable.fawu_icon,R.drawable.jishu_icon,
        R.drawable.zhuzuo_icon,R.drawable.chaodu_icon};
        Adapter_Remen_RecyCleView adapter_remen_recyCleView = new Adapter_Remen_RecyCleView(mRootActivity,mImageResource,names);
        mRecycle_main.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        mRecycle_main.setAdapter(adapter_remen_recyCleView);
    }

    private void findView(View view) {
        mRecycle_main = (RecyclerView) view.findViewById(R.id.Recycle_main);

    }
}
