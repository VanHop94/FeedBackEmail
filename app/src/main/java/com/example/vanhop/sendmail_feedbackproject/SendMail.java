package com.example.vanhop.sendmail_feedbackproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vanhop on 2/26/16.
 */
public class SendMail extends ActionBarActivity {

    ArrayList<String> listFiles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_mail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Feedback");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_attach) {

            //listFiles.add("ngay mai nghi viec.jpg");
            //customAdapter.notifyDataSetChanged();
           /* if(listFiles.size() > 0){
                if(!listView.isShown())
                    listView.setVisibility(View.VISIBLE);
            }*/
            LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
            layout.addView(new AttachmentFile(getBaseContext(),"ngay mai nghi hoc.jpg"));
        }
        if(id == R.id.action_send){
        }
        return super.onOptionsItemSelected(item);
    }

}
