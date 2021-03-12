package us.peaksoft.apiadminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "us.peaksoft.apiadminservice.microservices")
@EnableDiscoveryClient
public class ApiAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiAdminServiceApplication.class, args);
    }

}
