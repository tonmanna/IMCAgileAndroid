package com.thaieasyelec.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Woraset KiNG on 27/11/2558.
 */
public class Dummy extends AppCompatActivity {

    Button btn_id1,btn_id2;
    JSONParser jParser = new JSONParser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummy);

        bindWidget();
        initEvents();


    }

    private void bindWidget() {
        btn_id1 = (Button)findViewById(R.id.btn_id1);
        btn_id2 = (Button)findViewById(R.id.btn_id2);

    }


    private void initEvents() {
        btn_id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findMyCar("ฌข 1597");
            }
        });

        btn_id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findMyCar("สฬ 5420");
            }
        });
    }

    public void findMyCar(String id){
        Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
        if (id.equalsIgnoreCase("ฌข 1597")) {
            myIntent.putExtra("id", "ฌข 1597");
            myIntent.putExtra("province", "ลำพูน");
            myIntent.putExtra("position_car", "ชั้น 3 ช่อง 312");
            myIntent.putExtra("position_user", "ชั้น 6");
            myIntent.putExtra("status", false);
        }else if (id.equalsIgnoreCase("สฬ 5420")) {
            myIntent.putExtra("id", "สฬ 5420");
            myIntent.putExtra("province", "กรุงเทพมหานคร");
            myIntent.putExtra("position_car", "ชั้น 6 ช่อง 619");
            myIntent.putExtra("position_user", "ชั้น 2");
            myIntent.putExtra("status", true);
        }
        startActivity(myIntent);
    }

    /**
     * Background Async Task to Load all product by making HTTP Request
     * */
    class LoadNewsContent extends AsyncTask<String, String, String> {

        /**
         * Before starting background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        /**
         * getting All report from url
         * */
        protected String doInBackground(String... args) {

            List<NameValuePair> params = new ArrayList<NameValuePair>();

			params.add(new BasicNameValuePair("id",getIntent().getExtras().getString("news_id")));

            JSONObject json = jParser.makeHttpRequest("url", "GET", params);

//            Log.e("GET YOUTUBE","JSON "+json.toString());
            try {



            }catch (Exception e) {
                Log.e("ERROR", "Error parsing data " + e.toString());
            }

            //ถ้าเชื่อมต่อกับ server ไม่ได้จะทำงานต่อไปนี้


            return null;
        }

        /**
         * After completing background task Dismiss the progress dialog
         * **/
        protected void onPostExecute(String file_url) {

        }
    }

}
