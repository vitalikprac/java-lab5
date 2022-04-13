import java.time.LocalDateTime;
import java.util.Objects;

public class MessageForum {
    private final String author;
    private final String topic;
    protected String text;
    private final LocalDateTime createdAt;
    private LocalDateTime editedAt;

    public MessageForum(String author, String topic, String text, LocalDateTime createdAt) {
        this.author = author;
        this.topic = topic;
        this.text = text;
        this.createdAt = createdAt;
        this.editedAt = createdAt;
    }

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
