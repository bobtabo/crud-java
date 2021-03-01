package org.crud.api.controller;

import lombok.RequiredArgsConstructor;
import org.crud.api.dto.CustomerDto;
import org.crud.api.form.customer.CustomerSearchForm;
import org.crud.api.form.customer.CustomerStoreForm;
import org.crud.api.form.customer.CustomerUpdateForm;
import org.crud.api.service.CustomerService;
import org.crud.core.controller.ControllerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/user")
public class CustomerController extends ControllerSupport {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{customerId}/index")
    public ResponseEntity<String> index() {
        CustomerDto dto = customerService.index();
        return getResponse(HttpStatus.OK, dto);
    }

    @GetMapping("/{customerId}/search")
    public ResponseEntity<String> search(@ModelAttribute @Validated CustomerSearchForm form) {
        CustomerDto dto = customerService.search();
        return getResponse(HttpStatus.OK, dto);
    }

    @PostMapping("/{customerId}/store")
    public ResponseEntity<String> store(@ModelAttribute @Validated CustomerStoreForm form) {
        CustomerDto dto = customerService.insert();
        return getResponse(HttpStatus.OK, dto);
    }

    @PostMapping("/{customerId}/update")
    public ResponseEntity<String> update(@ModelAttribute @Validated CustomerUpdateForm form) {
        CustomerDto dto = customerService.update();
        return getResponse(HttpStatus.OK, dto);
    }

    @GetMapping("/{customerId}/delete")
    public ResponseEntity<String> delete() {
        CustomerDto dto = customerService.delete();
        return getResponse(HttpStatus.OK, dto);
    }
}
