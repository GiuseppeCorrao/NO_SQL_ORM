package co.develhope.Nosql_Orm.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.lang.NonNull;

@Document
@Data
public class User {

    @Id
    @Field
    private String id;
    @NonNull
    private String firstname;
    @NonNull
    private String lastname;

    @Indexed(unique = true)
    private String email;

}
