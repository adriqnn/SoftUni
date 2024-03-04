package structures;

import entities.User;
import entities.Video;

import java.util.*;
import java.util.stream.Collectors;

public class ViTubeRepositoryImpl implements ViTubeRepository {
    private Map<String, User> users;
    private Map<String, Video> videos;

    public ViTubeRepositoryImpl() {
        this.users = new LinkedHashMap<>();
        this.videos = new LinkedHashMap<>();
    }

    @Override
    public void registerUser(User user) {
        this.users.putIfAbsent(user.getId(), user);
    }

    @Override
    public void postVideo(Video video) {
        this.videos.putIfAbsent(video.getId(), video);
    }

    @Override
    public boolean contains(User user) {
        return this.users.containsKey(user.getId());
    }

    @Override
    public boolean contains(Video video) {
        return this.videos.containsKey(video.getId());
    }

    @Override
    public Iterable<Video> getVideos() {
        return this.videos.values();
    }

    @Override
    public void watchVideo(User user, Video video) throws IllegalArgumentException {
        if(!contains(user) || !contains(video)){
            throw new IllegalArgumentException();
        }

        video.setViews(video.getViews() + 1);
        user.setViews(user.getViews() + 1);
    }

    @Override
    public void likeVideo(User user, Video video) throws IllegalArgumentException {
        if(!contains(user) || !contains(video)){
            throw new IllegalArgumentException();
        }

        video.setLikes(video.getLikes() + 1);
        user.setLikes(user.getLikes() + 1);
    }

    @Override
    public void dislikeVideo(User user, Video video) throws IllegalArgumentException {
        if(!contains(user) || !contains(video)){
            throw new IllegalArgumentException();
        }

        video.setDislikes(video.getDislikes() + 1);
        user.setDislikes(user.getDislikes() + 1);
    }

    @Override
    public Iterable<User> getPassiveUsers() {
        return this.users.values().stream().filter(e -> e.getDislikes() == 0 && e.getLikes() == 0 && e.getViews() == 0).collect(Collectors.toList());
    }

    @Override
    public Iterable<Video> getVideosOrderedByViewsThenByLikesThenByDislikes() {
        return this.videos.values().stream().sorted((v1, v2) -> {
            int result = Integer.compare(v2.getViews(), v1.getViews());

            if(result == 0){
                result = Integer.compare(v2.getLikes(), v1.getLikes());

                if(result == 0){
                    result = Integer.compare(v1.getDislikes(), v2.getDislikes());
                }
            }

            return result;
        }).collect(Collectors.toList());
//        return this.videos.values().stream().sorted(Comparator.comparing(Video::getViews).reversed().thenComparing(Video::getLikes).reversed().thenComparing(Video::getDislikes)).collect(Collectors.toList());
    }

    @Override
    public Iterable<User> getUsersByActivityThenByName() {
        return this.users.values().stream().sorted((u1, u2) -> {
            int result = Integer.compare(u2.getViews(), u1.getViews());

            if(result == 0){
                result = Math.max(u2.getLikes(), u2.getDislikes()) - Math.max(u1.getLikes(), u1.getDislikes());
                if(result == 0){
                    result = u1.getUsername().compareTo(u2.getUsername());
                }
            }

            return result;
        }).collect(Collectors.toList());
//        return this.users.values().stream().sorted(Comparator.comparing(User::getViews).reversed().thenComparing(User::getLikes).reversed().thenComparing(e -> e.getLikes() + e.getDislikes())).collect(Collectors.toList());
    }
}
