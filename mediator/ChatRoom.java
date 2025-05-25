class ChatRoom {
    public void sendMessage(String message, User sender) {
        System.out.println(sender.getName() + ": " + message);
    }
}
