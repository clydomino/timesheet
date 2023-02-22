package tn.esprit.TimeSheetSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.TimeSheetSpring.entity.Mission;

@Repository
public interface MissionRepository extends CrudRepository<Mission, Integer> {

}
