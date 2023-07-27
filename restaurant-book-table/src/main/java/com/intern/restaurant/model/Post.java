public class Post {
    private int ps_id;
    private String ps_title;
    private String ps_thumbnail_link;
    private String ps_create_date;
    private int ps_published;

    public Post() {
    }

    public Post(int ps_id, String ps_title, String ps_thumbnail_link, String ps_create_date, int ps_published) {
        this.ps_id = ps_id;
        this.ps_title = ps_title;
        this.ps_thumbnail_link = ps_thumbnail_link;
        this.ps_create_date = ps_create_date;
        this.ps_published = ps_published;
    }

    public int getPs_id() {
        return ps_id;
    }

    public String getPs_title() {
        return ps_title;
    }

    public String getPs_thumbnail_link() {
        return ps_thumbnail_link;
    }

    public String getPs_create_date() {
        return ps_create_date;
    }

    public int getPs_published() {
        return ps_published;
    }

    public void setPs_id(int ps_id) {
        this.ps_id = ps_id;
    }

    public void setPs_title(String ps_title) {
        this.ps_title = ps_title;
    }

    public void setPs_thumbnail_link(String ps_thumbnail_link) {
        this.ps_thumbnail_link = ps_thumbnail_link;
    }

    public void setPs_create_date(String ps_create_date) {
        this.ps_create_date = ps_create_date;
    }

    public void setPs_published(int ps_published) {
        this.ps_published = ps_published;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Post{" +
                "ps_id=" + ps_id +
                ", ps_title='" + ps_title + '\'' +
                ", ps_thumbnail_link='" + ps_thumbnail_link + '\'' +
                ", ps_create_date='" + ps_create_date + '\'' +
                ", ps_published=" + ps_published +
                '}';
    }
}
