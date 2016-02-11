package org.tekCorp.api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by FRERES Thierry on 05/02/2016.
 */
@Document
public class Type {

    @Id
    private String id;
    @Indexed(unique = true)
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString(){
        return "Nom : "+this.nom;
    }

    public String getId() {
        return id;
    }
}