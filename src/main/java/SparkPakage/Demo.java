package SparkPakage;

import static spark.Spark.*;

public class Demo {
    public static void main(String[] args) {
        port(8080);
        staticFiles.location("/public");
        get("/", (request, response) -> {
            response.redirect("index.html");
            return null;
        });
    }
}
