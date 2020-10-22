/*
 *  @(#)PersonEntity.java
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
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
@Getter
@Setter
@Entity
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
    private LocalDate birthdate;

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }

}
