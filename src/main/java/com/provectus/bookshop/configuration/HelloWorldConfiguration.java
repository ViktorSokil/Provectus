package com.provectus.bookshop.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.websystique.springmvc")
@Import(DataBaseOracleConfig.class)
public class HelloWorldConfiguration extends WebMvcConfigurerAdapter{
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		registry.viewResolver(viewResolver);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}

	public MappingJackson2HttpMessageConverter jacksonMessageConverter(){
		MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();

		ObjectMapper mapper = new ObjectMapper();
		//Registering Hibernate4Module to support lazy objects
		mapper.registerModule(new Hibernate5Module());

		messageConverter.setObjectMapper(mapper);
		return messageConverter;

	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		//Here we add our custom-configured HttpMessageConverter
		converters.add(jacksonMessageConverter());
		super.configureMessageConverters(converters);
	}

}