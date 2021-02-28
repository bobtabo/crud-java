package org.crud.api.controller;

import lombok.RequiredArgsConstructor;
import org.crud.api.dto.ExampleDto;
import org.crud.api.service.ExampleService;
import org.crud.db.dbflute.exentity.customize.ExampleEntity;
import org.crud.db.dbflute.exentity.customize.ExampleList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * PmbサンプルControllerTestクラスです。<br/>
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@RestController
@RequiredArgsConstructor
public class ExampleControllerTest {
    private MockMvc mockMvc;

    @Mock
    private ExampleService exampleService;

    @InjectMocks
    private ExampleController exampleController;

    @BeforeEach
    public void initmocks() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(exampleController).build();
    }

    @Test
    public void testIndex() throws Exception {
        when(exampleService.search(1L)).thenReturn(getExampleDto());
        this.mockMvc.perform(get("/api/v1/user/{userId}/example", 1)).andExpect(status().isOk())
                .andExpect(jsonPath("$.user.id").value(1L))
                .andExpect(jsonPath("$.user.token").value("xxxxxxx"))
                .andExpect(jsonPath("$.user.user_name").value("ユーザー名"))
                .andExpect(jsonPath("$.users[0].id").value(1L))
                .andExpect(jsonPath("$.users[0].token").value("xxxxxxx"))
                .andExpect(jsonPath("$.users[0].user_name").value("ユーザー名"));
    }

    /**
     * テストデータを取得します。
     *
     * @return テストデータDTO
     */
    private ExampleDto getExampleDto() {
        ExampleDto dto = new ExampleDto();

        dto.setUser(new ExampleEntity());
        dto.getUser().setId(1L);
        dto.getUser().setToken("xxxxxxx");
        dto.getUser().setUserName("ユーザー名");

        dto.setUsers(new LinkedList<>());
        ExampleList entity2 = new ExampleList();
        entity2.setId(1L);
        entity2.setToken("xxxxxxx");
        entity2.setUserName("ユーザー名");
        dto.getUsers().add(entity2);

        return dto;
    }
}
