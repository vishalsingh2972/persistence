/*
 *  @(#)UserEntity.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */
package com.prx.persistence.general.domain;

import com.prx.commons.util.JsonUtil;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * UserEntity.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @version 1.0.2.20200904-01, 2020-10-25
 */
@Getter
@Setter
@Entity
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
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private PersonEntity person;
    @OneToMany(mappedBy = "user",
        fetch = EAGER,
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    private Set<UserRolEntity> userRol;



    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }

}
