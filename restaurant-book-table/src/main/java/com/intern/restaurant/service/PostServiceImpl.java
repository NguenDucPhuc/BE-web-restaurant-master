@Service
public class PostServiceImpl implements PostService {
    private PostDao postDao;

    @Autowired
    public PostServiceImpl(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public Post getPostById(int id) {
        return postDao.getPostById(id);
    }

    @Override
    public List<Post> getAllPosts() {
        return postDao.getAllPosts();
    }

    @Override
    public List<Post> getPostsByCategory(String category) {
        return postDao.getPostsByCategory(category);
    }

    @Override
    public void addPost(Post post) {
        postDao.addPost(post);
    }

    @Override
    public boolean updatePost(int id, Post updatedPost) {
        Post postToUpdate = postDao.getPostById(id);
        if (postToUpdate != null) {
            postToUpdate.setTitle(updatedPost.getTitle());
            postToUpdate.setContent(updatedPost.getContent());
            postToUpdate.setCategory(updatedPost.getCategory());
            postDao.updatePost(id, postToUpdate);
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePost(int id) {
        Post postToDelete = postDao.getPostById(id);
        if (postToDelete != null) {
            postDao.deletePost(id);
            return true;
        }
        return false;
    }
}
