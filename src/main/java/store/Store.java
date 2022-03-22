package store;

import model.Candidate;
import model.Post;
import model.User;

import java.util.Collection;

public interface Store {

    Collection<Candidate> findAllCandidates();
    void saveCandidate(Candidate candidate);
    Candidate findCandidateById(int id);
    void deleteCandidate(Candidate candidate);

    Collection<Post> findAllPosts();
    void savePost(Post post);
    Post findPostById(int id);

    User findUserByMailPass(String email, String password);
    void saveUser(User user);

}
