package com.prx.persistence.general.domain;

import com.prx.commons.enums.types.ContactType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

import static com.prx.commons.util.JsonUtil.toJson;
import static javax.persistence.CascadeType.REFRESH;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact", schema = "general")
public class ContactEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "content")
    private String content;
    @Column(name = "contact_type_id")
    private ContactType contactType;
    @Column(name = "active")
    private Boolean active;
    @ManyToOne(cascade = REFRESH, fetch = LAZY)
    @JoinColumn(name = "person_id")
    private PersonEntity person;

    @Override
    public String toString() {
        return toJson(this);
    }
}
