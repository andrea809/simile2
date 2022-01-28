package simile2;

import com.google.gson.Gson;
import domain.Data;
import org.json.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class FileJson {
    private JSONObject jsonObject;
    public FileJson(String url) {
        try {
            jsonObject = readJsonFromUrl(url);
        } catch (IOException e) {
            System.out.println("Nessuna Connessione a Internet");
        }
        getData();
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
    public ArrayList<Data> getData() {
        Gson gson = new Gson();
        ArrayList<Data> data = new ArrayList<Data>();
        try {
            JSONArray array = jsonObject.getJSONArray("data");
            for (int i = 0; i < array.length(); i++)
                data.add(gson.fromJson(array.getJSONObject(i).toString(), Data.class));
            return data;
        } catch (NullPointerException e) {
            return null;
        }
    }
}
