package us.peaksoft.apiadminservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@Data
public class SessionInfo {

    private String token;

    @JsonFormat(pattern = "dd.MM.yyyy HH:mm:ss")
    private Date endDate;
}
