package cn.igsdn.domain;

public class DocumentComment {
    private Integer id;

    private String content;

    private Boolean isIdentify;

    private Integer commentator;

    private Integer document;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getIsIdentify() {
        return isIdentify;
    }

    public void setIsIdentify(Boolean isIdentify) {
        this.isIdentify = isIdentify;
    }

    public Integer getCommentator() {
        return commentator;
    }

    public void setCommentator(Integer commentator) {
        this.commentator = commentator;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }
}