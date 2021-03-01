package org.crud.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.crud.core.dto.Dto;
import org.crud.db.dbflute.exentity.customize.ExampleEntity;
import org.crud.db.dbflute.exentity.customize.ExampleList;

import java.util.List;

/**
 * 外部SQLサンプルDTOクラスです。<br/>
 * そのうち削除します。
 *
 * @author <a href="mailto:bobtabo.buhibuhi@gmail.com">Satoshi Nagashiba</a>
 */
@Getter
@Setter
@NoArgsConstructor
public class ExampleDto implements Dto {
    private static final long serialVersionUID = -287897202411437584L;

    private ExampleEntity user;
    private List<ExampleList> users;
}