package basic;

class ChatUser extends Thread {
    private final String username;
    private final String[] messages = {
            "你好！", "有人在吗？", "今天天气真好！", "你们在聊什么？", "哈哈哈", "再见！"
    };

    public ChatUser(String username) {
        this.username = username;
    }

    public void run() {
        while (true) {
            int randomMsg = (int) (Math.random() * messages.length);
            System.out.println(username + ": " + messages[randomMsg]);
            try {
                Thread.sleep((int) (Math.random() * 2000));
            } catch (InterruptedException e) {
                break; // 退出循环
            }
        }
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        ChatUser user1 = new ChatUser("Alice");
        ChatUser user2 = new ChatUser("Bob");
        ChatUser user3 = new ChatUser("Charlie");

        user1.start();
        user2.start();
        user3.start();
    }
}
