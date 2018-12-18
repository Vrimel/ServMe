package com.project.resto.serveme.view.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.resto.serveme.R;
import com.project.resto.serveme.view.command.Command;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Button btn_Command = findViewById(R.id.btn_Command);

        //Button for command
        btn_Command.setOnClickListener(clickCommand());
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// ACTION BUTTON ///////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////

     private View.OnClickListener clickCommand() {
         View.OnClickListener returnClickCommand = new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //Redirection to the view command
                 Intent activity_Command = new Intent(HomePage.this, Command.class);
                 startActivity(activity_Command);
             }
         };
        return returnClickCommand;
    }
}
