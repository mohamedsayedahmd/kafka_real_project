package net.mic.springboot.repo;
import net.mic.springboot.entity.WikimediaData;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikimediaRepo extends CouchbaseRepository<WikimediaData,Long> {
}
