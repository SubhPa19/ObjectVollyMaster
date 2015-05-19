package com.example.subhashpandey.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private String URL = "https://purinayaapp.landolakes.com/api/Products/GetProductDetailById?ProductId=2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Type listType = new TypeToken<ArrayList<Product>>() {
        }.getType();

        HttpsTrustManager.allowAllSSL();
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(URL,null, new Response.Listener<Object>() {
            @Override
            public void onResponse(Object response) {
                Example example = (Example) response;
                Log.v(example.getName(),example.getName());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        },Example.class);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<List<Object>>() {
            @Override
            public void onResponse(List<Object> response) {
                //cast back to product list
                List<Product> products = (List<Product>) (List<?>) response;
                for (Product product : products) {
                    Log.v(product.getProductTitle().toUpperCase().toString(), product.getProductDetailDescription().toString());
                }

                Toast.makeText(getApplicationContext(), response.size() + "is size", Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        }, listType);

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
        requestQueue.add(jsonArrayRequest);

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
