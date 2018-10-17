package com.jay.config;

import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.security.auth.login.Configuration;

/**
 * Created by xiang.wei on 2018/10/17
 *
 * @author xiang.wei
 */
@Component
public class FreemarkerConfig {
    @Autowired
    private Configuration configuration;
    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void setSharedVariable() throws TemplateModelException {
//        configuration.setConfiguration("author_contents",
//                applicationContext.getBean(AuthorContentsDirective.class));

    }
}
