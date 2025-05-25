class User {
    protected ChatRoom mediator;
    protected String name;
    public User(ChatRoom mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public String getName() {
        return name; 
    }
    public void send(String message){
        mediator.sendMessage(message, this);
    }
}