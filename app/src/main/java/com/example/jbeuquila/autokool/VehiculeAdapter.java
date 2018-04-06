package com.example.jbeuquila.autokool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by jbeuquila on 06/04/2018.
 */

public class VehiculeAdapter extends BaseAdapter {

    private List<Vehicule> listVehicule;
    private LayoutInflater layoutInflater;
    private Context context;


    public VehiculeAdapter(Context aContext, List<Vehicule> listVehicule){
        this.context = aContext;
        this.listVehicule = listVehicule;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listVehicule.size();
    }

    @Override
    public Object getItem(int position) {
        return listVehicule.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder Holder;
        return null;
    }

    static class ViewHolder{

    }
}
