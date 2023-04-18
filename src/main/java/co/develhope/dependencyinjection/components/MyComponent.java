package co.develhope.dependencyinjection.components;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data // vedere a cosa serve
@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Lucrezia";
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }

}
