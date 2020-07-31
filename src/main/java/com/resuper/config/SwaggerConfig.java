package com.resuper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment){
        // 设置要显示swagger的环境
        Profiles profiles = Profiles.of("dev","test");

        // 判断当前环境是否处于指定的环境列表中
        boolean environmentFlag  = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 根据环境配置是否要显示swagger
                .enable(environmentFlag)
                .select()
//                .apis(RequestHandlerSelectors.basePackage(("com.resuper.controller")))
                .apis(RequestHandlerSelectors.any())
                .build()
                .groupName("苏涛涛");
    }

    @Bean
    public Docket docket2(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("张云越");
    }
    @Bean
    public Docket docket4(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("张兴佑");
    }
    @Bean
    public Docket docket5(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("项目经理");
    }
    @Bean
    public Docket docket6(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("运维组");
    }

    public static final Contact DEFAULT_CONTACT = new Contact("苏涛涛", "https://github.com/resuper", "1206157433@qq.com");

    /**
     * 配置标题等信息
     * @return
     */
    private ApiInfo apiInfo(){
        return new ApiInfo("Api Documentation 我的标题",
                "Api Documentation------描述",
                "1.0vvvvv",
                "https://me.csdn.net/resuper0",
                DEFAULT_CONTACT, "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
