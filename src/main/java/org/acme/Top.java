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

    /**
     * or use EmbeddedId
     */
    @Column("top_id")
    @Id
    Long topId;

    @Column("upper_id")
    @Id
    Long upperId;

    @Column("lower_id")
    @Id
    Long lowerId;

    @OneToMany(mappedBy = "top")
    List<Upper> uppers;
    
}