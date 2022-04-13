import java.time.LocalDateTime;
import java.util.Objects;

public class MessageForum {
    /**
     * Властивість - автор
     **/
    private final String author;
    /**
     * Властивість - тема
     **/
    private final String topic;
    /**
     * Властивість - текст
     **/
    protected String text;
    /**
     * Властивість - час та дата створення
     **/
    private final LocalDateTime createdAt;
    /**
     * Властивість - час та дата редагування
     **/
    private LocalDateTime editedAt;

    /**
     * Створює новий об'єкт з заданими значеннями
     *
     * @param author - виробник
     * @param topic - тема
     * @param text - текс
     * @param createdAt - дата та час створення
     * @see MessageForum
     **/
    public MessageForum(String author, String topic, String text, LocalDateTime createdAt) {
        this.author = author;
        this.topic = topic;
        this.text = text;
        this.createdAt = createdAt;
        this.editedAt = createdAt;
    }


    /**
     * Редагування тексту
     *
     * @param newMessage - нове повідомлення
     * @param editedAt - дата та час редагування
     **/
    public void editText(String newMessage, LocalDateTime editedAt) {
        this.text = newMessage;
        this.editedAt = editedAt;
    }

    @Override
    public String toString() {
        return topic + " | " + text + " © " + author + ", (" + createdAt + ") edited (" + editedAt + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageForum that = (MessageForum) o;
        return Objects.equals(author, that.author) && Objects.equals(topic, that.topic) && Objects.equals(text, that.text) && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, topic, text, createdAt);
    }
}
