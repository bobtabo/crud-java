package org.crud.api.form.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Getter
@Setter
@NoArgsConstructor
public class CustomerSearchForm implements Serializable {
    private static final long serialVersionUID = 4763636794635638212L;

    private String lastKana;
    private String firstKana;
    private List<?> genders;
    private Integer prefId;
}
