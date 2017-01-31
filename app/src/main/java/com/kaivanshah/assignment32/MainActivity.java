package com.kaivanshah.assignment32;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_Contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Contact =(Button) (this.findViewById(R.id.btn_Contact));
        btn_Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oIntent =new Intent(Intent.ACTION_PICK,ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivity(oIntent);
            }
        });
    }
}
