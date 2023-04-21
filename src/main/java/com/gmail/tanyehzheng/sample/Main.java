package com.gmail.tanyehzheng.sample;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

public class Main {
    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        KieBase kBase1 = kieContainer.getKieBase("KBase1");
        KieSession kieSession1 = kieContainer.newKieSession("KSession2_1");
        StatelessKieSession newStatelessKieSession = kieContainer.newStatelessKieSession("KSession2_2");
    }
}
