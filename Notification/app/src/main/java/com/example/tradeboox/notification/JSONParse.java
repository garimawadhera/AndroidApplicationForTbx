package com.example.tradeboox.notification;

/**
 * Created by tradeboox on 6/4/16.
 */
public class JSONParse {
    DefaultHttpClient   httpclient = new DefaultHttpClient(new BasicHttpParams());
    HttpPost httppost = new HttpPost(http://someJSONUrl/jsonWebService);
// Depends on your web service
            httppost.setHeader("Content-type", "application/json");

    InputStream inputStream = null;
    String result = null;
    try {
        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();

        inputStream = entity.getContent();
        // json is UTF-8 by default
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
        StringBuilder sb = new StringBuilder();

        String line = null;
        while ((line = reader.readLine()) != null)
        {
            sb.append(line + "\n");
        }
        result = sb.toString();
    } catch (Exception e) {
        // Oops
    }
    finally {
        try{if(inputStream != null)inputStream.close();}catch(Exception squish){}
    }

    JSONObject jObject = new JSONObject(result);
    String aJsonString = jObject.getString("STRINGNAME");
    boolean aJsonBoolean = jObject.getBoolean("BOOLEANNAME");
    int aJsonInteger = jObject.getInt("INTEGERNAME");
    long aJsonLong = jObject.getBoolean("LONGNAME");
    double aJsonDouble = jObject.getDouble("DOUBLENAME");
    JSONArray jArray = jObject.getJSONArray("ARRAYNAME");

    JSONObject jsonResponse;

    try {

        /****** Creates a new JSONObject with name/value mappings from the JSON string. ********/
        jsonResponse = new JSONObject(strJson);

        /***** Returns the value mapped by name if it exists and is a JSONArray. ***/
        /*******  Returns null otherwise.  *******/
        JSONArray jsonMainNode = jsonResponse.optJSONArray("Android");

        /*********** Process each JSON Node ************/

        int lengthJsonArr = jsonMainNode.length();

        for(int i=0; i < lengthJsonArr; i++)
        {
            /****** Get Object for each JSON node.***********/
            JSONObject jsonChildNode = jsonMainNode.getJSONObject(i);




            OutputData += "Node : \n\n     "+ song_id +" | "
                    + song_name +" | "
                    + artist_name +" \n\n ";
            //Log.i("JSON parse", song_name);
        }

        /************ Show Output on screen/activity **********/

        output.setText( OutputData );

    } catch (JSONException e) {

        e.printStackTrace();
    }
}
