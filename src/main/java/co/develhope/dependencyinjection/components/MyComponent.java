package co.develhope.dependencyinjection.components;
import org.springframework.stereotype.Component;

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

    public void setMyComponentName(String myComponentName) {
        this.myComponentName = myComponentName;
    }

    @Override
    public String toString() {
        return "MyComponent{" +
                "myComponentName='" + myComponentName + '\'' +
                '}';
    }

    public MyComponent(String myComponentName) {
        this.myComponentName = myComponentName;
    }

}
