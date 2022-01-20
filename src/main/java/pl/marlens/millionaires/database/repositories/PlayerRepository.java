package pl.marlens.millionaires.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.marlens.millionaires.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
