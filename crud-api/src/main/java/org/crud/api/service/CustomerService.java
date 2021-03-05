package org.crud.api.service;

import com.github.dozermapper.core.Mapper;
import lombok.RequiredArgsConstructor;
import org.crud.api.dto.CustomerDto;
import org.crud.api.mapper.CustomerMappingBuilder;
import org.crud.core.repository.CustomerRepository;
import org.crud.core.util.DozerUtil;
import org.crud.db.dbflute.exentity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Service
@RequiredArgsConstructor
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMappingBuilder customerMappingBuilder;

    /**
     *
     * @return
     */
    public CustomerDto index() {
        CustomerDto result = new CustomerDto();
        result.setCustomers(customerRepository.findAll());
        return result;
    }

    /**
     *
     * @param lastKana
     * @param firstKana
     * @param genders
     * @param prefId
     * @return
     */
    public CustomerDto search(String lastKana, String firstKana, List<?> genders, Integer prefId) {
        CustomerDto result = new CustomerDto();
        result.setCustomers(customerRepository.search(lastKana, firstKana, genders, prefId));
        return result;
    }

    /**
     *
     * @param dto
     * @return
     */
    public CustomerDto insert(CustomerDto dto) {
        CustomerDto result = new CustomerDto();

        Mapper mapper = DozerUtil.getMapper(customerMappingBuilder);
        Customer entity = mapper.map(dto, Customer.class);
        customerRepository.insert(entity);
        result.setStore(true);

        return result;
    }

    /**
     *
     * @param dto
     * @return
     */
    public CustomerDto update(CustomerDto dto) {
        CustomerDto result = new CustomerDto();
        Customer entity = customerRepository.findById(dto.getId());
        Mapper mapper = DozerUtil.getMapper(customerMappingBuilder);
        mapper.map(dto, entity);
        customerRepository.update(entity);
        result.setUpdate(true);
        return result;
    }

    /**
     *
     * @param customerId
     * @return
     */
    public CustomerDto delete(Long customerId) {
        CustomerDto result = new CustomerDto();
        Customer entity = customerRepository.findById(customerId);
        customerRepository.logicalDelete(entity);
        result.setDelete(true);
        return result;
    }
}
