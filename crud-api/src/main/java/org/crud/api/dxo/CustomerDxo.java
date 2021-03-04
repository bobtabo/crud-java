package org.crud.api.dxo;

import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import com.github.dozermapper.core.loader.api.TypeMappingOptions;
import org.crud.api.dto.CustomerDto;
import org.crud.api.form.customer.CustomerSearchForm;
import org.crud.api.form.customer.CustomerStoreForm;
import org.crud.api.form.customer.CustomerUpdateForm;
import org.crud.db.dbflute.exentity.Customer;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Component
public class CustomerDxo extends BeanMappingBuilder {
    @Override
    protected void configure() {
        mapping(CustomerSearchForm.class, CustomerDto.class, TypeMappingOptions.mapNull(true))
                .fields("lastKana", "lastKana")
                .fields("firstKana", "firstKana")
                .fields("genders", "genders")
                .fields("prefId", "prefId");
        mapping(CustomerStoreForm.class, CustomerDto.class, TypeMappingOptions.mapNull(true))
                .fields("lastName", "lastName")
                .fields("firstName","firstName")
                .fields("lastKana", "lastKana")
                .fields("firstKana", "firstKana")
                .fields("gender", "gender")
                .fields("postCode", "postCode")
                .fields("prefId", "prefId")
                .fields("address", "address")
                .fields("building", "building")
                .fields("tel", "tel")
                .fields("mobile", "mobile")
                .fields("email", "email")
                .fields("remarks", "remarks");
        mapping(CustomerUpdateForm.class, CustomerDto.class, TypeMappingOptions.mapNull(true))
                .fields("id", "id")
                .fields("lastName", "lastName")
                .fields("firstName","firstName")
                .fields("lastKana", "lastKana")
                .fields("firstKana", "firstKana")
                .fields("gender", "gender")
                .fields("postCode", "postCode")
                .fields("prefId", "prefId")
                .fields("address", "address")
                .fields("building", "building")
                .fields("tel", "tel")
                .fields("mobile", "mobile")
                .fields("email", "email")
                .fields("remarks", "remarks");
        mapping(CustomerDto.class, Customer.class, TypeMappingOptions.mapNull(true))
                .fields("id", "id")
                .fields("lastName", "lastName")
                .fields("firstName","firstName")
                .fields("lastKana", "lastKana")
                .fields("firstKana", "firstKana")
                .fields("gender", "gender")
                .fields("postCode", "postCode")
                .fields("prefId", "prefId")
                .fields("address", "address")
                .fields("building", "building")
                .fields("tel", "tel")
                .fields("mobile", "mobile")
                .fields("email", "email")
                .fields("remarks", "remarks");
        mapping(CustomerDto.class, Customer.class, TypeMappingOptions.mapNull(true))
                .fields("id", "id")
                .fields("lastName", "lastName")
                .fields("firstName","firstName")
                .fields("lastKana", "lastKana")
                .fields("firstKana", "firstKana")
                .fields("gender", "gender")
                .fields("postCode", "postCode")
                .fields("prefId", "prefId")
                .fields("address", "address")
                .fields("building", "building")
                .fields("tel", "tel")
                .fields("mobile", "mobile")
                .fields("email", "email")
                .fields("remarks", "remarks");
    }
}
