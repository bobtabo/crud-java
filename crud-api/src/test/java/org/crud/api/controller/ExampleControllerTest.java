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
 * 外部SQLサンプルControllerTestクラスです。<br/>
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
                .andExpect(jsonPath("$.pref.id").value(13))
                .andExpect(jsonPath("$.pref.pref_name").value("東京都"))
                .andExpect(jsonPath("$.prefs[0].id").value(1))
                .andExpect(jsonPath("$.prefs[0].pref_name").value("ユーザー名"));
    }

    /**
     * テストデータを取得します。
     *
     * @return テストデータDTO
     */
    private ExampleDto getExampleDto() {
        ExampleDto dto = new ExampleDto();

        dto.setPref(new ExampleEntity());
        dto.getPref().setId(13);
        dto.getPref().setPrefName("東京都");

        dto.setPrefs(new LinkedList<>());
        ExampleList entity2 = new ExampleList();
        entity2.setId(1);
        entity2.setPrefName("ユーザー名");
        dto.getPrefs().add(entity2);

        return dto;
    }
}
