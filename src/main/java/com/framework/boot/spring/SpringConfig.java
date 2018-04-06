package com.framework.boot.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.MultipartConfigElement;
import java.util.List;

@Configuration
@ComponentScan(basePackages = { "com.framework", "com.myweb" })
@EnableWebMvc
@PropertySource({"classpath:/properties/application.properties"})
@Order(4)
public class SpringConfig extends WebMvcConfigurerAdapter {

	private static final Logger logger = LogManager.getLogger(SpringConfig.class);


	/**
	 * 在配置文件中配置的文件保存路径
	 */
	@Value("${img.location}")
	private String location;

	@Bean
	public ViewResolver viewResolver() {
		logger.info("ViewResolver create!");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/jsp/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		logger.info("ConfigureMessageConverters create!");
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()	.indentOutput(true);
		converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
	}

	@Bean
	public MultipartConfigElement multipartConfigElement(){
		MultipartConfigFactory factory = new MultipartConfigFactory();
		//文件最大KB,MB
		factory.setMaxFileSize("2MB");
		//设置总上传数据总大小
		factory.setMaxRequestSize("10MB");
		return factory.createMultipartConfig();
	}

}
