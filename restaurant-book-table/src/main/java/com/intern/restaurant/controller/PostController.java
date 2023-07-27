@RestController
public class PostController {
    private PostService postService;

    // Constructor injection or Autowiring
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable int id) {
        Post post = postService.getPostById(id);
        if (post != null) {
            return ResponseEntity.ok(post);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/post")
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.getAllPosts();
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/posts/{category}")
    public ResponseEntity<List<Post>> getPostsByCategory(@PathVariable String category) {
        List<Post> posts = postService.getPostsByCategory(category);
        if (posts != null) {
            return ResponseEntity.ok(posts);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/post")
    public ResponseEntity<String> addPost(@RequestBody Post newPost) {
        postService.addPost(newPost);
        return ResponseEntity.ok("Post added successfully!");
    }

    @PutMapping("/post/{id}")
    public ResponseEntity<String> updatePost(@PathVariable int id, @RequestBody Post updatedPost) {
        if (postService.updatePost(id, updatedPost)) {
            return ResponseEntity.ok("Post updated successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<String> deletePost(@PathVariable int id) {
        if (postService.deletePost(id)) {
            return ResponseEntity.ok("Post deleted successfully!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
