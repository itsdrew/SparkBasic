package sparkbasic;

import lombok.extern.slf4j.Slf4j;
import sparkbasic.controllers.GoodbyeController;

import static spark.Spark.get;
import static spark.Spark.post;


@Slf4j
public class SparkResources {


    public static void defineRoutes() {

        //curl http://localhost:8888/hello
        get("/hello", (request, response) -> "Hello World!");


        //curl -X POST -d {"someKey":"someValue"} http://localhost:8888/hello
        post("/hello", (request, response) -> {

            //The @Slf4j annotation is from lombok. It allows us to use things like 'log.info'
            log.info("Body: {}", request.body());

            return "Hello world! " + request.body();
        });


        //curl http://localhost:8888/goodbye?param=drew
        get("/goodbye", GoodbyeController.getSayGoodbye);


        //curl -X POST -d "Some text" http://localhost:8888/goodbye
        post("/goodbye", GoodbyeController.postSayGoodbye);
    }
}
