package org.crud.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.crud.core.dto.Dto;
import org.crud.db.dbflute.exentity.Customer;

import java.util.List;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Getter
@Setter
@NoArgsConstructor
public class CustomerDto implements Dto {
    private static final long serialVersionUID = -6051489655858470681L;

    private List<Customer> customers;

    private Long id;
    private String lastName;
    private String firstName;
    private String lastKana;
    private String firstKana;
    private Integer gender;
    private java.time.LocalDateTime birthday;
    private String postCode;
    private Integer prefId;
    private String address;
    private String building;
    private String tel;
    private String mobile;
    private String email;
    private String remarks;

    private List<?> genders;

    private boolean store;
    private boolean update;
    private boolean delete;
}
