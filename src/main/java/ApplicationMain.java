import configuration.ConfigurationClass;
import entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import repository.PersonRepository;

import javax.persistence.criteria.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ApplicationMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        PersonRepository repository = context.getBean(PersonRepository.class);

/*

        Specification<Person> personSpecification = new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                Path path = root.get("Id");
//                Predicate predicate = cb.gt(path,2);
//                return  predicate;

                Path path = root.get("Id");
//                Path path1= root.get("firstName");

//                Predicate predicate = cb.and(cb.equal(path1,"Divanshu 4"),cb.lt(path,7));
                Predicate predicate = cb.between(path,1,5);
                return  predicate;

            }
        };


        System.out.println(repository.findAll(personSpecification));
*/

//        List<Person> list = repository.findAll(new Sort(Sort.Direction.DESC,"age").and(
//                new Sort(Sort.Direction.ASC,"firstName")));
//
//        System.out.println(list);

        List<Person> stringList = repository.findByAgeOrderByIdDesc(25);
        System.out.println(stringList);

/*
        Page<Person> personPage= repository.findAll(new PageRequest(1,5,new Sort(Sort.Direction.DESC,"firstName")));
        List<Person> personList=personPage.getContent();
        System.out.println(personPage.getTotalElements());
        System.out.println(personPage.getTotalPages());
        System.out.println(personList);
*/

//        List<Person> likeFirst = repository.findByFirstNameLike("%__1");
//        System.out.println(likeFirst);


//        for(int i=1;i<=5;i++){
//
//            Person person = new Person("Divanshu "+i,"Rohatgi "+i,20000d,25);
//            repository.save(person);
//            System.out.println(person);
//        }


//        Optional<Person> person = repository.findById(3);
//        System.out.println(person);

//        Person person = repository.findById(4).get();
//        person.setAge(22);
//        repository.save(person);

//            repository.deleteById(4);


//        List<Person> first_name = repository.findByFirstName("Divanshu 1");
//        System.out.println(first_name);

//        List<Person> last_name = repository.findByLastName("Rohatgi 5");
//        System.out.println(last_name);

        /*Optional<Person> optionalPerson = repository.findById(1);
        if(optionalPerson.isPresent()){
            System.out.println(optionalPerson);
        }
        else {
            System.out.println("Not present");
        }*/


//        List<String> find_firstName = repository.findFirstName(25);
//        System.out.println(find_firstName);


//        List<Object[]> firstAndLast = repository.findFirstNameAndLastName(24);
//        System.out.println(firstAndLast);


//        List<Person> findperson = repository.getAllByAge(25);
//        System.out.println(findperson);

//        Integer countAge = repository.countByFirstName("Divanshu 1");
//        System.out.println(countAge);

    }
}
