package org.crud.api.service;

import lombok.RequiredArgsConstructor;
import org.crud.api.dto.CustomerDto;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Service
@RequiredArgsConstructor
public class CustomerService {
    public CustomerDto index() {
        CustomerDto result = new CustomerDto();
        return result;
    }

    public CustomerDto search() {
        CustomerDto result = new CustomerDto();
        return result;
    }

    public CustomerDto insert() {
        CustomerDto result = new CustomerDto();
        return result;
    }

    public CustomerDto update() {
        CustomerDto result = new CustomerDto();
        return result;
    }

    public CustomerDto delete() {
        CustomerDto result = new CustomerDto();
        return result;
    }
}
