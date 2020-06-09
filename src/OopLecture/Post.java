package OopLecture;
import java.util.Date;

public class Post {

    public static String nameOfBlog = "My Blog";
    public static int noOfSiteViews;

    public int noOfPostViews;
    public Date createdAt;
    public Date editedAt;
    public String title;
    public String content;
    public String category;
    public Person author;

    public void printSummary(){
        System.out.printf("Title: %s%nContent: %s", this.title, this.content);

    }

    public static String returnLongerPostTitle(Post p1, Post p2){
        if(p1.title.length() > p2.title.length()) {
            return p1.title;
        } else {
            return p2.title;
        }
    }

    public static void main(String[] args) {
        Post post1 = new Post();
        post1.title = "First post";

        Post post2 = new Post();
        post2.title = "Second Blog Post";

        String longerTitle = Post.returnLongerPostTitle(post1, post2);
        System.out.println(longerTitle);
    }

}
