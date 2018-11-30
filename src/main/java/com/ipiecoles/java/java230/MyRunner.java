package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Employe;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.ipiecoles.java.java230.repository.EmployeRepository;

@Component
public class MyRunner implements CommandLineRunner {


        @Autowired
        private EmployeRepository employeRepository;

        @Override
        public void run(String... strings) throws Exception {

            System.out.println("coucou");
            Employe e = employeRepository.findOne(4L);

            //Delete
            //employeRepository.delete(2521L);
            
            //Create
            Employe employe = new Employe("Doe","John","X6666", LocalDate.now(),);
            System.out.println(employe.getId());//Null
            employe = employeRepository.save(employe);
            System.out.println(employe.getId());
        }


    public static void print(Object t) {
        System.out.println(t);
    }
}
