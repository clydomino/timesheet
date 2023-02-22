package tn.esprit.TimeSheetSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.TimeSheetSpring.entity.TimeSheet;
import tn.esprit.TimeSheetSpring.entity.TimeSheetId;

@Repository
public interface TimeSheetRepository extends CrudRepository<TimeSheet, TimeSheetId>{

}
