package com.roachfu.tutorial;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;
import org.springframework.web.SpringServletContainerInitializer;

import java.io.PrintStream;

/**
 * @author roach
 */
@SpringBootApplication
public class SpringBootContainerApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringBootContainerApplication.class, args);
//        hideBanner(args);
	}

    /**
     * 隐藏banner
     * @param args
     */
	public static void hideBanner(String[] args){
	    SpringApplication springApplication = new SpringApplication(SpringBootContainerApplication.class);
	    springApplication.setBannerMode(Banner.Mode.OFF);
	    springApplication.run(args);

//	    new SpringApplicationBuilder(SpringBootContainerApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}
