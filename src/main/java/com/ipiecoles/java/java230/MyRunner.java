package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Employe;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import com.ipiecoles.java.java230.repository.EmployeRepository;

import java.util.ArrayList;

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
           /* Employe employe = new Employe("Doe","John","X6666", LocalDate.now(),2000.0);
            System.out.println(employe.getId());//Null
            employe = employeRepository.save(employe);
            System.out.println(employe.getId());*/

           Iterable<Employe> employes =  employeRepository.findAll(new PageRequest(0,15, Sort.Direction.ASC,"dateEmbauche"));
            System.out.println("Nb employés : " + ((Page<Employe>) employes).getTotalElements());
            System.out.println("Nb pagess : " + ((Page<Employe>) employes).getTotalPages());
           for (Employe emp : employes) {
               System.out.println(emp);
           }
        }


    public static void print(Object t) {
        System.out.println(t);
    }
}
