package cn.yifeng.lamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @program: Intelligent_lamp_post
 * @description: 基于Java微服务的智慧灯杆状态采集系统
 * @author: Yifeng
 * @create: 2020-05-03 21:02
 **/
@SpringBootApplication
public class IntelligentLampPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelligentLampPostApplication.class, args);
	}

}
