package test;

import com.xia.service.LogService;


import java.util.ServiceLoader;

public class ServiceLoaderTest {

    public static void main(String[] args) {

        ServiceLoader<LogService> loader = ServiceLoader.load(LogService.class);
        //System.out.println(Thread.currentThread().getContextClassLoader());
        for (LogService service : loader) {
            System.out.println(service.getClass() +service.log());
        }

    }

}
