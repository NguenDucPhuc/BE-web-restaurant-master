public interface PostDao {
    Post getPostById(int id);

    List<Post> getAllPosts();

    List<Post> getPostsByCategory(String category);

    void addPost(Post post);

    void updatePost(int id, Post updatedPost);

    void deletePost(int id);
}
