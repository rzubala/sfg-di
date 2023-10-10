package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean constructor");
    }

    public String getScope() {
        return "I'm SINGLETON";
    }
}
