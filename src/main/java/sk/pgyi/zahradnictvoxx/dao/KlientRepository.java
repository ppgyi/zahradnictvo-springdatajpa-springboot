package sk.pgyi.zahradnictvoxx.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sk.pgyi.zahradnictvoxx.entity.Klient;

@RepositoryRestResource(collectionResourceRel = "klient", path = "klienti")
public interface KlientRepository extends JpaRepository<Klient, Long> {
}
