package us.peaksoft.apiadminservice.models;

import lombok.Data;

import java.util.List;

/**
 * Created by Sayfullah on 12.03.2021.
 */
@Data
public class User {
    private Long id;

    private String name;

    private boolean active;

    private Role roleDto;

    private Account accountDto;

    private List<Phone> phones;
}
