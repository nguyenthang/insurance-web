package vn.insurance.core.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import vn.insurance.core.domain.User;

/**
 * Created by thangnguyen-imac on 4/24/16.
 */
@Repository
@Component
public interface IUserRepository extends MongoRepository<User, String> {
}
