package simile2;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import json.JSONArray;
import json.JSONException;
import json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class FileJson {
    private JSONObject jsonObject;
    public FileJson(String url) {
        try {
            jsonObject = readJsonFromUrl(url);
        } catch (IOException e) {
            System.out.println("IOException");
        }
        prova();
    }
    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
    private JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream input = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            input.close();
        }
    }
    private void prova() {
        //System.out.println(jsonObject.toString());
        JSONArray array = jsonObject.getJSONArray("data");
        for ( Object object : array) {
            JSONObject tmp = (JSONObject) object;
            
        }
    }
}
