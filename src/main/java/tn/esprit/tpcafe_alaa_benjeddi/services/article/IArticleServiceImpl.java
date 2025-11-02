package tn.esprit.tpcafe_alaa_benjeddi.services.article;

import tn.esprit.tpcafe_alaa_benjeddi.entities.Article;

import java.util.List;

public interface IArticleServiceImpl {

    Article addArticle(Article article);
    List<Article> saveArticles(List<Article> articles);
    Article selectArticleByIdWithGet(long id);
    Article selectArticleByIdWithOrElse(long id);
    List<Article> selectAllArticles();
    void deleteArticleById(long id);
    void deleteAllArticles();
    void deleteArticle(Article article);
    long countingArticles();
    boolean verifArticleById(long id);
}