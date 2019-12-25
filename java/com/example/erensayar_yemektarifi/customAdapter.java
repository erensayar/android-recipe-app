package com.example.erensayar_yemektarifi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erensayar_yemektarifi.model.yemekTarifi;

import java.util.List;

public class customAdapter extends BaseAdapter {

    private LayoutInflater yemekInflater;
    private List<yemekTarifi> yemekList;

    public customAdapter(Activity activity, List<yemekTarifi> yemekList) {
        yemekInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.yemekList = yemekList;
    }

    @Override
    public int getCount() {
        return yemekList.size();
    }

    @Override
    public Object getItem(int i) {
        return yemekList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View lineView;
        lineView = yemekInflater.inflate(R.layout.custom_row, null);

        TextView twName = (TextView) lineView.findViewById(R.id.row_tw_isim);
        TextView twSure = (TextView) lineView.findViewById(R.id.row_tw_sure);
        ImageView iwPicture = (ImageView) lineView.findViewById(R.id.row_iw_resim);

        yemekTarifi yemekTarifi = yemekList.get(i);

        twName.setText(yemekTarifi.getIsim());
        String yemekSure = String.valueOf(yemekTarifi.getHazirlanisSuresi());
        twSure.setText(yemekSure + " dk");
        //iwPicture.setImageResource(yemekTarifi.getResim());


        return lineView;
    }
}

