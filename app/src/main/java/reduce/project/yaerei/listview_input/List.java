package reduce.project.yaerei.listview_input;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.widget.ArrayAdapter;

/**
 * Created by yaerei on 2018/07/21.
 */

public class List { /*

    private SharedPreferences spr;

    SharedPreferences.Editor editor;

//    int zero = 0;

    public List(){

    }

    public void Listinput(String word,ArrayAdapter<String> adapter){
        int count = 0;

        try {
            SharedPreferences spr = getSharedPreferences("count",Context. MODE_PRIVATE);
            count = spr.getInt("count", 0);
        }catch (RuntimeException e){
            count = 0;
        }
        count++;

        spr = getSharedPreferences("count", Context.MODE_PRIVATE);
        editor = spr.edit();
        editor.putInt("count",count);
        editor.commit();

        spr = getSharedPreferences(cou^nt + "",Context.MODE_PRIVATE);
        editor = spr.edit();
        editor.putString(count + "",word);
        editor.commit();

        listhyoji(word,adapter);
    }

    public void Listdisplay(ArrayAdapter<String> adapter){
        int num = 0;

        spr = getSharedPreferences("count",Context.MODE_PRIVATE);
        num = spr.getInt("count",0);

        spr = getSharedPreferences(num + "",Context.MODE_PRIVATE);
        String liststr = spr.getString(num + "","");

        if(liststr == null || liststr == ""){
            new AlertDialog.Builder(ListActivity.this)
                    .setTitle("エラー")
                    .setMessage("データが読み込めませんでした。")
                    .setPositiveButton(
                            "了解",

                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    int t = 0;
                                    t++;
                                }
                            }
                    ).show();
        }else{
            for(int count = 0;count < num;count++){
                listhyoji(liststr,adapter);
            }
        }
    }

    public void listhyoji(String str,ArrayAdapter<String> adapter){
        adapter.add(str);
    }


*/
}
