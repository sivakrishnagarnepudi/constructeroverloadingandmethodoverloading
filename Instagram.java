public class Instagram {
    private String userName;
    private String password;
    private long mobileNo;
    private String otp;

    public Instagram(String userName,String password){
        this.userName=userName;
        this.password=password;

    }

    boolean login(String userName,String password) {
        return  (this.userName.equals(userName) && this.password.equals(password));

    }

    public Instagram(long mobileNo,String otp){
        this.mobileNo=mobileNo;
        this.otp=otp;
    }

    boolean login(long mobileNo,String otp){
        return (this.mobileNo==mobileNo && this.otp.equals(otp));

    }

    public static void main(String[] args){
        Instagram instagram=new Instagram("Tirumala","1234");
        boolean up=instagram.login("Tirumala","1234");
        if(up!=false){
            System.out.println("LoginSuccessFull");
        }
        else {
            System.out.println("Your Credentials IS wrong");
        }

        Instagram insta=new Instagram(1234567890,"123");
        boolean mo=insta.login(123456790,"123");
        if(mo!=false){
            System.out.println("LoginSuccessFull");
        }
        else {
            System.out.println("Your Credentials IS wrong");
        }

    }
}
