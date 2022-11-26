package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class Calculatrice {

    public int adittion(Integer a, Integer b){
        Integer resultat =  a + b;
        return resultat;
    }

    public int soustraction(Integer a, Integer b){
        Integer resultat =  a - b;
        return resultat;
    }

    public int multiplication(Integer a, Integer b){
        Integer resultat =  a * b;
        return resultat;
    }

}
