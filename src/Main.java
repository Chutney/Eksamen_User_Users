public class Main {

    public static void main(String[] args) {

        Users allUsers = new Users();

        allUsers.createUser("Noah", Role.ADMIN);
        allUsers.createUser("Signe", Role.EDITOR);
        allUsers.createUser("Esra", Role.READER);
        allUsers.createUser("Sofie", Role.ADMIN);
        allUsers.createUser("Malthe", Role.EDITOR);

        for(User user : allUsers.getUsersWithRole(Role.READER)) {
            System.out.println(user.toString());
        }

    }

}