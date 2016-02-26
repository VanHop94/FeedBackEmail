package com.example.vanhop.sendmail_feedbackproject;

/**
 * Created by vanhop on 2/26/16.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class AttachmentFile extends LinearLayout {

    TextView label = null;
    Button button;

    public AttachmentFile(Context context,String content) {
        super(context);
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(inflater != null){
            inflater.inflate(R.layout.custom_listview, this);
            this.button = (Button) findViewById(R.id.btnCancel);
            this.label = (TextView) findViewById(R.id.tvFileName);
            this.label.setText(content);

        }
    }
}
