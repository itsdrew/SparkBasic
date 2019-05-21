package sparkbasic.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import sparkbasic.models.Message;

import java.time.Instant;
import java.time.LocalDateTime;

public class GoodbyeController {

    private static ObjectMapper mapper = new ObjectMapper();

    public static Route getSayGoodbye = (Request req, Response res) -> {

        Message queryParamsMessage = Message.builder()
                .text(req.queryParamOrDefault("param", "No query params"))
                .build();

        return mapper.writeValueAsString(queryParamsMessage);
    };

    public static Route postSayGoodbye = (Request req, Response res) -> {

        Message goodbyeMessage = Message.builder()
                .text(req.body())
                .time(LocalDateTime.now())
                .build();

        return mapper.writeValueAsString(goodbyeMessage);
    };


}
