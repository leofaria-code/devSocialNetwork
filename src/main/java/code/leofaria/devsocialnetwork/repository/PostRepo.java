package code.leofaria.devsocialnetwork.repository;

import code.leofaria.devsocialnetwork.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {}