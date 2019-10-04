package entity;

public class Author {
    private Integer num;
    private String nickname;
    private String cover;

    public Author(Integer num, String nickname, String cover) {
        this.num = num;
        this.nickname = nickname;
        this.cover = cover;
    }

    public Author() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Author{" +
                "num='" + num + '\'' +
                ", nickname='" + nickname + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }
}
