import java.util.List;

public class UserCrud implements Crud {
    private String name;
    private String soname;
    private String email;
    private String password;

    private String status;
    private List<UserCrud> friends;
    private List<GiftCrud> gift;

    List<String> messageIn;
    List<String> messageOut;

    public void create(UserCrud model){

    }

}
