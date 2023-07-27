public interface PostService {
    Post getPostById(int id);

    List<Post> getAllPosts();

    List<Post> getPostsByCategory(String category);

    void addPost(Post post);

    boolean updatePost(int id, Post updatedPost);

    boolean deletePost(int id);
}