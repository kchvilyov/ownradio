package kz.tanat.repository;

import kz.tanat.domain.Track;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * There is track repository implementation specified for Postgre SQL
 * Warning! Can be used for Postgre SQL only!
 *
 * Created by Konstantin on 06.10.2016.
 */
public interface PgTrackRepository extends TrackRepository {
    @Query("select t from Track t where t.uploadUserId = :userId order by random()")
    List<Track> getRandomTrackByUserId(@Param("userId") String userId, Pageable pageable);
}
