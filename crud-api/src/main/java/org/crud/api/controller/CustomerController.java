package org.crud.api.controller;

import com.github.dozermapper.core.Mapper;
import lombok.RequiredArgsConstructor;
import org.crud.api.dto.CustomerDto;
import org.crud.api.form.customer.CustomerSearchForm;
import org.crud.api.form.customer.CustomerStoreForm;
import org.crud.api.form.customer.CustomerUpdateForm;
import org.crud.api.mapper.CustomerMappingBuilder;
import org.crud.api.service.CustomerService;
import org.crud.core.controller.ControllerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 顧客管理Controllerクラスです。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/customer")
public class CustomerController extends ControllerSupport {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerMappingBuilder customerMappingBuilder;

    /**
     * 初期表示します。
     *
     * @return
     */
    @GetMapping("/{customerId}/index")
    public ResponseEntity<String> index() {
        CustomerDto dto = customerService.index();
        return getResponse(HttpStatus.OK, dto.getCustomers());
    }

    /**
     * 検索します。
     *
     * @param form
     * @return
     */
    @GetMapping("/{customerId}/search")
    public ResponseEntity<String> search(@ModelAttribute @Validated CustomerSearchForm form) {
        CustomerDto dto = customerService.search(form.getLastKana(), form.getFirstKana(), form.getGenders(), form.getPrefId());
        return getResponse(HttpStatus.OK, dto.getCustomers());
    }

    /**
     * 登録します。
     *
     * @param form
     * @return
     */
    @PostMapping("/{customerId}/store")
    public ResponseEntity<String> store(@ModelAttribute @Validated CustomerStoreForm form) {
        Mapper mapper = getDozerMapper(customerMappingBuilder);
        CustomerDto param = mapper.map(form, CustomerDto.class);
        CustomerDto dto = customerService.insert(param);
        return getResponse(HttpStatus.OK, dto);
    }

    /**
     * 更新します。
     *
     * @param form
     * @return
     */
    @PostMapping("/{customerId}/update")
    public ResponseEntity<String> update(@ModelAttribute @Validated CustomerUpdateForm form) {
        Mapper mapper = getDozerMapper(customerMappingBuilder);
        CustomerDto param = mapper.map(form, CustomerDto.class);
        CustomerDto dto = customerService.update(param);
        return getResponse(HttpStatus.OK, dto);
    }

    /**
     * 削除します。
     *
     * @param customerId
     * @return
     */
    @GetMapping("/{customerId}/delete")
    public ResponseEntity<String> delete(@PathVariable("customerId") Long customerId) {
        CustomerDto dto = customerService.delete(customerId);
        return getResponse(HttpStatus.OK, dto);
    }
}
