package com.prx.persistence.general.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import static com.prx.commons.util.JsonUtil.toJson;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

/**
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person", schema = "general")
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = 1884786506064757115L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Size(max = 12)
    @Column(name = "first_name")
    private String name;
    @NotNull
    @Size(max = 12)
    @Column(name = "middle_name")
    private String middleName;
    @NotNull
    @Size(max = 12)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 1)
    @Column(name = "gender")
    private String gender;
    @Column(name = "birthdate")
    private LocalDateTime birthdate;
    @OneToMany(mappedBy = "person", cascade = ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<ContactEntity> contactEntities;

    @Override
    public String toString() {
        return toJson(this);
    }

}
