package org.crud.api.controller;

import lombok.RequiredArgsConstructor;
import org.crud.api.dto.ExampleDto;
import org.crud.api.service.ExampleService;
import org.crud.core.controller.ControllerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * PmbサンプルControllerクラスです。<br/>
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/pref")
public class ExampleController extends ControllerSupport {
    @Autowired
    private ExampleService exampleService;

    /**
     *
     *
     * @return レスポンス
     */
    @GetMapping("/{prefId}/example")
    @ResponseBody
    public ResponseEntity<String> index(@PathVariable("prefId") Long userId) {
        ExampleDto dto = exampleService.search(userId);

        return getResponse(HttpStatus.OK, dto);
    }
}
