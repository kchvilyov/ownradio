package kz.tanat.repository;

import kz.tanat.domain.Track;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Common Abstract Truck Repository Interface
 * All described here methods must work correctly for all SQL databases
 * or be implemented in extended interfaces
 * Warning! Use current implementation as common abstract interface only.
 *
 * Changed by Konstantin on 06.10.2016.
 */
@NoRepositoryBean
public interface TrackRepository extends JpaRepository<Track, String> {
    /**
     * Don't use this implementation
     * Warning! Implement it in each extended interface!
     */
    List<Track> getRandomTrackByUserId(@Param("userId") String userId, Pageable pageable);
}
