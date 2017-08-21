package learn.java.Patterns.behavioral.iterator;

public interface SocialNetwork {
    ProfileIterator getFriendsIterator(String profileEmail);

    ProfileIterator getCoworkersIterator(String profileEmail);
}
