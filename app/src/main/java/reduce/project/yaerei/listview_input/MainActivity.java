package reduce.project.yaerei.listview_input;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListActivity list/* = new ListActivity()*/;
    ListView listview;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1);

        listview = (ListView)findViewById(R.id.listview);

        listview.setAdapter(adapter);



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final ArrayAdapter ad = (ArrayAdapter)listview.getAdapter();

                final String item = (String)ad.getItem(i);


            }
        });

        int count = 0;

        SharedPreferences spr = getSharedPreferences("count", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = spr.edit();
        editor.putInt("count",count);
        editor.commit();

        list.Listinput("高尾",adapter);
        list.Listdisplay(adapter);


    }

    public void input(View v){
        list.Listinput("高幡不動",adapter);

    }
}
