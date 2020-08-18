package hr.databank.elbes.dao.repo;

import hr.databank.elbes.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleRepository extends JpaRepository<Article, Integer> {
}
