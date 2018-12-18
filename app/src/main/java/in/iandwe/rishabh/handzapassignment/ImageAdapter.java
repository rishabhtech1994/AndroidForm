package in.iandwe.rishabh.handzapassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    LayoutInflater layoutinflater;
    private String[] letterlist ;
    private int[] mThumbNail ;

    List<Integer> selectedPositions = new ArrayList<>();
    public ImageAdapter(Context mContext, int[] thumbnails, String[] letterlist) {
        this.mContext = mContext;
        this.mThumbNail = thumbnails;
        this.letterlist = letterlist;

    }

    @Override
    public int getCount() {
        return mThumbNail.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbNail[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbNail[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    }
}
