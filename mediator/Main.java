public class Main {
    public static void main(String[] args) {
        ChatRoom chat = new ChatRoom();
        User alice = new User(chat, "Alice");
        User bob = new User(chat, "Bob");
        alice.send("Hi Bob!");
        bob.send("Hey Alice!");
    }
}