package repository;

import entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer>, JpaSpecificationExecutor {

//    List<Person> findByFirstName(String fname);
//
//      List<Person> findByLastName(String lname);
//
//    Optional<Person> findById(Integer id);

//    @Query("select firstName from Person where age =:age")
//    List<String> findFirstName(@Param("age") Integer age);

//    @Query("select firstName,lastName from Person where age =:age")
//    List<Object[]> findFirstNameAndLastName(@Param("age") Integer age);

//    @Query("select p from Person p where age =:age")
//    List<Person> getAllByAge(@Param("age") Integer age);


//    @Query("SELECT Count(*) from Person p where firstName =:firstName")
//    Integer countByFirstName(@Param("firstName") String firstName);

    List<Person> findByAgeOrderByIdDesc(Integer age);

//    List<Person> findByAge(Integer age);

//    List<Person> findAll(Sort sort);

//    Page<Person> findAll(Pageable pageable);

//    List<Person> findByFirstNameLike(String fname);


}
