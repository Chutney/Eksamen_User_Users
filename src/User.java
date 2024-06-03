public class User {

    private String username;
    private int userid;
    private Role role;

    public User(String username, int userid, Role role) {
        this.username = username;
        this.userid = userid;
        this.role = role;
    }


    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return username + "\n" + userid + "\n" + role.name();
    }

}
