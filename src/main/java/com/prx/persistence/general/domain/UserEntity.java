package com.prx.persistence.general.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user", schema = "general")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 135627029337097239L;
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Size(max = 12)
    @Column(name = "alias")
    private String alias;
    @NotNull
    @Size(max = 250)
    @Column(name = "password")
    private String password;
    @NotNull
    @Column(name = "active")
    private Boolean active;
    @ManyToOne(cascade = REFRESH, fetch = LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private PersonEntity person;

    @Override
    public String toString() {
        return toJson(this);
    }

}
