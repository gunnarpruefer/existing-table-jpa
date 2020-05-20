package org.acme;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shared_table")
public class Lower {

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name="top_id", referencedColumnName="top_id"),
        @JoinColumn(name="upper_id", referencedColumnName="upper_id")
    })
    @Id
    Upper upper;

    @Column("lower_id")
    @Id
    Long id;
    
}