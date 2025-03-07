public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService oldChat = new LegacyChatService();
        ChatService chat = new ChatServiceAdapter(oldChat);
        chat.sendMessage("Hello Chat from Adapter");
    }
}
