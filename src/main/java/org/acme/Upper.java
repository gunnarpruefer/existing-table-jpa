package org.acme;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shared_table")
public class Upper {

    @JoinColumn("top_id")
    @Id
    Top top;

    @Column("upper_id")
    @Id
    Long id;

    @OneToMany(mappedBy = "top")
    List<Lower> lowers;
}