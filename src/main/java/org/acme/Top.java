package org.acme;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shared_table")
public class Top {

    @Column("top_id")
    @Id
    Long id;

    @OneToMany(mappedBy = "top")
    List<Upper> uppers;
    
}