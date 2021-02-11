package week15d03;

import java.util.ArrayList;
import java.util.List;

public class PostFinder implements Comparable<Post> {

    List<Post> posts=new ArrayList<>();

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getPosts() {
        return posts;
    }

    @Override
    public int compareTo(Post o) {
        return 0;
    }

    public List<Post> findPostsFor(String user){
        return null;
    }


}
