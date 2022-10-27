import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.util.List;

public class JSONPathTester {
    public static void main(String[] args) {
        String jsonDataSourceString = "{\"event\":\"dob:abcdef\"}";
        DocumentContext jsonContext = JsonPath.parse(jsonDataSourceString);
        String jsonpathEventPath = "[?(!(@.event =~ /[a-zA-Z0-9]*ssn[a-zA-Z0-9]*|[a-zA-Z0-9]*dob[a-zA-Z0-9]*|[a-zA-Z0-9]*cumbid[a-zA-Z0-9]*|[a-zA-Z0-9]*firstname[a-zA-Z0-9]*|[a-zA-Z0-9]*lastname[a-zA-Z0-9]*/i))]";
        JSONArray jsonpathEvent = jsonContext.read(jsonpathEventPath);
        System.out.println(jsonpathEvent);
    }
}
