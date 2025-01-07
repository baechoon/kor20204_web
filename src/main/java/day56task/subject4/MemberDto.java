package day56task.subject4;

public class MemberDto {
    private int code;
    private String id;
    private int pwd;
    private String name;
    private String phone;

    public MemberDto(){}

    public MemberDto(int code, String id, int pwd, String name, String phone) {
        this.code = code;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.phone = phone;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "code=" + code +
                ", id='" + id + '\'' +
                ", pwd=" + pwd +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
