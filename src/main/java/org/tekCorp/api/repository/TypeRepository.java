package org.tekCorp.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tekCorp.api.domain.Type;

/**
 * Created by FRERES Thierry on 05/02/2016.
 */
@Repository
public interface TypeRepository extends MongoRepository<Type, String> {
    Type findByTypeName(String typeName);
}
