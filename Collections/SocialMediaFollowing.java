import java.util.*;

public class SocialMediaFollowing {
    public static void main(String[] args) {
        HashSet<String> followers = new HashSet<>();

        followers.add("Alice");
        followers.add("Bob");
        followers.add("Charlie");
        followers.add("David");
        followers.add("Eve");

        System.out.println("Followers List (Using HashSet & Iterator):");
        Iterator<String> iterator = followers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> sortedFollowers = new TreeSet<>(followers);

        System.out.println("\nFollowers List Sorted (Using TreeSet & Iterator):");
        Iterator<String> treeIterator = sortedFollowers.iterator();
        while (treeIterator.hasNext()) {
            System.out.println(treeIterator.next());
        }

        System.out.println("\nRemoving a Follower ('Charlie') and Displaying Updated List:");
        sortedFollowers.remove("Charlie");
        for (String follower : sortedFollowers) {
            System.out.println(follower);
        }
    }
}

