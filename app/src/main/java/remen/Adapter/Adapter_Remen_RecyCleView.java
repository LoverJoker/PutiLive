package remen.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.putilive.R;

/**
 * Created by Administrator on 2017/1/2.
 */

public class Adapter_Remen_RecyCleView extends RecyclerView.Adapter {
    private Context mContext ;
    private int[] mImageResource ;
    private String[] mNames;
    public Adapter_Remen_RecyCleView(Context mContext,int[] mImageResource,String[] mNames){
        this.mContext  = mContext ;
        this.mImageResource = mImageResource;
        this.mNames = mNames ;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.remen_item, parent, false);
        Normal_holder normal_holder = new Normal_holder(view);
        return normal_holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Normal_holder normal_holder = (Normal_holder) holder;
        normal_holder.textView_remen_item.setText(mNames[position]);
        normal_holder.img_remen_item.setImageResource(mImageResource[position]);
    }

    @Override
    public int getItemCount() {
        return mImageResource.length;
    }
    class Normal_holder extends RecyclerView.ViewHolder{
        TextView textView_remen_item ;
        ImageView img_remen_item ;
        public Normal_holder(View itemView) {
            super(itemView);
            textView_remen_item = (TextView) itemView.findViewById(R.id.textView_remen_item);
            img_remen_item = (ImageView) itemView.findViewById(R.id.img_remen_item);
        }
    }
}
