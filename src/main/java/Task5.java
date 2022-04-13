import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 5.	Побудувати програму для роботи з класом для зберігання даних про повідомлення
 * в форумі (автор, тема, текст, час, дата створення та редагування).
 * Програма повинна забезпечувати функції введення, редагування, виведення значень.
 */

public class Task5 {
    public static void execute(String[] args) {
        var messageForumList = generateMessages();
        runCommands(messageForumList);
    }

    public static void printMenu() {
        System.out.println("[TASK5] ------------------");
        System.out.println("[TASK5] Forum: ");
        System.out.println("[TASK5]  q - exit");
        System.out.println("[TASK5]  a - add message");
        System.out.println("[TASK5]  p - print all");
        System.out.println("[TASK5]  e - edit message");
    }

    public static void runCommands(List<MessageForum> messageForumList) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            var action = scanner.nextLine().charAt(0);
            if (action == 'q') {
                return;
            } else if (action == 'a') {
                System.out.println("[TASK5] Type author");
                var author = scanner.nextLine();
                System.out.println("[TASK5] Type topic");
                var topic = scanner.nextLine();
                System.out.println("[TASK5] Type text");
                var text = scanner.nextLine();
                messageForumList.add(new MessageForum(author, topic, text, LocalDateTime.now()));
                System.out.println("[TASK5] Message added!");

            } else if (action == 'p') {
                printAllMessages(messageForumList);
            } else if (action == 'e') {
                System.out.println("[TASK5] Select message (id)");
                var id = Integer.parseInt(scanner.nextLine());
                System.out.println("[TASK5] Type new text");
                var newText = scanner.nextLine();
                var message = messageForumList.get(id - 1);
                message.editText(newText, LocalDateTime.now());
                System.out.println("[TASK5] Message modified!");
            }
        }

    }

    public static List<MessageForum> generateMessages() {
        List<MessageForum> messageForumList = new ArrayList<>();
        messageForumList.add(new MessageForum("Vitaliy Prachov", "Java", "Hello world",
                LocalDateTime.of(2022, 2, 20, 12, 35)));
        messageForumList.add(new MessageForum("John Doe", "Java", "Hello!",
                LocalDateTime.of(2022, 2, 20, 13, 40)));
        messageForumList.add(new MessageForum("Vitaliy Prachov", "Java", "How are you?",
                LocalDateTime.of(2022, 2, 20, 13, 55)));
        messageForumList.add(new MessageForum("John Doe", "Java", "I am fine and you?",
                LocalDateTime.of(2022, 2, 20, 14, 20)));
        messageForumList.add(new MessageForum("Vitaliy Prachov", "Java", "Okay!",
                LocalDateTime.of(2022, 2, 20, 15, 0)));
        return messageForumList;
    }

    public static void printAllMessages(List<MessageForum> messageForumList) {
        for (var i = 0; i < messageForumList.size(); i++) {
            System.out.println("[TASK5] Message [" + (i + 1) + "] " + messageForumList.get(i));
        }
    }


}