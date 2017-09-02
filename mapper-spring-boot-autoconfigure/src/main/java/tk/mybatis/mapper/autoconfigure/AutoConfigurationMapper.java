package tk.mybatis.mapper.autoconfigure;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * <p>AutoConfigurationMapper</p>
 *
 * @author zhengkaixin
 * @since 2017-08-31 19:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ImportAutoConfiguration
public @interface AutoConfigurationMapper {
}
