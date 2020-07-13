package com.prx.persistence.tradeskey.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "instrument", schema = "tradeskey")
public class InstrumentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id_instrument")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToOne(fetch = LAZY, optional = false, targetEntity = CurrencyEntity.class)
    @JoinColumn(name = "fk_currency_base")
    private CurrencyEntity currencySource;
    @OneToOne(fetch = LAZY, optional = false, targetEntity = CurrencyEntity.class)
    @JoinColumn(name = "fk_currency_variable")
    private CurrencyEntity currencyTarget;
    @Column(name = "active")
    private Boolean active;
    @ManyToMany(mappedBy = "instruments",
            fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    private Set<ExchangeEntity> exchanges;

    @Override
    public int hashCode() {
        return 58 * (null == name ? 0 : name.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InstrumentEntity other = (InstrumentEntity) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

}
