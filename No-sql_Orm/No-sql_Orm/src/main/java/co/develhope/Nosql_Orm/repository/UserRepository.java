package co.develhope.Nosql_Orm.repository;

import co.develhope.Nosql_Orm.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
