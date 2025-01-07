package day56task.subject2;

public class RestDto {
    private String key1;
    private String key;

    public RestDto(){}

    public RestDto(String key1, String key) {
        this.key1 = key1;
        this.key = key;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "RestDto{" +
                "key1='" + key1 + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
