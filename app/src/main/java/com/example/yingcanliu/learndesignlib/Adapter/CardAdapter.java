package com.example.yingcanliu.learndesignlib.Adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.yingcanliu.learndesignlib.Model.CardVM;
import com.example.yingcanliu.learndesignlib.R;
import com.example.yingcanliu.learndesignlib.ViewModel.CardViewModel;
import com.example.yingcanliu.learndesignlib.databinding.ItemCardviewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yingcan.liu on 2016/3/16.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private List<CardVM> mList;

    public CardAdapter(List<CardVM> list){
        mList = list;
        if(mList == null){
            mList = new ArrayList<CardVM>();
        }
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemCardviewBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_cardview, parent, false);
        return new CardViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        ItemCardviewBinding binding = holder.itemCardviewBinding;
        binding.setCard(new CardViewModel(mList.get(position)));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void addItemCard(CardVM cardVM){
        mList.add(cardVM);
        notifyDataSetChanged();
    }

    public void changeText(String str, int position){
        CardVM cardVM = mList.get(position);
        if(cardVM == null){
            throw new NullPointerException("null");
        }
        cardVM.setDescription(str);
    }

    class CardViewHolder extends RecyclerView.ViewHolder{

        private ItemCardviewBinding itemCardviewBinding;

        public CardViewHolder(ItemCardviewBinding binding) {
            super(binding.cardview);
            itemCardviewBinding = binding;
        }
    }
}
