package project10_1.cookandroid.com.projectzzz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class listadapter extends BaseAdapter {

    private Context context;
    private ArrayList<Item> postslist;

    public listadapter (ArrayList<Item> postslist, Context context){
        this.postslist = postslist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return postslist.size();
    }

    @Override
    public Object getItem(int position) {
        return postslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return postslist.get(position).hashCode();  //?
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_lay, parent, false);
        }
        TextView titleview = view.findViewById(R.id.titleid);
        titleview.setText(postslist.get(position).getTitle());
        TextView contextview = view.findViewById(R.id.contextid);
        contextview.setText(postslist.get(position).getContext());
        return view;
    }
}
