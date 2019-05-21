package sparkbasic;

import spark.Spark;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        Spark.port(8888);
        SparkResources.defineRoutes();


    }
}
