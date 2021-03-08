package org.crud.api.controller;

import lombok.RequiredArgsConstructor;
import org.crud.api.dto.CustomerDto;
import org.crud.api.service.CustomerService;
import org.crud.core.util.DateUtil;
import org.crud.db.dbflute.allcommon.CDef;
import org.crud.db.dbflute.exentity.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.LinkedList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@RestController
@RequiredArgsConstructor
public class CustomerControllerTest {
    private MockMvc mockMvc;

    @Mock
    private CustomerService customerService;

    @InjectMocks
    private CustomerController customerController;

    @BeforeEach
    public void initmocks() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(customerService).build();
    }

    @Test
    public void testIndex() throws Exception {
        when(customerService.index()).thenReturn(getCustomerDto());
        this.mockMvc.perform(get("/api/v1/user/{userId}/example", 1)).andExpect(status().isOk())
                .andExpect(jsonPath("$.pref.id").value(1))
                .andExpect(jsonPath("$.pref.pref_name").value("ユーザー名"))
                .andExpect(jsonPath("$.prefs[0].id").value(1))
                .andExpect(jsonPath("$.prefs[0].pref_name").value("ユーザー名"));
    }

    @Test
    public void testSearch() throws Exception {
        when(customerService.search("みょうじ", "なまえ", Collections.singletonList(1), 13)).thenReturn(getCustomerDto());
        this.mockMvc.perform(get("/api/v1/user/{userId}/example", 1)).andExpect(status().isOk())
                .andExpect(jsonPath("$.pref.id").value(1))
                .andExpect(jsonPath("$.pref.pref_name").value("ユーザー名"))
                .andExpect(jsonPath("$.prefs[0].id").value(1))
                .andExpect(jsonPath("$.prefs[0].pref_name").value("ユーザー名"));
    }

    @Test
    public void testStore() throws Exception {
        when(customerService.insert(getStoreDto())).thenReturn(getCustomerDto());
        this.mockMvc.perform(get("/api/v1/user/{userId}/example", 1)).andExpect(status().isOk())
                .andExpect(jsonPath("$.pref.id").value(1))
                .andExpect(jsonPath("$.pref.pref_name").value("ユーザー名"))
                .andExpect(jsonPath("$.prefs[0].id").value(1))
                .andExpect(jsonPath("$.prefs[0].pref_name").value("ユーザー名"));
    }

    @Test
    public void testUpdate() throws Exception {
        when(customerService.update(getUpdateDto())).thenReturn(getCustomerDto());
        this.mockMvc.perform(get("/api/v1/user/{userId}/example", 1)).andExpect(status().isOk())
                .andExpect(jsonPath("$.pref.id").value(1))
                .andExpect(jsonPath("$.pref.pref_name").value("ユーザー名"))
                .andExpect(jsonPath("$.prefs[0].id").value(1))
                .andExpect(jsonPath("$.prefs[0].pref_name").value("ユーザー名"));
    }

    @Test
    public void testDelete() throws Exception {
        when(customerService.delete(1L)).thenReturn(getCustomerDto());
        this.mockMvc.perform(get("/api/v1/user/{userId}/example", 1)).andExpect(status().isOk())
                .andExpect(jsonPath("$.pref.id").value(1))
                .andExpect(jsonPath("$.pref.pref_name").value("ユーザー名"))
                .andExpect(jsonPath("$.prefs[0].id").value(1))
                .andExpect(jsonPath("$.prefs[0].pref_name").value("ユーザー名"));
    }

    /**
     * テストデータを取得します。
     *
     * @return テストデータDTO
     */
    private CustomerDto getCustomerDto() {
        CustomerDto dto = new CustomerDto();

        Customer entity = new Customer();
        entity.setId(1L);
        entity.setLastName("苗字");
        entity.setFirstName("名前");
        entity.setLastKana("みょうじ");
        entity.setFirstKana("なまえ");
        entity.setGender(CDef.GenderType.MEN.ordinal());
        entity.setBirthday(DateUtil.getLocalDateTime());
        entity.setPostCode("123-4567");
        entity.setPrefId(13);
        entity.setAddress("渋谷区");
        entity.setBuilding("ヒカリエ");
        entity.setTel("03-1234-5678");
        entity.setMobile("080-1234-5678");
        entity.setEmail("hoge@hoge.com");
        entity.setRemarks("あいうえお");

        dto.setCustomers(new LinkedList<>());
        dto.getCustomers().add(entity);

        return dto;
    }

    /**
     * テストデータを取得します。
     *
     * @return テストデータDTO
     */
    private CustomerDto getStoreDto() {
        CustomerDto dto = new CustomerDto();
        dto.setLastName("苗字");
        dto.setFirstName("名前");
        dto.setLastKana("みょうじ");
        dto.setFirstKana("なまえ");
        dto.setGender(CDef.GenderType.MEN.ordinal());
        dto.setBirthday(DateUtil.getLocalDateTime());
        dto.setPostCode("123-4567");
        dto.setPrefId(13);
        dto.setAddress("渋谷区");
        dto.setBuilding("ヒカリエ");
        dto.setTel("03-1234-5678");
        dto.setMobile("080-1234-5678");
        dto.setEmail("hoge@hoge.com");
        dto.setRemarks("あいうえお");
        return dto;
    }

    /**
     * テストデータを取得します。
     *
     * @return テストデータDTO
     */
    private CustomerDto getUpdateDto() {
        CustomerDto dto = new CustomerDto();
        dto.setId(1L);
        dto.setLastName("苗字");
        dto.setFirstName("名前");
        dto.setLastKana("みょうじ");
        dto.setFirstKana("なまえ");
        dto.setGender(CDef.GenderType.MEN.ordinal());
        dto.setBirthday(DateUtil.getLocalDateTime());
        dto.setPostCode("123-4567");
        dto.setPrefId(13);
        dto.setAddress("渋谷区");
        dto.setBuilding("ヒカリエ");
        dto.setTel("03-1234-5678");
        dto.setMobile("080-1234-5678");
        dto.setEmail("hoge@hoge.com");
        dto.setRemarks("あいうえお");
        return dto;
    }
}
