package com.rookies4.myspringboot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropsRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("VM Arguments = " + args.containsOption("foo")); //false
        System.out.println("Program Arguments = " + args.containsOption("bar")); //true
        
        //Program Argument의 모든 이름을 출력하기
        for(String argName: args.getOptionNames()){
            System.out.println("아규먼트 이름 = " + argName);
        }



    }
}
