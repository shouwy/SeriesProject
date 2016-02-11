package org.tekCorp.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tekCorp.api.domain.Element;

import java.util.List;

/**
 * Created by FRERES Thierry on 05/02/2016.
 */
@Repository
public interface ElementRepository extends MongoRepository<Element, String> {
    List<Element> findByType(Integer idType);
    Element findByNomAndYear(String nom, Integer year);
}