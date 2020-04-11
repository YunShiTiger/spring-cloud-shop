package quick.pager.shop.platform.response;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.shop.response.BasicResponse;

/**
 * 系统配置
 *
 * @author siguiyang
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SystemConfigResponse extends BasicResponse {

    private static final long serialVersionUID = -2876381839457142973L;

    private Long id;

    private String configName;

    private String configType;

    private String description;

    private Boolean configStatus;
}
