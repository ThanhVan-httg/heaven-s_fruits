package com.thanhvan.apiresponse.domain.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @Column(name = "id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String id;

    @Column(name = "group_id")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String groupId;

  /*  @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GroupCategory groupCategory;
*/
/*    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Fruit fruit;*/

    @Column(name = "name")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String name;

    @Column(name = "note")
    @JsonView({Views.Summary.class, Views.Detail.class})
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
