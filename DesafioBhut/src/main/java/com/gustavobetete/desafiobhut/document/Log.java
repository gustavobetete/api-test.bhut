package com.gustavobetete.desafiobhut.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "log")
public class Log {

    @Id
    private String id;
    private String carId;
    private LocalDateTime dataHora;
}
