package org.crud.api.form.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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

    @NotNull
    @Max(50)
    private String lastName;

    @NotNull
    @Max(50)
    private String firstName;

    @NotNull
    @Max(50)
    private String lastKana;

    @NotNull
    @Max(50)
    private String firstKana;

    @NotNull
    private Integer gender;

    @NotNull
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private java.time.LocalDateTime birthday;

    @NotNull
    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}$")
    private String postCode;

    @NotNull
    private Integer prefId;

    @NotNull
    @Max(80)
    private String address;

    @NotNull
    @Max(80)
    private String building;

    @NotNull
    @Pattern(regexp = "^0\\d{1,3}-\\d{1,4}-\\d{4}$")
    private String tel;

    @NotNull
    @Pattern(regexp = "^(070|080|090)-\\d{4}-\\d{4}$")
    private String mobile;

    @NotNull
    @Max(80)
    @Email
    private String email;

    private String remarks;
}
