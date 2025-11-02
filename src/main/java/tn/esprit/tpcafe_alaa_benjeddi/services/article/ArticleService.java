package tn.esprit.tpcafe_alaa_benjeddi.services.article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Article;
import tn.esprit.tpcafe_alaa_benjeddi.repositories.ArticleRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService implements IArticleServiceImpl {

    private final ArticleRepository articleRepository;

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> saveArticles(List<Article> articles) {
        return articleRepository.saveAll(articles);
    }

    @Override
    public Article selectArticleByIdWithGet(long id) {
        return articleRepository.findById(id).get(); // .get() as in your original
    }

    @Override
    public Article selectArticleByIdWithOrElse(long id) {
        return articleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Article> selectAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteArticleById(long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }

    @Override
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }

    @Override
    public long countingArticles() {
        return articleRepository.count();
    }

    @Override
    public boolean verifArticleById(long id) {
        return articleRepository.existsById(id);
    }
}