public abstract class User {

    protected int id;
    protected String name;
    protected String email;

    public User(int id, String name, String email) {

        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract void displayRole();

    public void displayBasicInfo() {

        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
    }
}
