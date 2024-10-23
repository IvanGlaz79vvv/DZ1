import java.util.List;


public class UserCrud implements Crud<UserCrud> {
    private int id;
    private String name;
    private String soname;
    private String email;
    private String password;

    private String status;
    private List<UserCrud> friends;
    private List<GiftCrud> gift;

    List<String> messageIn;
    List<String> messageOut;

    public UserCrud() {
    }

    public UserCrud(String name, String soname, String email, String password) {
        this.name = name;
        this.soname = soname;
        this.email = email;
        this.password = password;
        create(this);
    }

    @Override
    public void create(UserCrud model) {Repository.users.add(model);
    }

    @Override
    public void update(UserCrud model) {    }

    @Override
    public UserCrud find(Integer id) {
        for(UserCrud user: Repository.users) {
            if(user.getId() == id) {
                return this;
            }
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        UserCrud user = find(id);
        Repository.users.remove(user);
    }

    public int getId() {
        return id;
    }
    public String getName() {return name;}
    public String getSoname() {return soname;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setSoname(String soname) {this.soname = soname;}
    public void setEmail(String email) {this.email = email;}
    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {
        return "UserCrud{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", soname='" + soname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", friends=" + friends +
                ", gift=" + gift +
                ", messageIn=" + messageIn +
                ", messageOut=" + messageOut +
                '}';
    }
}

