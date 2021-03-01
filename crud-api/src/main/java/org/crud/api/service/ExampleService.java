package org.crud.api.service;

import lombok.RequiredArgsConstructor;
import org.crud.api.dto.ExampleDto;
import org.crud.db.dbflute.exbhv.PrefBhv;
import org.crud.db.dbflute.exbhv.pmbean.ExampleEntityPmb;
import org.crud.db.dbflute.exbhv.pmbean.ExampleListPmb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 外部SQLサンプルServiceクラスです。<br/>
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Service
@RequiredArgsConstructor
public class ExampleService {
    @Autowired
    private PrefBhv prefBhv;

    public ExampleDto search(Long userId) {
        ExampleDto result = new ExampleDto();

        ExampleEntityPmb entityPmb = new ExampleEntityPmb();
        entityPmb.setId(userId);
        result.setPref(prefBhv.outsideSql().selectEntity(entityPmb).get());

        ExampleListPmb listPmb = new ExampleListPmb();
        listPmb.setId(99999999L);
        listPmb.setOrderBy("id");
        result.setPrefs(prefBhv.outsideSql().selectList(listPmb));

        return result;
    }
}
