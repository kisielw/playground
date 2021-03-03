package playground.junit.firsttest;

public class User {

    private String userName;
    private String nickName;

    public User(String userName, String nickName) {
        this.userName = userName;
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getSpecificName() {
        return userName + "_" + nickName;
    }

}
