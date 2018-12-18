package in.iandwe.rishabh.handzapassignment;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectCategory extends AppCompatActivity {

    GridView gridView;



        int[] thumbnails = {
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid, R.drawable.rose_grid,
                R.drawable.rose_grid,R.drawable.rose_grid,
                R.drawable.rose_grid

        };
        int count = 0;
        //makinh list static
        String letterlist[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21"};
        //GridView gridView;
        private ArrayList<String> selectedStrings;
        @Override
        protected void onCreate(Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_select_category);


            gridView = (GridView) findViewById(R.id.grid_view);

            ImageAdapter adapter = new ImageAdapter(SelectCategory.this, thumbnails, letterlist);
            gridView.setAdapter(adapter);

            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    //Count is generated for getting the number of grid selected
                    count++;
                    Toast.makeText(SelectCategory.this, "clicked " + letterlist[position] + "& count :" + count, Toast.LENGTH_SHORT).show();
                }
            });

        }

        public void pass(View view) {

            Intent i = new Intent(SelectCategory.this,MainActivity.class);
            i.putExtra("count",String.valueOf(count));
            startActivity(i);
        }
}
