public class Person {
    private String mobileNumber;
    private String password;
    private String email;
    private User user;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", user=" + user.getName() + " " + user.getLastName() +
                '}';
    }
}
