package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {

    }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Não esquecer que não podemos ter o método set na lista, pois isso permitira
    // substituir a lista, fazendo somente o metodo add e remove

    public void addComment(Comment comment) {
        comments.add(comment);
    }// Adicionar comentário

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");// append significa acrescentar no final
        sb.append(likes);
        sb.append("Likes = ");
        sb.append(dtf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comment c : comments) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }

}
