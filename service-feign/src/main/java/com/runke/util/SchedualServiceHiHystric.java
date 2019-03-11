package com.runke.util;

import com.runke.service.SchedualServiceHi;

public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
