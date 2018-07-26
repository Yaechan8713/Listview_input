package reduce.project.yaerei.listview_input;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by yaerei on 2018/07/21.
 */

public class ListActivity extends AppCompatActivity {

    private SharedPreferences spr;

    private Class<?> ac;
//    private MainActivity ac;

    String error = "エラー";

    SharedPreferences.Editor editor;

//    int zero = 0;

    public ListActivity(Context context,Class<?> cls){
        this.ac = cls;
        throw new RuntimeException("Stub!");
    }

    public void Listinput(String word,ArrayAdapter<String> adapter){
        int count = 0;

        SharedPreferences spr = getSharedPreferences("count",Context. MODE_PRIVATE);
        count = spr.getInt("count", 0);
//        count = 0;

        count++;

        spr = getSharedPreferences("count", Context.MODE_PRIVATE);
        editor = spr.edit();
        editor.putInt("count",count);
        editor.commit();

        spr = getSharedPreferences(count + "",Context.MODE_PRIVATE);
        editor = spr.edit();
        editor.putString(count + "",word);
        editor.commit();

        listhyoji(word,adapter);

    }

    public void Listdisplay(ArrayAdapter<String> adapter){
        int num = 0;

        spr = getSharedPreferences("count",Context.MODE_PRIVATE);
        num = spr.getInt("count",0);

        String liststr = "";


        if((liststr == null || liststr == "") && num <= 0){
            new AlertDialog.Builder(ListActivity.this)
                    .setTitle(error)
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
            for(int count = 1;count <= num;count++){

                spr = getSharedPreferences(count + "",Context.MODE_PRIVATE);
                liststr = spr.getString(count + "","");

                if(liststr != null&& liststr != "") {
                    listhyoji(liststr, adapter);
                }
            }
        }
    }

    public void listhyoji(String str,ArrayAdapter<String> adapter){
        adapter.add(str);
    }

    public void Listdelete(String touchstring, ArrayAdapter<String> adapter){

        int num = 0;

        spr = getSharedPreferences("count",Context.MODE_PRIVATE);
        num = spr.getInt("count",0);

        if(num <= 0){
            new AlertDialog.Builder(ListActivity.this)
                    .setTitle(error)
                    .setMessage("削除できません。")
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
            for(int count = 1;count <= num;count++){

                spr = getSharedPreferences(count + "",Context.MODE_PRIVATE);
                String str = spr.getString(count + "","");

                if(str == touchstring){
                    adapter.remove(touchstring);

                    editor = spr.edit();
                    editor.clear().commit();

                    break;
                }
            }
        }

    }

}
