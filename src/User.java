public class User {
    private String name;
    private int age;
    private String email;

    Subject subject = new Subject();

    public String getAgeAndName() {
        String name = "name = " + this.name + "; ";
        String age = "age = " + this.age;
        return name + age;
    }

    public void setAge(int age) {
        if (age >= 10) {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (name.toLowerCase() != "user" && name.toLowerCase() != "client") {
            this.name = name;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
