package Software.ulpgc.kata6.main;

import Software.ulpgc.kata6.adapters.HttpAdapter;

import static spark.Spark.*;

public class Server {
    public static void start(){
        port(8080);

        get("/:operation",(req, res) ->{
            String operation = req.params("operation");
            String a = req.queryParams("a");
            String b = req.queryParams("b");
            return HttpAdapter.handle(operation, a, b);
        });
    }
}
