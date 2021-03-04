package org.crud.api.form.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Getter
@Setter
@NoArgsConstructor
public class CustomerUpdateForm implements Serializable {
    private static final long serialVersionUID = 3490091365753228443L;

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
}
