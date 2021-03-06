package com.jkkg.hhtx.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jkkg.hhtx.R;
import com.jkkg.hhtx.net.bean.LockCoinToEarnInterestBean;

import java.util.List;

public class LockListAdapter extends RecyclerView.Adapter {
     JSONObject jsonObject;
    List<String> strings;
    private Context context;
    private OnClick mOnClick;

    public LockListAdapter(JSONObject jsonObject, List<String> strings, Context context) {
        this.jsonObject=jsonObject;
        this.strings=strings;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FinancesListHolder(LayoutInflater.from(context).inflate(R.layout.item_manage_finances,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder1, int position) {
        FinancesListHolder holder= (FinancesListHolder) holder1;
        holder.name.setText(strings.get(position));

        JSONArray jsonArray = jsonObject.getJSONArray(strings.get(position));
        List<LockCoinToEarnInterestBean> lockCoinToEarnInterestBeans = jsonArray.toJavaList(LockCoinToEarnInterestBean.class);

        Integer heaven = lockCoinToEarnInterestBeans.get(0).getHeaven();
        holder.number.setText(heaven+"天起投  收益稳");

        /*holder.name.setText(o.get(position).getName());
        String s = new BigDecimal(o.get(position).getAnnualized_rate()).multiply(new BigDecimal("100")).stripTrailingZeros().toPlainString();
        holder.yeild_num.setText(s+"%");
        holder.number.setText(o.get(position).getMin()+o.get(position).getPayment_currency_name()+"起投  收益稳");*/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnClick!=null) {
                    mOnClick.setOnClick(view,position);
                }
            }
        });
    }

    public void setData(JSONObject jsonObject, List<String> strings){
        if (jsonObject!=null&&strings!=null) {
            this.jsonObject=jsonObject;
            this.strings=strings;
            this.notifyDataSetChanged();
        }
    }
    @Override
    public int getItemCount() {
        return strings.size();
    }

    class FinancesListHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView yeild_num;
        private final TextView number;

        public FinancesListHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            yeild_num = itemView.findViewById(R.id.yeild_num);
            number = itemView.findViewById(R.id.number);

        }
    }

    public interface OnClick{
        void setOnClick(View view, int position);
    }

    public void setOnClickListener (OnClick clickListener){
        this.mOnClick=clickListener;
    }
}
