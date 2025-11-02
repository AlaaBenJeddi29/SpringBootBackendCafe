package tn.esprit.tpcafe_alaa_benjeddi.restControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Article;
import tn.esprit.tpcafe_alaa_benjeddi.services.article.IArticleServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Article Catalog", description = "Manage coffee menu items, prices, and availability")
@RequestMapping("articles")
public class ArticleRestController {

    private IArticleServiceImpl articleService;

    @Operation(summary = "List All Articles", description = "Get full coffee menu.")
    @GetMapping
    public List<Article> selectAllArticles() {
        return articleService.selectAllArticles();
    }

    @Operation(summary = "Add Article", description = "Add new menu item (e.g., Latte).")
    @PostMapping
    public Article addArticle(@RequestBody Article article) {
        return articleService.addArticle(article);
    }

    @Operation(summary = "Bulk Import", description = "Import multiple articles.")
    @PostMapping("addArticles")
    public List<Article> saveArticles(@RequestBody List<Article> articles) {
        return articleService.saveArticles(articles);
    }

    @Operation(summary = "Get by ID (GET)", description = "Fetch using findById().get()")
    @GetMapping("selectById/{id}")
    public Article selectArticleByIdWithGet(@PathVariable long id) {
        return articleService.selectArticleByIdWithGet(id);
    }

    @Operation(summary = "Get by ID (orElse)", description = "Fetch with null fallback")
    @GetMapping("selectById2")
    public Article selectArticleByIdWithOrElse(@RequestParam long id) {
        return articleService.selectArticleByIdWithOrElse(id);
    }

    @Operation(summary = "Delete by ID", description = "Remove from menu.")
    @DeleteMapping("deleteById/{id}")
    public void deleteArticleById(@PathVariable long id) {
        articleService.deleteArticleById(id);
    }

    @Operation(summary = "Purge All", description = "Delete all articles.")
    @DeleteMapping("deleteAll")
    public void deleteAllArticles() {
        articleService.deleteAllArticles();
    }

    @Operation(summary = "Delete by Object", description = "Delete using full article object.")
    @DeleteMapping("delete")
    public void deleteArticle(@RequestBody Article article) {
        articleService.deleteArticle(article);
    }

    @Operation(summary = "Count", description = "Total number of articles.")
    @GetMapping("count")
    public long countingArticles() {
        return articleService.countingArticles();
    }

    @Operation(summary = "Exists?", description = "Check if article ID exists.")
    @GetMapping("verify/{id}")
    public boolean verifArticleById(@PathVariable long id) {
        return articleService.verifArticleById(id);
    }
}