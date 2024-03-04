package structures;

import entities.User;
import entities.Video;

public interface ViTubeRepository {
    void registerUser(User user);

    void postVideo(Video video);

    boolean contains(User user);

    boolean contains(Video video);

    Iterable<Video> getVideos();

    void watchVideo(User user, Video video) throws IllegalArgumentException;

    void likeVideo(User user, Video video) throws IllegalArgumentException;

    void dislikeVideo(User user, Video video) throws IllegalArgumentException;

    Iterable<User> getPassiveUsers();

    Iterable<Video> getVideosOrderedByViewsThenByLikesThenByDislikes();

    Iterable<User> getUsersByActivityThenByName();
}
