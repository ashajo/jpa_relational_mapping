package se.lexicon.jpa_relational_mapping.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.lexicon.jpa_relational_mapping.entity.Address;
import se.lexicon.jpa_relational_mapping.entity.Student;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest

public class StudentDaoTest {

  @Autowired
    StudentDao testObject;

  @BeforeEach
    public void setup() {

  }
  @Test
    @DisplayName("Test1 :Save Student")
public void Test1() {

      Address mainAdress = new Address();

   mainAdress.setProvince("kronoberg");
      mainAdress.setCity("Växjö");
      mainAdress.setStreet("Teleborg");
      mainAdress.setZipCode("3525");


      Student student = new Student();
      student.setFirstName("Asha");
      student.setLastName("Joseph");
      student.setEmail("ashajo@gmail.com");
      student.setBirthDate(LocalDate.parse("1982-03-10"));
      student.setRegisterDate(LocalDateTime.now());
      student.setAddress(mainAdress);

      testObject.save(student);

  }
}
