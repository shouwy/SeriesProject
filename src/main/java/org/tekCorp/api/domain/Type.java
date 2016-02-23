package org.tekCorp.api.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by FRERES Thierry on 05/02/2016.
 */
@Document
@CompoundIndexes({
        @CompoundIndex(name = "type_idx", def = "{'typeName' : 1, 'etatList.etatPersName' : 1}", unique = true)
})
public class Type {

    @Id
    private String id;
    private List<EtatPersonnel> etatList;
    @Indexed(unique = true)
    private String typeName;


    public void setId(String id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<EtatPersonnel> getEtatList() {
        return etatList;
    }

    public void setEtatList(List<EtatPersonnel> etatList) {
        this.etatList = etatList;
    }

    @Override
    public String toString(){
        return "Nom : "+this.typeName;
    }

    public String getId() {
        return id;
    }
}
