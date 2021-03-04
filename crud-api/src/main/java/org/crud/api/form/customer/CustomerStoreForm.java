package org.crud.api.form.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Getter
@Setter
@NoArgsConstructor
public class CustomerStoreForm implements Serializable {
    private static final long serialVersionUID = -107241525458469548L;

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
