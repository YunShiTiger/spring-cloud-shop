package quick.pager.shop.user.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 登陆
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserLoginDTO extends UserInfoDTO {
    private static final long serialVersionUID = -8483169592580367377L;

    /**
     * 短信验证码
     */
    private String verifyCode;
    /**
     * 登陆密码
     */
    private String password;
    /**
     * 图形验证码
     */
    private String graphicCode;
}