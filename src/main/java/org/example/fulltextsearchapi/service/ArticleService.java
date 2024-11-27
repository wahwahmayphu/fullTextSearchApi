package org.example.fulltextsearchapi.service;

import org.example.fulltextsearchapi.entity.Article;

import java.util.List;
import java.util.UUID;

public interface ArticleService {

    List<Article> getAllArticles();
    Article getArticleById(UUID id);
    Article createArticle(Article article);
    Article updateArticle(UUID id,Article article);
    void deleteArticle(UUID id);
    List<Article> searchArticles(String searchText);
}
