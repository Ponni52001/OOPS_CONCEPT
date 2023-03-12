package com.atm_card_generator;

import java.util.ArrayList;
import java.util.Random;

public class GenerateAtmCard 
{
    static ArrayList<String> individualDetails = new ArrayList<>();
    public static ArrayList<String> generateAtmCard() 
    {

        Random randomNumbers = new Random();

        String cardNumber = generateCardNumber(randomNumbers);

        String cvv = generateCVV(randomNumbers);


        String validity = generateValidity(randomNumbers);

        String pin = generatePIN(randomNumbers);

        System.out.println("CardNumber: "+cardNumber);
        System.out.println("Pin: "+pin);
        System.out.println("validity: "+validity);
        System.out.println("CVV: "+cvv);
        ArrayList<String> lastThreeList = new ArrayList<>(individualDetails.subList(individualDetails.size() - 3, individualDetails.size()));
        return lastThreeList;
    }
        private static String generateCardNumber (Random random)
        {
            String cardNumber = "";
            for(int i=0;i<14;i++)
            {
                if(i==4||i==9)
                {
                    cardNumber=cardNumber+" " ;
                    continue;
                }
                int num = random.nextInt(10);
                cardNumber=cardNumber+num;

            }

            if(!individualDetails.contains(cardNumber))
            {
                individualDetails.add(cardNumber);
            } else{
                generateCardNumber(random);
            }
            return cardNumber;
        }

        private static String generatePIN (Random random)
        {
            String pin = "";
            for (int i = 0; i < 4; i++) {
                int num = random.nextInt(10);
                pin += num;
            }
            individualDetails.add(pin);
            return pin;
        }
        private static String generateValidity (Random random)
        {

            int month = random.nextInt(12) + 1;
            int year = random.nextInt(10) + 2023;
            return String.format("%02d/%d", month, year);
        }

        private static String generateCVV (Random random){
            String cvv = "";
            for (int i = 0; i < 3; i++) {
                int num = random.nextInt(10);
                cvv += num;
            }
            if(!individualDetails.contains(cvv))
            {
                individualDetails.add(cvv);
            } else{
                generateCVV(random);
            }
                return cvv;

        }

    }


