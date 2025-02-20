package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private LocalDate moment; 
    private String title;
    private String content;

    private List<Comment> comments = new ArrayList <>();

    public Post () {

    }

    public Post(LocalDate moment, String title, String content) {
        this.moment = moment;
        this.title = title;
        this.content = content;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
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

    public List<Comment> getComments() {
        return comments;
    }

    // Não esquecer que não podemos ter o método set na lista, pois isso permitira substituir a lista, fazendo somente o metodo add e remove

    public void addComment(Comment comment) {
        comments.add(comment);
    }//Adicionar comentário

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }//Remover comentário

    
}
