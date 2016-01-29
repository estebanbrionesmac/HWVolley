package ejbm.mac.com.volley;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    TextView tv ;

    TextView tv3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById( R.id.tv1) ;
        tv3 = (TextView) findViewById( R.id.tv1) ;


    }

    public void getCall(View view) {



        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);

        String url =  "http://www.flickr.com/services/feeds/photos_public.gne?tags=soccer&format=json&jsoncallback=?" ;

        url = "http://www.w3schools.com/json/myTutorials.txt" ;

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        tv.setText("Response is: \n"+ ( response.length() > 300 ? response.substring(0,  300 ) + "\n..." : response ) );

                        Log.d( "TAG", ( response.length() > 50 ? response.substring(0,  50 ) :response )  ) ;

                        Deserialization s = new Deserialization ( new Example2 ( ) ) ;
                        s.execute( response.substring( response.indexOf('[')+1, response.length() - 1 ) /* tv3.getText() + ""*/, null, null) ;

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                tv.setText("That didn't work! : " + error.getMessage() );
            }
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);


    }



    private class Deserialization  extends AsyncTask<String, Void, String> {
        Example2 tp = null ;

        public Deserialization( Example2 t ) {
            this.tp = t ;
        }

        @Override
        protected String doInBackground(String... notUsed) {

            Gson gson = new Gson();

            Example2 exa = null ;
            String result = "" ;

            try {
                exa = gson.fromJson( notUsed [0], Example2.class ) ;
                result = exa.toString() ;
                //String url = String.format("%s%s", u , json);
                //result += getStream(url);
            } catch (Exception ex) {
                Log.v("TAG", "Error: " + ex.getMessage());
                result = "Error: " + ex.getMessage() ;
            }

            return result;
        }

        @Override
        protected void onPostExecute(String result) {
            tv3.setText(result);
        }

    }
}
