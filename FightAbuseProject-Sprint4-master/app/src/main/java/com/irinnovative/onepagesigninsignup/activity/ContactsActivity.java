package com.irinnovative.onepagesigninsignup.activity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.irinnovative.onepagesigninsignup.R;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void powa(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note that call rates may be applied!!!!!!");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0115916803"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alert.show();

    }

    public void cellphone(View view)
    {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note this call is a toll-free number no charges will be applied");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:112"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish();
            }
        });
        alert.show();

    }

    public void drReddy(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note that call rates may be applied!!!!!!");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0800205026"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               // finish();
            }
        });
        alert.show();

    }

    public void destiny(View view)
    {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note that call rates may be applied!!!!!!");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0800414243"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               // finish();
            }
        });
        alert.show();
    }

    public void social(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note that call rates may be applied!!!!!!");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0800121314"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               // finish();
            }
        });
        alert.show();
    }

    public void sucide(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note that call rates may be applied!!!!!!");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0800567567"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               // finish();
            }
        });
        alert.show();
    }

    public void sadag(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note that call rates may be applied!!!!!!");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0112344837"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              //  finish();
            }
        });
        alert.show();
    }

    public void akeso(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note that call rates may be applied!!!!!!");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0861435787"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             //   finish();
            }
        });
        alert.show();

    }

    public void saps(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note this call is a toll-free number no charges will be applied");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10111"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             //   finish();
            }
        });
        alert.show();
    }

    public void ambulance(View view)
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Call");
        alert.setIcon(R.drawable.ic_call_black_24dp);
        alert.setMessage("Note this call is a toll-free number no charges will be applied");
        alert.setPositiveButton(R.string.dialog_ok,new Dialog.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int whichButton){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10177"));
                startActivity(intent);
            }
        });


        alert.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             //   finish();
            }
        });
        alert.show();
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id == android.R.id.home)
        {
            onBackPressed();
        }


        return super.onOptionsItemSelected(item);
    }

}
