package task_3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import task_1.Employee;

import java.util.ArrayList;
import java.util.List;

public class JsonToListConverter {
    public List<Employee> jsonToList(String json) {
        List<Employee> result = new ArrayList<>();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try {
            Object obj = new JSONParser().parse(json);
            JSONArray employee = (JSONArray) obj;
            for (Object o : employee) {
                result.add(gson.fromJson(o.toString(), Employee.class));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}