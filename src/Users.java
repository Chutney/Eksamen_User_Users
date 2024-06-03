import java.lang.reflect.Array;
import java.util.ArrayList;

public class Users {

    private ArrayList<User> userList;

    public Users() {
        userList = new ArrayList<>();
    }


    public void createUser(String name, Role role) {
        userList.add(new User(name, userList.size()+1 ,role));

    }

    public ArrayList<User> getUsersWithRole(Role role) {
        ArrayList<User> listOfUsersWithRole = new ArrayList<>();

        for(User user : userList) {
            if(user.getRole() == role) {
                listOfUsersWithRole.add(user);
            }
        }

        return listOfUsersWithRole;

    }


}
