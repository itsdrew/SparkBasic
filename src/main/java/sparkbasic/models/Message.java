package sparkbasic.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Message {

    private String text;
    private LocalDateTime time;

}
