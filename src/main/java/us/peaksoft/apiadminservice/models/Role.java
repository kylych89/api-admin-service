package us.peaksoft.apiadminservice.models;

import lombok.Data;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@Data
public class Role {
    private Long id;

    private String name;

    private boolean active;
}
