package com.prx.persistence.general.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
@Table(name = "service", schema = "general")
public class Service {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToOne(cascade = REFRESH, fetch = LAZY)
    @JoinColumn(name = "application_id", referencedColumnName = "id")
    private Application application;

    @Override
    public String toString() {
        return toJson(this);
    }

}
