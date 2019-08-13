import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {

    public JSONObject getJSONObject(String fileName) throws IOException {

        String file = new String(Files.readAllBytes((Paths.get(fileName))));
        return new JSONObject(file);
    }
    public JSONArray getJSONArray(String filename){
        String file = null;
        try {
            file = new String(Files.readAllBytes((Paths.get(filename))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONArray(file);
    }

    public static void main(String[] args) {
        Example ex = new Example();
        try {
            JSONObject obj = ex.getJSONObject("/Users/sergiudragoi/Cursul NoSql/src/main/resources/exampleObject.json");
            System.out.println(obj);

            JSONArray array = ex.getJSONArray("/Users/sergiudragoi/Cursul NoSql/src/main/resources/exampleArray.json");
            System.out.println(array);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
