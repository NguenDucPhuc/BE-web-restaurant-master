@Repository
public class PostRepositoryImpl implements PostDao {
    private List<Post> posts = new ArrayList<>();
    private AtomicInteger idCounter = new AtomicInteger(1);

    @Override
    public Post getPostById(int id) {
        return posts.stream()
                .filter(post -> post.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Post> getAllPosts() {
        return new ArrayList<>(posts);
    }

    @Override
    public List<Post> getPostsByCategory(String category) {
        return posts.stream()
                .filter(post -> post.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    @Override
    public void addPost(Post post) {
        post.setId(idCounter.getAndIncrement());
        posts.add(post);
    }

    @Override
    public void updatePost(int id, Post updatedPost) {
        Post existingPost = getPostById(id);
        if (existingPost != null) {
            existingPost.setTitle(updatedPost.getTitle());
            existingPost.setContent(updatedPost.getContent());
            existingPost.setCategory(updatedPost.getCategory());
        }
    }

    @Override
    public void deletePost(int id) {
        posts.removeIf(post -> post.getId() == id);
    }
}
