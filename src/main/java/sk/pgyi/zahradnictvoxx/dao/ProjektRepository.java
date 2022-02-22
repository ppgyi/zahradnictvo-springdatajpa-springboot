package sk.pgyi.zahradnictvoxx.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sk.pgyi.zahradnictvoxx.entity.Projekt;

@RepositoryRestResource(collectionResourceRel = "projekt", path = "projekty")
public interface ProjektRepository extends JpaRepository<Projekt, Long> {
}
