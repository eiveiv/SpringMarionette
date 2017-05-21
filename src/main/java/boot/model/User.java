package boot.model;

/**
 * Created by Eivind on 21.05.2017.
 */
public class User {

    public User(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }

    private String email;
    private String name;
    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
